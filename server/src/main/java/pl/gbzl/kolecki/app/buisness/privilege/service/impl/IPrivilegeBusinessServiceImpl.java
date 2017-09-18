package pl.gbzl.kolecki.app.buisness.privilege.service.impl;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;
import pl.gbzl.kolecki.app.buisness.privilege.service.IPrivilegeBusinessService;
import pl.gbzl.kolecki.app.data.base.service.IBaseDataService;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by jakubkolecki on 18.09.2017.
 */
@Service
@Transactional
public class IPrivilegeBusinessServiceImpl implements IPrivilegeBusinessService {

    @Setter(onMethod = @__(@Autowired))
    private IBaseDataService<PrivilegeDTO> privilegeDataService;
    @Override
    public PrivilegeDTO getPrivilege(Long privilegeId) {
        return this.privilegeDataService.getElement(privilegeId);
    }

    @Override
    public Collection<PrivilegeDTO> getPrivileges() {
        return this.privilegeDataService.getElements();
    }

    @Override
    public Page<PrivilegeDTO> getPrivileges(Pageable pageable) {
        return this.privilegeDataService.getElements(pageable);
    }

    @Override
    public PrivilegeDTO postPrivilege(PrivilegeDTO privilegeDTO) {
        return this.privilegeDataService.postElement(privilegeDTO);
    }

    @Override
    public PrivilegeDTO putPrivilege(PrivilegeDTO privilegeDTO) {
        return this.privilegeDataService.putElement(privilegeDTO);
    }

    @Override
    public PrivilegeDTO patchPrivilege(PrivilegeDTO privilegeDTO) {
        return this.privilegeDataService.patchElement(privilegeDTO);
    }

    @Override
    public PrivilegeDTO deletePrivilege(Long privilegeId) {
        return this.privilegeDataService.deleteElement(privilegeId);
    }
}
