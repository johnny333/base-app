package pl.gbzl.kolecki.app.data.base.service.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;

import javax.persistence.MappedSuperclass;
import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Transactional
@Slf4j
public abstract class BaseDataService<OB, DTO> implements IBaseDataService<DTO> {
    @Setter(onMethod = @__(@Autowired))
    private JpaRepository<OB, Long> repository;
    @Setter(onMethod = @__(@Autowired))
    private IConverter<OB, DTO> obToDtoConverter;
    @Setter(onMethod = @__(@Autowired))
    private IConverter<DTO, OB> dtoToOBConverter;

    @Override
    public DTO postElement(DTO element) {
        return this.obToDtoConverter.convert(this.repository.save(this.dtoToOBConverter.convert(element)));
    }

    @Override
    public DTO putElement(DTO element) {
        return this.obToDtoConverter.convert(this.repository.save(this.dtoToOBConverter.convert(element)));
    }

    @Override
    public DTO patchElement(DTO element) {
        return this.obToDtoConverter.convert(this.repository.save(this.dtoToOBConverter.convert(element)));
    }

    @Override
    public DTO deleteElement(Long elementId) {
        OB one = this.repository.findOne(elementId);
        this.repository.delete(one);
        return this.obToDtoConverter.convert(one);
    }

    @Override
    public DTO getElement(Long elementId) {
        return this.obToDtoConverter.convert(this.repository.findOne(elementId));
    }

    @Override
    public Collection<DTO> getElements() {
        return this.obToDtoConverter.convertList(this.repository.findAll());
    }

    @Override
    public Page<DTO> getPageOfElements(Pageable pageable) {
        return this.obToDtoConverter.convertPage(this.repository.findAll(pageable));
    }

    @Override
    public Class<?> getOBGenericType() {
        return ((OB)this).getClass();
    }
    
    @Override
    public Class<?> getDTOGenericType() {
        return ((DTO)this).getClass();
    }
}
