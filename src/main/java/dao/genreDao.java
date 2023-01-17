package dao;

import model.Authors;
import model.Book;
import model.Genre;

import java.util.List;

public interface genreDao {
    public Genre getGenreById(int id);
    public List getAllGenres();
    public boolean addGenre(Genre g);
    public boolean removeGenre(int g);
}
