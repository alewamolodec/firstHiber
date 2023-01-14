package dao;

import config.HibernateUtil;
import model.Book;
import org.hibernate.Session;

import java.util.List;

public class BookDaoImpl implements bookDao{
    @Override
    public Book getBookById(int id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            return session.get(Book.class, id);
        }
    }

    @Override
    public List<Book> getAllBooks() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            return session.createQuery("from Book",Book.class).list();
        }
    }

    @Override
    public boolean addBook(Book b) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(b);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    @Override
    public boolean removeBook(Book b) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.remove(b);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
