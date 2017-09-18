package pl.gbzl.kolecki.app.buisness.user.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.gbzl.kolecki.app.buisness.user.dto.UserDTO;

import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
public interface IUserBusinessService {
    UserDTO getUser(Long userId);
    Collection<UserDTO> getUsers();
    Page<UserDTO> getUsers(Pageable pageable);
    UserDTO postUser(UserDTO user);
    UserDTO putUser(UserDTO user);
    UserDTO patchUser(UserDTO user);
    UserDTO deleteUser(Long userId);
}
