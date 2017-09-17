package pl.gbzl.kolecki.app.buisness.role.dto;

import lombok.*;
import pl.gbzl.kolecki.app.buisness.page.dto.PageDTO;

import java.util.List;

/**
 * Created by jakubkolecki on 11.09.2017.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {
    private Long id;
    private String name;
    private List<PageDTO> pages;
}
