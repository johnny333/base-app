package pl.gbzl.kolecki.app.buisness.role_page.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.gbzl.kolecki.app.buisness.role_page.dto.RolePagesDTO;

import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
public interface IRolePageBusinessService {
    RolePagesDTO getRolePage(Long rolePageId);
    Collection<RolePagesDTO> getRolePages();
    Page<RolePagesDTO> getRolePages(Pageable pageable);
    RolePagesDTO postRolePage(RolePagesDTO rolePagesDTO);
    RolePagesDTO putRolePage(RolePagesDTO rolePagesDTO);
    RolePagesDTO patchRolePage(RolePagesDTO rolePagesDTO);
    RolePagesDTO deleteRolePage(Long rolePageId);
}
