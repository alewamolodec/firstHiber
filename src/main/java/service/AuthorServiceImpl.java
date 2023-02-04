package service;

import dao.AuthorDao;
import dao.AuthorDaoImpl;
import dao.CommonDAO;
import dao.CommonDAOIml;
import model.Authors;
import util.StringFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorServiceImpl implements AuthorService {
    AuthorDaoImpl dao = new AuthorDaoImpl();


    @Override
    public Authors getAuthorById(int i) {
//        try{
//            Optional<Authors> t = Optional.of(dao.getAuthorById(i));
//            if(t.isPresent()){
//        return dao.getAuthorById(i);}
//        else {
//        return null;}
//        }
//        catch (Exception e){
//            System.out.println("такого автора нет");
//            return null;
//        }
        return Optional.ofNullable(dao.getById(i)).orElseThrow(() -> new RuntimeException("такого автора нет"));
    }

    @Override
    public List<Authors> getAllAuthors() {
        return Optional.ofNullable(dao.getAll()).orElse(new ArrayList<>());
    }

    @Override
    public void addAuthor(Authors a) {
        a.setFirstName(StringFormatter.strCheck(a.getFirstName()));
        a.setLastName(StringFormatter.strCheck(a.getLastName()));
        a.setMiddleName(StringFormatter.strCheck(a.getMiddleName()));
        dao.add(a);
    }

    @Override
    public void removeAuthor(Authors i) {
        dao.remove(i);
    }


}
