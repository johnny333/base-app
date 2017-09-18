package pl.gbzl.kolecki.app.buisness.role_page.service.impl;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.role_page.dto.RolePagesDTO;
import pl.gbzl.kolecki.app.buisness.role_page.service.IRolePageBusinessService;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
@Service
@Transactional
public class IRolePageBusinessServiceImpl implements IRolePageBusinessService {
    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<RolePagesDTO> rolePagesDataService;

    @Override
    public RolePagesDTO getRolePage(Long rolePageId) {
        return this.rolePagesDataService.getElement(rolePageId);
    }

    @Override
    public Collection<RolePagesDTO> getRolePages() {
        return this.rolePagesDataService.getElements();
    }

    @Override
    public Page<RolePagesDTO> getRolePages(Pageable pageable) {
        return this.rolePagesDataService.getElements(pageable);
    }

    @Override
    public RolePagesDTO postRolePage(RolePagesDTO rolePagesDTO) {
        return this.rolePagesDataService.postElement(rolePagesDTO);
    }

    @Override
    public RolePagesDTO putRolePage(RolePagesDTO rolePagesDTO) {
        return this.rolePagesDataService.putElement(rolePagesDTO);
    }

    @Override
    public RolePagesDTO patchRolePage(RolePagesDTO rolePagesDTO) {
        return this.rolePagesDataService.patchElement(rolePagesDTO);
    }

    @Override
    public RolePagesDTO deleteRolePage(Long rolePageId) {
        return this.rolePagesDataService.deleteElement(rolePageId);
    }
}
