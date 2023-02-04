package dao;

import config.HibernateUtil;
import model.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;

public class GenreDaoImpl implements GenreDao, CommonDAO<Genre> {
    private final SessionFactory sessionFactory;

    public GenreDaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Genre getById(int id) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Genre genre = session.get(Genre.class, id);
            session.getTransaction().commit();
            session.getSessionFactory().close();
            return genre;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.getSessionFactory().close();
            return null;
        }
    }

    @Override
    public List<Genre> getAll() {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Query<Genre> genre = session.createQuery("from Genre", Genre.class);
            session.getTransaction().commit();
            session.getSessionFactory().close();
            return genre.getResultList();
        } catch(Exception e){
            session.getTransaction().rollback();
            session.getSessionFactory().close();
            return null;
        }
    }


    @Override
    public boolean add(Genre a) {
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
    public boolean remove(Genre i) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.remove(i);
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
    public Genre getByBook(int id) {
        return null;
    }
}
