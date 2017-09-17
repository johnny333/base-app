package pl.gbzl.kolecki.app.data.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.gbzl.kolecki.app.buisness.user.dto.UserDTO;
import pl.gbzl.kolecki.app.data.base.service.impl.BaseDataService;
import pl.gbzl.kolecki.app.data.user.ob.UserOB;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Service
@Transactional
public class UserDataService extends BaseDataService<UserOB, UserDTO> {
}
