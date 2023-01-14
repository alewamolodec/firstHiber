package dao;

import config.HibernateUtil;
import model.Authors;
import org.hibernate.Session;

import java.util.List;

public class AuthorDaoImpl implements authorDao{
    @Override
    public Authors getAuthorById(int id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            return session.get(Authors.class, id);
        }
    }

    @Override
    public List<Authors> getAllAuthors() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            return session.createQuery("from Authors",Authors.class).list();
        }
    }

    @Override
    public boolean addAuthor(Authors a) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(a);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    @Override
    public boolean removeAuthor(Authors a) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.remove(a);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
