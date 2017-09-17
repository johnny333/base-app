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
public class RolePagesDTOtoOBConverter extends Converter<RolePagesDTO, RolePagesOB> {
    @Setter(onMethod = @__(@Autowired))
    private IConverter<PageDTO, PageOB> pageOBtoDTOConverter;
    @Setter(onMethod = @__(@Autowired))
    private IConverter<PrivilegeDTO, PrivilegeOB> privilegesOBtoDTOConverter;

    @Override
    public RolePagesOB convert(RolePagesDTO rolePagesOB) {

        RolePagesOB build = RolePagesOB.builder()
                .basePage(this.pageOBtoDTOConverter.convert(rolePagesOB.getBasePage()))
                .privileges(this.privilegesOBtoDTOConverter.convertList(rolePagesOB.getPrivileges()))
                .build();
        build.setId(rolePagesOB.getId());
        return build;
    }
}
