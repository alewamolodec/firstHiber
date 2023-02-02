package dao;

import config.HibernateUtil;
import model.Authors;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;

public class AuthorDaoImpl implements AuthorDao, CommonDAO<Authors> {
    private final SessionFactory sessionFactory;

    public AuthorDaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Authors getById(int id)  {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Authors authors = session.get(Authors.class, id);
            session.getTransaction().commit();
            session.getSessionFactory().close();
            return authors;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.getSessionFactory().close();
            return null;
        }
    }

    @Override
    public List<Authors> getAll() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            Query<Authors> authors = session.createQuery("from Authors", Authors.class);
            return authors.getResultList();
        }
    }

    @Override
    public boolean add(Authors a) {
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
    public boolean remove(Authors i) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.remove(i);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    @Override
    public Authors getByGenre(int id) {
        return null;
    }
}
