package pl.gbzl.kolecki.app.data.role_page.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;
import pl.gbzl.kolecki.app.data.base.service.impl.BaseDataService;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;

import java.util.List;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Component
public class PageDTOtoRolePagesOBConverter extends Converter<PageDTO, RolePagesOB> {

    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<PageDTO> pageDTOBaseDataService;
    @Setter(onMethod = @__(@Autowired))
    private IConverter<PrivilegeDTO, PrivilegeOB> privilegeDTOtoOBConverter;
    @Setter(onMethod = @__(@Autowired))
    private IConverter<PageDTO, PageOB> pageDTOtoOBConverter;
    @Override
    public RolePagesOB convert(PageDTO pageDTO) {
        return RolePagesOB
                .builder()
                .basePage(this.pageDTOtoOBConverter.convert(this.pageDTOBaseDataService.getElement(pageDTO.getId())))
                .privileges(this.privilegeDTOtoOBConverter.convertList(pageDTO.getPrivileges()))
                .build();
    }
}
