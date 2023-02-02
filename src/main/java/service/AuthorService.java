package service;

import model.Authors;

import java.util.List;

public interface AuthorService {
    public Authors getAuthorById(int i);
    public List getAllAuthors();
    public void addAuthor(Authors a);
    public void removeAuthor(Authors i);
}
