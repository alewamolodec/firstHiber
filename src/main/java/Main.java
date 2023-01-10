import Service.Service;
import dao.contactDao;

public class Main {
    public static void main(String[] args) {
        Service s = new Service(new contactDao());
        s.getAllBooks();
    }
}
