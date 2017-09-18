package pl.gbzl.kolecki.app.buisness.privilege.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;

import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
public interface IPrivilegeBusinessService {
    PrivilegeDTO getPrivilege(Long privilegeId);
    Collection<PrivilegeDTO> getPrivileges();
    Page<PrivilegeDTO> getPrivileges(Pageable pageable);
    PrivilegeDTO postPrivilege(PrivilegeDTO privilegeDTO);
    PrivilegeDTO putPrivilege(PrivilegeDTO privilegeDTO);
    PrivilegeDTO patchPrivilege(PrivilegeDTO privilegeDTO);
    PrivilegeDTO deletePrivilege(Long privilegeId);
}
