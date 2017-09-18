package pl.gbzl.kolecki.app.api;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.page.service.IPageBusinessService;

import javax.validation.Valid;
import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by jakubkolecki on 11.09.2017.
 */

@RestController
@RequestMapping(value = "/pages")
public class PageRestController {
    @Setter(onMethod = @__(@Autowired))
    private IPageBusinessService pageService;

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    public PageDTO getPage(@PathVariable("id") Long roleId) {
        return this.pageService.getPage(roleId);
    }

    @RequestMapping(method = GET)
    @ResponseBody
    public Collection<PageDTO> getPages() {
        return this.pageService.getPages();
    }

    @RequestMapping(method = POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public PageDTO postPage(@RequestBody PageDTO page) {
        return this.pageService.postPage(page);
    }

    @RequestMapping(method = PUT, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public PageDTO putPage(@RequestBody @Valid PageDTO page) {
        return this.pageService.putPage(page);
    }

    @RequestMapping(method = PATCH, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public PageDTO patchPage(@RequestBody PageDTO page) {
        return this.pageService.patchPage(page);
    }

    @RequestMapping(value = "/{id}", method = DELETE)
    @ResponseBody
    public PageDTO deletePage(@PathVariable("id") Long pageId) {
        return this.pageService.deletePage(pageId);
    }

}
