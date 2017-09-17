package pl.gbzl.kolecki.app.data.privilege.ob;

import lombok.*;
import pl.gbzl.kolecki.app.data.base.ob.BaseOB;
import pl.gbzl.kolecki.app.data.page.ob.PageOB;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "PRIVILEGES")
public class PrivilegeOB extends BaseOB {
    @ManyToOne(fetch = FetchType.LAZY)
    private PageOB page;
    private String name;
    private Boolean active;
}
