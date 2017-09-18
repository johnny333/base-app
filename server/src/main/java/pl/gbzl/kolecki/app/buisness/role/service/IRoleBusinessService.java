package pl.gbzl.kolecki.app.buisness.role.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;

import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
public interface IRoleBusinessService {
    RoleDTO getRole(Long roleId);
    Collection<RoleDTO> getRoles();
    Page<RoleDTO> getRoles(Pageable pageable);
    RoleDTO postRole(RoleDTO roleDTO);
    RoleDTO putRole(RoleDTO roleDTO);
    RoleDTO patchRole(RoleDTO roleDTO);
    RoleDTO deleteRole(Long roleId);
}
