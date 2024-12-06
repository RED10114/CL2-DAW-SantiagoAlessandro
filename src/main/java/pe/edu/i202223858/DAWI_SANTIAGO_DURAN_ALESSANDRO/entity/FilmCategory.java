package pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "film_category")
public class FilmCategory {
    @EmbeddedId
    private CategoryPk categoryPk;
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "film_id")
    @MapsId("film_id")
    private Film film;
}
