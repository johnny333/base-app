package pl.gbzl.kolecki.app.buisness.role.service.impl;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;
import pl.gbzl.kolecki.app.buisness.role.service.IRoleBusinessService;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
@Service
@Transactional
public class IRoleBuisnessServiceImpl implements IRoleBusinessService {

    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<RoleDTO> roleDataService;

    @Override
    public RoleDTO getRole(Long roleId) {
        return this.roleDataService.getElement(roleId);
    }

    @Override
    public Collection<RoleDTO> getRoles() {
        return this.roleDataService.getElements();
    }

    @Override
    public Page<RoleDTO> getRoles(Pageable pageable) {
        return this.roleDataService.getElements(pageable);
    }

    @Override
    public RoleDTO postRole(RoleDTO roleDTO) {
        return this.roleDataService.postElement(roleDTO);
    }

    @Override
    public RoleDTO putRole(RoleDTO roleDTO) {
        return this.roleDataService.putElement(roleDTO);
    }

    @Override
    public RoleDTO patchRole(RoleDTO roleDTO) {
        return this.roleDataService.patchElement(roleDTO);
    }

    @Override
    public RoleDTO deleteRole(Long roleId) {
        return this.roleDataService.deleteElement(roleId);
    }
}
