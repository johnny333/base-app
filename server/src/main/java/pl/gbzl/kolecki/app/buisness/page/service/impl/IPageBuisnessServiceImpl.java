package pl.gbzl.kolecki.app.buisness.page.service.impl;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.page.service.IPageBusinessService;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
@Service
@Transactional
public class IPageBuisnessServiceImpl implements IPageBusinessService {
    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<PageDTO> pageDataService;

    @Override
    public PageDTO getPage(Long pageId) {
        return this.pageDataService.getElement(pageId);
    }

    @Override
    public Collection<PageDTO> getPages() {
        return this.pageDataService.getElements();
    }

    @Override
    public Page<PageDTO> getPages(Pageable pageable) {
        return this.pageDataService.getElements(pageable);
    }

    @Override
    public PageDTO postPage(PageDTO pageDTO) {
        return this.pageDataService.postElement(pageDTO);
    }

    @Override
    public PageDTO putPage(PageDTO pageDTO) {
        return this.pageDataService.putElement(pageDTO);
    }

    @Override
    public PageDTO patchPage(PageDTO pageDTO) {
        return this.pageDataService.patchElement(pageDTO);
    }

    @Override
    public PageDTO deletePage(Long pageId) {
        return this.pageDataService.deleteElement(pageId);
    }
}
