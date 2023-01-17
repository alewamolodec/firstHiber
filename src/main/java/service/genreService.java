package service;


import model.Genre;

import java.util.List;

public interface genreService {
    public Genre getGenreById(int i);
    public List getAllGenres();
    public void addGenre(Genre g);
    public void removeGenre(int g);
}
