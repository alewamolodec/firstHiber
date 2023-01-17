package service;

import dao.AuthorDaoImpl;
import model.Authors;
import util.StringFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class AuthorServiceImpl implements authorService {
    private AuthorDaoImpl dao;

    public AuthorServiceImpl(AuthorDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Authors getAuthorById(int i) {
        try{
            Optional<Authors> t = Optional.of(dao.getAuthorById(i));
            if(t.isPresent()){
        return dao.getAuthorById(i);}
        else {
        return null;}
        }
        catch (Exception e){
            System.out.println("такого автора нет");
            return null;
        }
    }

    @Override
    public List<Authors> getAllAuthors() {
        return Optional.ofNullable(dao.getAllAuthors()).orElse(new ArrayList<>());
    }

    @Override
    public void addAuthor(Authors a) {
        a.setFirstName(StringFormatter.strCheck(a.getFirstName()));
        a.setLastName(StringFormatter.strCheck(a.getLastName()));
        a.setMiddleName(StringFormatter.strCheck(a.getMiddleName()));
        dao.addAuthor(a);
    }

    @Override
    public void removeAuthor(Authors i) {
        dao.removeAuthor(i);
    }


}
