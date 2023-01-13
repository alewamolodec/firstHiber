package dao;

import model.Authors;
import model.Book;
import model.Genre;

public interface bookDao {
    public void getBookById(int id);
    public void getAllBooks();
    public boolean addBook(Book b);
    public boolean removeBook(Book b);
}
