package pl.gbzl.kolecki.app.data.privilege.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Component
public class PrivilegeDTOtoOBConverter extends Converter<PrivilegeDTO, PrivilegeOB> {

    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<PageDTO> pageDataService;
    @Setter(onMethod = @__(@Autowired))
    private IConverter<PageDTO, PageOB> pageDTOtoOBConverter;

    @Override
    public PrivilegeOB convert(PrivilegeDTO privilegeDTO) {
        return PrivilegeOB.builder()
                .active(privilegeDTO.getActive())
                .name(privilegeDTO.getName())
                .page(this.pageDTOtoOBConverter.convert(this.pageDataService.getElement(privilegeDTO.getPageId())))
                .build();
    }
}
