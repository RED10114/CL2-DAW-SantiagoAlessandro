package pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.service;

import pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.dto.FilmDetailDto;
import pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.dto.FilmDto;
import pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.dto.FilmRegisterDto;
import pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.dto.FilmUpdateDto;
import pe.edu.i202223858.DAWI_SANTIAGO_DURAN_ALESSANDRO.entity.Language;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmUpdateDto getFilmUpdateById(int id);

    void updateFilm(FilmUpdateDto filmUpdateDto);

    void deleteFilm(int id);

    void registerNewFilm(FilmRegisterDto filmRegisterDto);

    List<Language> getAllLanguages();


}
