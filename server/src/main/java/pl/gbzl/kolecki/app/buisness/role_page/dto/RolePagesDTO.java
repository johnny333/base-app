package pl.gbzl.kolecki.app.buisness.role_page.dto;

import lombok.*;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;

import java.util.List;

/**
 * Created by jakubkolecki on 17.09.2017.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolePagesDTO {
    private Long id;
    private PageDTO basePage;
    private List<PrivilegeDTO> privileges;
}
