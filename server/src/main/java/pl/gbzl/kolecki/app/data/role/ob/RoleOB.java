package pl.gbzl.kolecki.app.data.role.ob;

import lombok.*;
import pl.gbzl.kolecki.app.data.base.ob.BaseOB;
import pl.gbzl.kolecki.app.data.role_page.ob.RolePagesOB;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Builder
@Entity
@Table(name = "ROLES")
public class RoleOB extends BaseOB {
    private String name;
    @OneToMany
    private List<RolePagesOB> pages;
}
