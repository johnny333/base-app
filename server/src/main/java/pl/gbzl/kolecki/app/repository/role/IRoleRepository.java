package pl.gbzl.kolecki.app.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gbzl.kolecki.app.data.role.ob.RoleOB;

/**
 * Created by jakubkolecki on 16.09.2017.
 */
@Repository
public interface IRoleRepository  extends JpaRepository<RoleOB, Long> {
}
