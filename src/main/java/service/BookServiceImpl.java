package service;

import dao.BookDaoImpl;
import model.Book;
import util.StringFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements CommonService<Book> {
    private BookDaoImpl dao;

    public BookServiceImpl(BookDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Book getById(int i) {
        return Optional.of(dao.getById(i)).orElseThrow(() -> new RuntimeException("такой книги нет"));
    }

    @Override
    public List<Book> getAll() {
        return Optional.ofNullable(dao.getAll()).orElse(new ArrayList<>());
    }

    @Override
    public boolean add(Book b) {
        if (b.getYear() > 0 && b.getCountOfBooks() > 0) {
            b.setName(StringFormatter.strCheck(b.getName()));
            dao.add(b);
            return true;
        } else {
            b.setCountOfBooks(1);
            b.setYear(1);
            b.setName(StringFormatter.strCheck(b.getName()));
            dao.add(b);
            return false;
        }
    }


    @Override
    public boolean remove(Book i) {
        dao.remove(i);
        return true;
    }
}
