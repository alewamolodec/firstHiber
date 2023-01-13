package dao;

import config.hibernateUtil;
import model.Genre;
import org.hibernate.Session;

public class genreDaoImpl implements genreDao{
    @Override
    public void getGenreById(int id) {
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.get(Genre.class, id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getAllGenres() {
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.createQuery("from Genre",Genre.class);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean addGenre(Genre g) {
        try (Session session = hibernateUtil.getSessionFactory().openSession()) {
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
    public boolean removeGenre(Genre g) {
        try (Session session = hibernateUtil.getSessionFactory().openSession()) {
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
