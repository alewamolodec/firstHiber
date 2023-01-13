package service;

import model.Authors;
import model.Book;

public interface authorService {
    public void getAuthorById(int i);
    public void getAllAuthors();
    public void addAuthor(Authors a);
    public void removeAuthor(Authors a);
}
