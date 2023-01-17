package service;

import model.Book;

import java.util.List;

public interface bookService {
    public Book getBookById(int i);
    public List getAllBooks();
    public void addBook(Book b);
    public void removeBook(int i);

}
