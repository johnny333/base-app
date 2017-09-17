package pl.gbzl.kolecki.app.data.role.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;
import pl.gbzl.kolecki.app.data.role.ob.RoleOB;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Component
public class RoleObtoDTOConverter extends Converter<RoleOB, RoleDTO> {

    @Setter(onMethod = @__(@Autowired))
    private IConverter<RolePagesOB, PageDTO> pageOBtoDTOConverter;

    @Override
    public RoleDTO convert(RoleOB roleOB) {
        return RoleDTO.builder()
                .name(roleOB.getName())
                .pages(this.pageOBtoDTOConverter.convertList(roleOB.getPages()))
                .build();
    }
}
