package dao;

import config.hibernateUtil;
import model.Authors;
import model.Book;
import model.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class contactDao {

    public void getBookById(int id){
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.get(Book.class, id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
           e.printStackTrace();
        }
    }
    public void getAuthorById(int id){
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.get(Authors.class, id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getGenreById(int id){
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.get(Genre.class, id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getAllBooks(){
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.createQuery("from Book",Book.class);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getAllAuthors(){
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.createQuery("from Authors",Authors.class);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getAllGenres(){
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.createQuery("from Genre",Genre.class);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<Book> getBooks(){
        try(Session session = hibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("from Books",Book.class).list();
        }
    }

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
