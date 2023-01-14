package service;

import dao.BookDaoImpl;
import model.Book;

import java.util.List;

public class BookServiceImpl implements bookService {
    private BookDaoImpl dao;

    public BookServiceImpl(BookDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Book getBookById(int i) {
        return dao.getBookById(i);
    }

    @Override
    public List<Book> getAllBooks() {
        return dao.getAllBooks();
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
