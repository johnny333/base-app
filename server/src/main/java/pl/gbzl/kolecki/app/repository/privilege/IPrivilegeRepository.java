package pl.gbzl.kolecki.app.repository.privilege;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Repository
public interface IPrivilegeRepository extends JpaRepository<PrivilegeOB, Long> {
}
