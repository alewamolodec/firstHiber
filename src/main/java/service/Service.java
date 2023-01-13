package service;

import dao.contactDao;
import model.Authors;
import model.Book;
import model.Genre;

public class Service implements serviseimpl{
    private contactDao dao;

    public Service(){
    }

    public contactDao getDao() {
        return dao;
    }

    public void setDao(contactDao dao) {
        this.dao = dao;
    }

    public Service(contactDao dao) {
        this.dao = dao;
    }

    public void getBookById(int i){

        dao.getBookById(i);
    }
    public void getAuthorById(int i){

        dao.getAuthorById(i);
    }
    public  void getGenreById(int i){

        dao.getGenreById(i);
    }
    public void getAllBooks(){

        dao.getAllBooks();
    }
    public void getAllAuthors(){

        dao.getAllAuthors();
    }
    public void getAllGenres(){

        dao.getAllGenres();
    }
    public void addBook(Book b){
        dao.addBook(b);
    }
    public void addAuthors(Authors a){
        dao.addAuthor(a);
    }
    public void addGenre(Genre g){

        dao.addGenre(g);
    }
    public void removeBook(Book b){

        dao.removeBook(b);
    }
    public void removeAuthor(Authors a){

        dao.removeAuthor(a);
    }
    public void removeGenre(Genre g){
        dao.removeGenre(g);
    }
}
