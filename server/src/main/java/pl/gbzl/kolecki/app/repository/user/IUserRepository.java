package pl.gbzl.kolecki.app.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gbzl.kolecki.app.data.user.ob.UserOB;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Repository
public interface IUserRepository extends JpaRepository<UserOB, Long> {
}
