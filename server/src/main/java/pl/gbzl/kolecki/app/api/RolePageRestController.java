package pl.gbzl.kolecki.app.api;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.gbzl.kolecki.app.buisness.role_page.dto.RolePagesDTO;
import pl.gbzl.kolecki.app.buisness.role_page.service.IRolePageBusinessService;

import javax.validation.Valid;
import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */

@RestController
@RequestMapping(value = "/role_pages")
public class RolePageRestController {
    @Setter(onMethod = @__(@Autowired))
    private IRolePageBusinessService rolePageService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public RolePagesDTO getRole(@PathVariable("id") Long rolePageId) {
        return this.rolePageService.getRolePage(rolePageId);
    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Collection<RolePagesDTO> getRoles(){
        return this.rolePageService.getRolePages();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RolePagesDTO postRole(@RequestBody RolePagesDTO rolePage) {
        return this.rolePageService.postRolePage(rolePage);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RolePagesDTO putRole(@RequestBody @Valid RolePagesDTO rolePage) {
        return this.rolePageService.putRolePage(rolePage);
    }

    @RequestMapping(method = RequestMethod.PATCH, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RolePagesDTO patchRole(@RequestBody RolePagesDTO rolePage) {
        return this.rolePageService.patchRolePage(rolePage);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public RolePagesDTO deleteRole(@PathVariable("id") Long rolePageId) {
        return this.rolePageService.deleteRolePage(rolePageId);
    }
}
