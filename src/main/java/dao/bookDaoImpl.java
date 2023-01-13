package dao;

import config.hibernateUtil;
import model.Book;
import org.hibernate.Session;

public class bookDaoImpl implements bookDao{
    @Override
    public void getBookById(int id) {
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.get(Book.class, id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getAllBooks() {
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.createQuery("from Book",Book.class);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean addBook(Book b) {
        try (Session session = hibernateUtil.getSessionFactory().openSession()) {
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
        try (Session session = hibernateUtil.getSessionFactory().openSession()) {
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
