package pl.gbzl.kolecki.app.buisness.page.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;

import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
public interface IPageBusinessService {
    PageDTO getPage(Long pageId);
    Collection<PageDTO> getPages();
    Page<PageDTO> getPages(Pageable pageable);
    PageDTO postPage(PageDTO pageDTO);
    PageDTO putPage(PageDTO pageDTO);
    PageDTO patchPage(PageDTO pageDTO);
    PageDTO deletePage(Long pageId);
}
