package dao;

import model.Authors;
import model.Book;
import model.Genre;

import java.util.List;

public interface authorDao {
    public Authors getAuthorById(int id);
    public List getAllAuthors();
    public boolean addAuthor(Authors a);
    public boolean removeAuthor(Authors a);
}
