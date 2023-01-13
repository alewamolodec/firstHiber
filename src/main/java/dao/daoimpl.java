package dao;

import model.Authors;
import model.Book;
import model.Genre;

public interface daoimpl {
    public void getBookById(int id);
    public void getAuthorById(int id);
    public void getGenreById(int id);
    public void getAllBooks();
    public void getAllAuthors();
    public void getAllGenres();
    public boolean addBook(Book b);
    public boolean addAuthor(Authors a);
    public boolean addGenre(Genre g);
    public boolean removeBook(Book b);
    public boolean removeAuthor(Authors a);
    public boolean removeGenre(Genre g);

}
