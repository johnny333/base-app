package pl.gbzl.kolecki.app.data.role_page.converters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;
import pl.gbzl.kolecki.app.data.base.converter.impl.Converter;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Component
public class RolePagesOBtoPageDTOConverter  extends Converter<RolePagesOB, PageDTO> {

    @Setter(onMethod = @__(@Autowired))
    private IConverter<PageOB,PageDTO> pageOBtoDTOConverter;
    @Override
    public PageDTO convert(RolePagesOB rolePagesOB) {
        return this.pageOBtoDTOConverter.convert(rolePagesOB.getBasePage());
    }
}
