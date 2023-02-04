package service;


import model.Genre;
import java.util.List;

public interface GenreService {
    Genre getGenreById(int i);
    List getAllGenres();
    void addGenre(Genre g);
    void removeGenre(Genre g);
}
