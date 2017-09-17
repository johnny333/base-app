package pl.gbzl.kolecki.app.data.base.ob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
@MappedSuperclass
@SequenceGenerator(
        name = "SEQUENCE",
        sequenceName = "SEQ"
)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BaseOB {
    @Id
    @Column(
            name = "ID",
            updatable = false
    )
    @GeneratedValue
    private Long id;

}
