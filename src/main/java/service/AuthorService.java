package service;

import model.Authors;
import java.util.List;

public interface AuthorService {
    Authors getAuthorById(int i);
    List getAllAuthors();
    void addAuthor(Authors a);
    void removeAuthor(Authors i);
}
