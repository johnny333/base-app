package pl.gbzl.kolecki.app.api;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.buisness.privilege.service.IPrivilegeBusinessService;

import javax.validation.Valid;
import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by jakubkolecki on 18.09.2017.
 */

@RestController
@RequestMapping(value = "/privilege")
public class PrivilegeRestController {
    @Setter(onMethod = @__(@Autowired))
    private IPrivilegeBusinessService privilegeBusinessService;

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    public PrivilegeDTO getPage(@PathVariable("id") Long privilegeId) {
        return this.privilegeBusinessService.getPrivilege(privilegeId);
    }

    @RequestMapping(method = GET)
    @ResponseBody
    public Collection<PrivilegeDTO> getPages() {
        return this.privilegeBusinessService.getPrivileges();
    }

    @RequestMapping(method = POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public PrivilegeDTO postPage(@RequestBody PrivilegeDTO privilege) {
        return this.privilegeBusinessService.postPrivilege(privilege);
    }

    @RequestMapping(method = PUT, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public PrivilegeDTO putPage(@RequestBody @Valid PrivilegeDTO privilege) {
        return this.privilegeBusinessService.putPrivilege(privilege);
    }

    @RequestMapping(method = PATCH, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public PrivilegeDTO patchPage(@RequestBody PrivilegeDTO privilege) {
        return this.privilegeBusinessService.patchPrivilege(privilege);
    }

    @RequestMapping(value = "/{id}", method = DELETE)
    @ResponseBody
    public PrivilegeDTO deletePage(@PathVariable("id") Long privilegeId) {
        return this.privilegeBusinessService.deletePrivilege(privilegeId);
    }
}
