package pl.gbzl.kolecki.app.api;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.gbzl.kolecki.app.buisness.user.dto.UserDTO;
import pl.gbzl.kolecki.app.buisness.user.service.IUserBusinessService;

import javax.validation.Valid;
import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
@RestController
@RequestMapping(value = "/users")
public class UserRestController {
    @Setter(onMethod = @__(@Autowired))
    private IUserBusinessService userService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserDTO getUser(@PathVariable("id") Long userId) {
        return this.userService.getUser(userId);
    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Collection<UserDTO> getUsers(){
        return this.userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public UserDTO postUser(@RequestBody UserDTO user) {
        return this.userService.postUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public UserDTO putUser(@RequestBody @Valid UserDTO user) {
        return this.userService.putUser(user);
    }

    @RequestMapping(method = RequestMethod.PATCH, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public UserDTO patchUser(@RequestBody UserDTO user) {
        return this.userService.patchUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public UserDTO deleteUser(@PathVariable("id") Long userId) {
        return this.userService.deleteUser(userId);
    }
}
