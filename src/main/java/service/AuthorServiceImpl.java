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
    private final AuthorDao dao;
    private final CommonDAO commonDAO;

    public AuthorServiceImpl(AuthorDaoImpl dao) {
        this.dao = dao;
        this.commonDAO = new CommonDAOIml<Authors>();
    }

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
        return (Authors) Optional.of(commonDAO.getById(i)).orElseThrow(() -> new RuntimeException("такого автора нет"));
    }

    @Override
    public List<Authors> getAllAuthors() {
        return null;
    }

    @Override
    public void addAuthor(Authors a) {
        a.setFirstName(StringFormatter.strCheck(a.getFirstName()));
        a.setLastName(StringFormatter.strCheck(a.getLastName()));
        a.setMiddleName(StringFormatter.strCheck(a.getMiddleName()));
        commonDAO.add(a);
    }

    @Override
    public void removeAuthor(Authors i) {
        commonDAO.remove(i);
    }


}
