package service;

import dao.BookDaoImpl;
import model.Book;
import util.StringFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements bookService {
    private BookDaoImpl dao;

    public BookServiceImpl(BookDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Book getBookById(int i) {
        try{
            Optional<Book> b =Optional.of(dao.getBookById(i));
            if(b.isPresent()){
                return dao.getBookById(i);
            }else{
                return null;
            }
        }catch (Exception e){
            System.out.println("no book");
            return null;
        }

    }

    @Override
    public List<Book> getAllBooks() {
        return Optional.ofNullable(dao.getAllBooks()).orElse(new ArrayList<>());
    }

    @Override
    public void addBook(Book b) {
        if(b.getYear()>0&&b.getCountOfBooks()>0){
        b.setName(StringFormatter.strCheck(b.getName()));
        dao.addBook(b);}
        else {
            b.setCountOfBooks(1);
            b.setYear(1);
            b.setName(StringFormatter.strCheck(b.getName()));
            dao.addBook(b);}
        }


    @Override
    public void removeBook(int i) {
        dao.removeBook(i);
    }
}
