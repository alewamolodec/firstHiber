package service;

import dao.authorDaoImpl;
import model.Authors;

public class authorServiceImpl implements authorService {
    private authorDaoImpl dao;

    public authorServiceImpl(authorDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public void getAuthorById(int i) {
        dao.getAuthorById(i);
    }

    @Override
    public void getAllAuthors() {
        dao.getAllAuthors();
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
