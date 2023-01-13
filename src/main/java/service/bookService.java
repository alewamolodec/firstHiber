package service;

import model.Book;

public interface bookService {
    public void getBookById(int i);
    public void getAllBooks();
    public void addBook(Book b);
    public void removeBook(Book b);

}
