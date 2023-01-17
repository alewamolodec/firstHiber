package dao;

import model.Authors;
import model.Book;
import model.Genre;

import java.util.List;

public interface bookDao {
    public Book getBookById(int id);
    public List getAllBooks();
    public boolean addBook(Book b);
    public boolean removeBook(int i);
}
