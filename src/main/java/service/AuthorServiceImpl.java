package service;

import dao.AuthorDaoImpl;
import model.Authors;

import java.util.List;

public class AuthorServiceImpl implements authorService {
    private AuthorDaoImpl dao;

    public AuthorServiceImpl(AuthorDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Authors getAuthorById(int i) {
        return dao.getAuthorById(i);
    }

    @Override
    public List<Authors> getAllAuthors() {
        return dao.getAllAuthors();
    }

    @Override
    public void addAuthor(Authors a) {
        dao.addAuthor(a);
    }

    @Override
    public void removeAuthor(Authors a) {
        dao.removeAuthor(a);
    }
}
