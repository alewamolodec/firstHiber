package dao;

import config.HibernateUtil;
import model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;

public class BookDaoImpl implements BookDao, CommonDAO<Book> {
    private final SessionFactory sessionFactory;

    public BookDaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Book getById(int id) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Book book = session.get(Book.class, id);
            session.getTransaction().commit();
            return book;
        }catch (Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    @Override
    public List<Book> getAll() {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Query<Book> books = session.createQuery("from Book",Book.class);
            session.getTransaction().commit();
            return books.getResultList();
        }catch (Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    @Override
    public boolean add(Book b) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.persist(b);
            session.getTransaction().commit();
            return true;
        } catch(Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean remove(Book i) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.remove(i);
            session.getTransaction().commit();
            return true;
        }
        catch(Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Book getByGenre(int id) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Book book = session.createQuery("from Book where genre_id = ? ",Book.class).getSingleResult();
            session.getTransaction().commit();
            return book;
        }catch (Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }
}
