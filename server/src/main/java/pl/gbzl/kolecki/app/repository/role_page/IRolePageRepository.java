package pl.gbzl.kolecki.app.repository.role_page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Repository
public interface IRolePageRepository extends JpaRepository<RolePagesOB, Long>{
}
