package dao;

import model.Authors;
import model.Book;
import model.Genre;

public interface genreDao {
    public void getGenreById(int id);
    public void getAllGenres();
    public boolean addGenre(Genre g);
    public boolean removeGenre(Genre g);
}
