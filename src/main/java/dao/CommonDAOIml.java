package dao;

import config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class CommonDAOIml<T> implements CommonDAO<T> {
    private final Class<T> clazz;
    private final SessionFactory sessionFactory;

    public CommonDAOIml() {
        this.clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public T getById(int id) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            T authors = session.get(clazz, id);
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
    public List<T> getAll() {
        return null;
    }

    @Override
    public boolean add(T a) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.persist(a);
            session.getTransaction().commit();
            session.getSessionFactory().close();
            return true;
        }
        catch(Exception e) {
            session.getTransaction().rollback();
            session.getSessionFactory().close();
            return false;
        }
    }

    @Override
    public boolean remove(T a) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.remove(a);
            session.getTransaction().commit();
            session.getSessionFactory().close();
            return true;
        }
        catch(Exception e) {
            session.getTransaction().rollback();
            session.getSessionFactory().close();
            return false;
        }
    }

    @Override
    public boolean update(T t, String nS) {
        Session session = sessionFactory.openSession();

        try{
            session.beginTransaction();
            session.update(t);
            session.getTransaction().commit();
            return true;
        }
        catch(Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }
}
