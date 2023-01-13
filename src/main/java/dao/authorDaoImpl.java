package dao;

import config.hibernateUtil;
import model.Authors;
import org.hibernate.Session;

public class authorDaoImpl implements authorDao{
    @Override
    public void getAuthorById(int id) {
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.get(Authors.class, id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getAllAuthors() {
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.createQuery("from Authors",Authors.class);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean addAuthor(Authors a) {
        try (Session session = hibernateUtil.getSessionFactory().openSession()) {
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
        try (Session session = hibernateUtil.getSessionFactory().openSession()) {
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
