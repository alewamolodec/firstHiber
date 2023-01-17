import dao.AuthorDaoImpl;
import dao.BookDaoImpl;
import dao.GenreDaoImpl;
import model.Authors;
import service.BookServiceImpl;
import service.AuthorServiceImpl;
import service.GenreServiceImpl;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        AuthorServiceImpl authorService = new AuthorServiceImpl(new AuthorDaoImpl());

        Authors authors = new Authors("Петр","Я","Молк",new Date(1964-06-30));


        authorService.removeAuthor(authorService.getAuthorById(7));
    }
}
