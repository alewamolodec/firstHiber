package service;

import dao.GenreDaoImpl;
import model.Genre;
import util.StringFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenreServiceImpl implements CommonService<Genre> {
    private GenreDaoImpl dao;

    public GenreServiceImpl(GenreDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Genre getById(int i) {
        return Optional.of(dao.getById(i)).orElseThrow(() -> new RuntimeException("такого автора нет"));
    }

    @Override
    public List<Genre> getAll() {
        return Optional.ofNullable(dao.getAll()).orElse(new ArrayList<>());
    }

    @Override
    public boolean add(Genre g) {
        g.setName(StringFormatter.strCheck(g.getName()));
        dao.add(g);
        return true;
    }

    @Override
    public boolean remove(Genre g) {
        dao.remove(g);
        return true;
    }

    @Override
    public boolean update(Genre id, String nS) {
        dao.update(id,nS);
        return true;
    }
}
