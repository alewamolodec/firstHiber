import dao.authorDaoImpl;
import dao.bookDaoImpl;
import dao.genreDaoImpl;
import service.bookServiceImpl;
import service.authorServiceImpl;
import service.genreServiceImpl;
public class Main {
    public static void main(String[] args) {
        bookServiceImpl bookService = new bookServiceImpl(new bookDaoImpl());
        authorServiceImpl authorService = new authorServiceImpl(new authorDaoImpl());
        genreServiceImpl genreService = new genreServiceImpl(new genreDaoImpl());
        bookService.getBookById(2);
    }
}
