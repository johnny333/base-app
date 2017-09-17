package pl.gbzl.kolecki.app.data.role_page.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.buisness.role_page.dto.RolePagesDTO;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Component
public class RolePagesOBtoDTOConverter extends Converter<RolePagesOB, RolePagesDTO> {
    @Setter(onMethod = @__(@Autowired))
    private IConverter<PageOB, PageDTO> pageOBtoDTOConverter;
    @Setter(onMethod = @__(@Autowired))
    private IConverter<PrivilegeOB, PrivilegeDTO> privilegesOBtoDTOConverter;

    @Override
    public RolePagesDTO convert(RolePagesOB rolePagesOB) {
        return RolePagesDTO.builder()
                .basePage(this.pageOBtoDTOConverter.convert(rolePagesOB.getBasePage()))
                .id(rolePagesOB.getId())
                .privileges(this.privilegesOBtoDTOConverter.convertList(rolePagesOB.getPrivileges()))
                .build();
    }
}
