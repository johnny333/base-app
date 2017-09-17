package pl.gbzl.kolecki.app.data.user.ob;

import lombok.*;
import pl.gbzl.kolecki.app.data.base.ob.BaseOB;
import pl.gbzl.kolecki.app.data.role.ob.RoleOB;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "USERS")
public class UserOB extends BaseOB {
    private String email;
    @ManyToOne
    private RoleOB role;
}
