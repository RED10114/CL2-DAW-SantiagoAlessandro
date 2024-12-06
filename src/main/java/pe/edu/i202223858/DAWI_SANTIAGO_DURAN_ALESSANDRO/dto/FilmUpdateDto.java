package pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.dto;

import java.util.Date;

public record FilmUpdateDto(Integer filmId,
                            String title,
                            String description,
                            Integer releaseYear,
                            Integer rentalDuration,
                            Double rentalRate,
                            Integer length,
                            Double replacementCost,
                            String rating,
                            String specialFeatures,
                            Date lastUpdate) {
}
