package Service;

import dao.contactDao;
import model.Authors;
import model.Book;
import model.Genre;

public class Service {
    private static contactDao dao;

    public Service(contactDao dao) {
        this.dao = dao;
    }

    public static contactDao getDao() {
        return dao;
    }

    public  void setDao(contactDao dao) {
        this.dao = dao;
    }

    public static void getBookById(int i){
        getDao().getBookById(i);
    }
    public static void getAuthorById(int i){
        getDao().getAuthorById(i);
    }
    public static void getGenreById(int i){
        getDao().getGenreById(i);
    }
    public static void getAllBooks(){
        getDao().getAllBooks();
    }
    public static void getAllAuthors(){
        getDao().getAllAuthors();
    }
    public static void getAllGenres(){
        getDao().getAllGenres();
    }
    public static void addBook(Book b){
        getDao().addBook(b);
    }
    public static void addAuthors(Authors a){
        getDao().addAuthor(a);
    }
    public static void addGenre(Genre g){
        getDao().addGenre(g);
    }
    public static void removeBook(Book b){
        getDao().removeBook(b);
    }
    public static void removeAuthor(Authors a){
        getDao().removeAuthor(a);
    }
    public static void removeGenre(Genre g){
        getDao().removeGenre(g);
    }
}
