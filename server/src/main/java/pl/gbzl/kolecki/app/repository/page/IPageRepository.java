package pl.gbzl.kolecki.app.repository.page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
@Repository
public interface IPageRepository extends JpaRepository<PageOB, Long> {
}
