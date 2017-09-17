package pl.gbzl.kolecki.app.buisness.privilege.dto;

import lombok.*;

/**
 * Created by jakubkolecki on 11.09.2017.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrivilegeDTO {
    private Long id;
    private Long pageId;
    private String name;
    private Boolean active;
}
