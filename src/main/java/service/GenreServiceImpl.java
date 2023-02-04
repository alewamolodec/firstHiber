package service;

import dao.GenreDaoImpl;
import model.Genre;
import util.StringFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenreServiceImpl implements GenreService {
    private GenreDaoImpl dao;

    public GenreServiceImpl(GenreDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Genre getGenreById(int i) {
        return (Genre) Optional.of(dao.getById(i)).orElseThrow(() -> new RuntimeException("такого автора нет"));
    }

    @Override
    public List<Genre> getAllGenres() {
        return Optional.ofNullable(dao.getAll()).orElse(new ArrayList<>());
    }

    @Override
    public void addGenre(Genre g) {
        g.setName(StringFormatter.strCheck(g.getName()));
        dao.add(g);
    }

    @Override
    public void removeGenre(Genre g) {
        dao.remove(g);
    }
}
