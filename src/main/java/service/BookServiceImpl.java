package service;

import dao.BookDaoImpl;
import model.Book;
import util.StringFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {
    private BookDaoImpl dao;

    public BookServiceImpl(BookDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Book getBookById(int i) {
        return (Book) Optional.of(dao.getById(i)).orElseThrow(() -> new RuntimeException("такой книги нет"));
    }

    @Override
    public List<Book> getAllBooks() {
        return Optional.ofNullable(dao.getAll()).orElse(new ArrayList<>());
    }

    @Override
    public void addBook(Book b) {
        if(b.getYear()>0&&b.getCountOfBooks()>0){
        b.setName(StringFormatter.strCheck(b.getName()));
        dao.add(b);}
        else {
            b.setCountOfBooks(1);
            b.setYear(1);
            b.setName(StringFormatter.strCheck(b.getName()));
            dao.add(b);}
        }


    @Override
    public void removeBook(Book i) {
        dao.remove(i);
    }
}
