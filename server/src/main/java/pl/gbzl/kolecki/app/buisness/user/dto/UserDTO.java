package pl.gbzl.kolecki.app.buisness.user.dto;

import lombok.*;
import pl.gbzl.kolecki.app.buisness.role.dto.RoleDTO;

/**
 * Created by jakubkolecki on 11.09.2017.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String email;
    private RoleDTO role;
}
