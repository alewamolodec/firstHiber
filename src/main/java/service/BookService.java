package service;

import model.Book;
import java.util.List;

public interface BookService {
    Book getBookById(int i);
    List getAllBooks();
    void addBook(Book b);
    void removeBook(Book i);

}
