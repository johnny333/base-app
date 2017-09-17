package pl.gbzl.kolecki.app.data.privilege.converters;

import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Component
public class PrivilegeOBtoDTOConverter extends Converter<PrivilegeOB, PrivilegeDTO> {
    @Override
    public PrivilegeDTO convert(PrivilegeOB privilegeOB) {
        return PrivilegeDTO.builder()
                .active(privilegeOB.getActive())
                .name(privilegeOB.getName())
                .pageId(privilegeOB.getId())
                .build();
    }
}
