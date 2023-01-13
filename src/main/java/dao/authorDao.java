package dao;

import model.Authors;
import model.Book;
import model.Genre;

public interface authorDao {
    public void getAuthorById(int id);
    public void getAllAuthors();
    public boolean addAuthor(Authors a);
    public boolean removeAuthor(Authors a);
}
