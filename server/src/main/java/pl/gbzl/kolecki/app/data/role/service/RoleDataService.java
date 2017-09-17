package pl.gbzl.kolecki.app.data.role.service;

import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;
import pl.gbzl.kolecki.app.data.base.service.impl.BaseDataService;
import pl.gbzl.kolecki.app.data.role.ob.RoleOB;

import javax.transaction.Transactional;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Service
@Transactional
public class RoleDataService extends BaseDataService<RoleOB,RoleDTO>  {
}
