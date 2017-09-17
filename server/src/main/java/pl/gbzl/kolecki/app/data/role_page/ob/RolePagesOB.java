package pl.gbzl.kolecki.app.data.role_page.ob;

import lombok.*;
import pl.gbzl.kolecki.app.data.base.ob.BaseOB;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "ROLE_PAGES")
public class RolePagesOB extends BaseOB{
    @ManyToOne
    private PageOB basePage;
    @OneToMany
    private List<PrivilegeOB> privileges;


}
