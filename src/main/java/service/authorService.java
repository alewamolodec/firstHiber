package service;

import model.Authors;
import model.Book;

import java.util.List;

public interface authorService {
    public Authors getAuthorById(int i);
    public List getAllAuthors();
    public void addAuthor(Authors a);
    public void removeAuthor(Authors i);
}
