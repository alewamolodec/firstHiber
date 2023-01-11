import dao.contactDao;
import service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(new contactDao());
        service.getAllBooks();
        service.getGenreById(2);
        service.getAllAuthors();
        service.getAllGenres();
    }
}
