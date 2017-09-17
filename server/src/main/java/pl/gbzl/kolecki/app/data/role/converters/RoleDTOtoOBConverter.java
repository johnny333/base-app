package pl.gbzl.kolecki.app.data.role.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;
import pl.gbzl.kolecki.app.data.role.ob.RoleOB;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Component
public class RoleDTOtoOBConverter extends Converter<RoleDTO, RoleOB> {

    @Setter(onMethod = @__(@Autowired))
    private IConverter<PageDTO, RolePagesOB> pageDTOtoRolePageOBConverter;
    @Override
    public RoleOB convert(RoleDTO roleDTO) {
        return RoleOB.builder()
                .name(roleDTO.getName())
                .pages(this.pageDTOtoRolePageOBConverter.convertList(roleDTO.getPages()))
                .build();
    }
}
