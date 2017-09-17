package pl.gbzl.kolecki.app.api;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;

import javax.validation.Valid;
import java.util.Collection;

/**
 * Created by jakubkolecki on 11.09.2017.
 */
@RestController
@RequestMapping(value = "/roles")
public class RoleRestController {

    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<RoleDTO> roleService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public RoleDTO getRole(@PathVariable("id") Long roleId) {
        return this.roleService.getElement(roleId);
    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Collection<RoleDTO> getRoles(){
        return this.roleService.getElements();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RoleDTO postRole(@RequestBody RoleDTO role) {
        return this.roleService.postElement(role);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RoleDTO putRole(@RequestBody @Valid RoleDTO role) {
        return this.roleService.putElement(role);
    }

    @RequestMapping(method = RequestMethod.PATCH, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RoleDTO patchRole(@RequestBody RoleDTO role) {
        return this.roleService.patchElement(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public RoleDTO deleteRole(@PathVariable("id") Long roleId) {
        return this.roleService.deleteElement(roleId);
    }
}
