package pl.gbzl.kolecki.app.data.page.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Component
public class PageOBtoDTOConverter  extends Converter<PageOB, PageDTO>{
    @Setter(onMethod = @__(@Autowired))
    private Converter<PrivilegeOB, PrivilegeDTO> privilegeOBtoDTOConverter;

    @Override
    public PageDTO convert(PageOB pageDTO) {
        return PageDTO.builder()
                .active(pageDTO.getActive())
                .name(pageDTO.getName())
                .path(pageDTO.getPath())
                .privileges(this.privilegeOBtoDTOConverter.convertList(pageDTO.getPrivileges()))
                .url(pageDTO.getUrl())
                .build();
    }
}
