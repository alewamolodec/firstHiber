package service;

import dao.bookDaoImpl;
import model.Book;

public class bookServiceImpl implements bookService {
    private bookDaoImpl dao;

    public bookServiceImpl(bookDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public void getBookById(int i) {
        dao.getBookById(i);
    }

    @Override
    public void getAllBooks() {
        dao.getAllBooks();
    }

    @Override
    public void addBook(Book b) {
        dao.addBook(b);
    }

    @Override
    public void removeBook(Book b) {
        dao.removeBook(b);
    }
}
