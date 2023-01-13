package service;

import model.Authors;
import model.Book;
import model.Genre;

public interface serviseimpl {
    public void getBookById(int i);
    public void getAuthorById(int i);
    public  void getGenreById(int i);
    public void getAllBooks();
    public void getAllAuthors();
    public void getAllGenres();
    public void addBook(Book b);
    public void addAuthors(Authors a);
    public void addGenre(Genre g);
    public void removeBook(Book b);
    public void removeAuthor(Authors a);
    public void removeGenre(Genre g);
}
