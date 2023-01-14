import dao.AuthorDaoImpl;
import dao.BookDaoImpl;
import dao.GenreDaoImpl;
import service.BookServiceImpl;
import service.AuthorServiceImpl;
import service.GenreServiceImpl;
public class Main {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl(new BookDaoImpl());
        AuthorServiceImpl authorService = new AuthorServiceImpl(new AuthorDaoImpl());
        GenreServiceImpl genreService = new GenreServiceImpl(new GenreDaoImpl());
        bookService.getBookById(2);
    }
}
