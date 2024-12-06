package pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.entity;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryPk {
    private Integer film_id;
    private Integer category_id;
}
