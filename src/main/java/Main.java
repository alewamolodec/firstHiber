import dao.BookDaoImpl;
import dao.GenreDaoImpl;
import model.Authors;
import service.AuthorServiceImpl;
import service.BookServiceImpl;
import service.GenreServiceImpl;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        AuthorServiceImpl authorService = new AuthorServiceImpl();
        BookServiceImpl bookService = new BookServiceImpl(new BookDaoImpl());
        GenreServiceImpl genreService = new GenreServiceImpl(new GenreDaoImpl());

        Authors author = new Authors("Alex","Potanin","Millionerov",new Date(16-8-2000));

        authorService.getById(3);
        authorService.getAll();
        authorService.remove(author);


    }
}
