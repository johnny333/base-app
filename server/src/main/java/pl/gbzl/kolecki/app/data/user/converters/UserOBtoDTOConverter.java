package pl.gbzl.kolecki.app.data.user.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;
import pl.gbzl.kolecki.app.buisness.user.dto.UserDTO;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.role.ob.RoleOB;
import pl.gbzl.kolecki.app.data.user.ob.UserOB;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Component
public class UserOBtoDTOConverter extends Converter<UserOB, UserDTO> {

    @Setter(onMethod = @__(@Autowired))
    private IConverter<RoleOB,RoleDTO> roleOBtoDTOConverter;
    @Override
    public UserDTO convert(UserOB userOB) {
        return UserDTO.builder()
                .email(userOB.getEmail())
                .role(this.roleOBtoDTOConverter.convert(userOB.getRole()))
                .id(userOB.getId())
                .build();
    }
}
