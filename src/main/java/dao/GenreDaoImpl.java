package dao;

import config.HibernateUtil;
import model.Genre;
import org.hibernate.Session;

import java.util.List;

public class GenreDaoImpl implements genreDao{
    @Override
    public Genre getGenreById(int id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
           return session.get(Genre.class, id);
        }
    }

    @Override
    public List<Genre> getAllGenres() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            return session.createQuery("from Genre",Genre.class).list();
        }
    }

    @Override
    public boolean addGenre(Genre g) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(g);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    @Override
    public boolean removeGenre(int g) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.remove(g);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
