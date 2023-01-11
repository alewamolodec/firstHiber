import Service.Service;
import dao.contactDao;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.getAllBooks();
        service.getGenreById(2);
        service.getAllAuthors();
        service.getAllGenres();
    }
}
