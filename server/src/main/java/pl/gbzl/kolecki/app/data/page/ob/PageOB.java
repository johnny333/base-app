package pl.gbzl.kolecki.app.data.page.ob;

import lombok.*;
import pl.gbzl.kolecki.app.data.base.ob.BaseOB;
import pl.gbzl.kolecki.app.data.privilege.ob.PrivilegeOB;

import javax.persistence.Entity;
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
@Table(name = "PAGES")
public class PageOB extends BaseOB {
    private String name;
    private String url;
    private String path;
    private Boolean active;
    @OneToMany
    private List<PrivilegeOB> privileges;
}
