package pl.gbzl.kolecki.app.data.role_page.service;

import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.data.base.service.impl.BaseDataService;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;

import javax.transaction.Transactional;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Service
@Transactional
public class RolePagesDataService extends BaseDataService<RolePagesOB,PageDTO> {
}
