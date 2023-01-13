package service;


import model.Genre;

public interface genreService {
    public void getGenreById(int i);
    public void getAllGenres();
    public void addGenre(Genre g);
    public void removeGenre(Genre g);
}
