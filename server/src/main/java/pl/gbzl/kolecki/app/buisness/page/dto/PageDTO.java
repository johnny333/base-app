package pl.gbzl.kolecki.app.buisness.page.dto;

import lombok.*;
import pl.gbzl.kolecki.app.buisness.privilege.dto.PrivilegeDTO;

import java.util.List;

/**
 * Created by jakubkolecki on 11.09.2017.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO {
    private Long id;
    private String name;
    private String url;
    private String path;
    private Boolean active;
    private List<PrivilegeDTO> privileges;

}
