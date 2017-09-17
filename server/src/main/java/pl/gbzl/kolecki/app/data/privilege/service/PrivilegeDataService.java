package pl.gbzl.kolecki.app.data.privilege.service;

import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.data.base.service.impl.BaseDataService;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;

import javax.transaction.Transactional;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Service
@Transactional
public class PrivilegeDataService extends BaseDataService<PrivilegeOB, PrivilegeDTO> {
}
