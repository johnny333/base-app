package pl.gbzl.kolecki.app.buisness.user.service.impl;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.user.dto.UserDTO;
import pl.gbzl.kolecki.app.buisness.user.service.IUserBusinessService;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
@Service
@Transactional
public class IUserBusinessServiceImpl implements IUserBusinessService {
    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<UserDTO> userDataService;

    @Override
    public UserDTO getUser(Long userId) {
        return this.userDataService.getElement(userId);
    }

    @Override
    public Collection<UserDTO> getUsers() {
        return this.userDataService.getElements();
    }

    @Override
    public Page<UserDTO> getUsers(Pageable pageable) {
        return this.userDataService.getElements(pageable);
    }

    @Override
    public UserDTO postUser(UserDTO user) {
        return this.userDataService.postElement(user);
    }

    @Override
    public UserDTO putUser(UserDTO user) {
        return this.userDataService.putElement(user);
    }

    @Override
    public UserDTO patchUser(UserDTO user) {
        return this.userDataService.patchElement(user);
    }

    @Override
    public UserDTO deleteUser(Long userId) {
        return this.userDataService.deleteElement(userId);
    }
}
