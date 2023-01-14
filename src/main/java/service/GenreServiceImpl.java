package service;

import dao.GenreDaoImpl;
import model.Genre;

import java.util.List;

public class GenreServiceImpl implements genreService {
    private GenreDaoImpl dao;

    public GenreServiceImpl(GenreDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Genre getGenreById(int i) {
        return dao.getGenreById(i);
    }

    @Override
    public List<Genre> getAllGenres() {
        return dao.getAllGenres();
    }

    @Override
    public void addGenre(Genre g) {
        dao.addGenre(g);
    }

    @Override
    public void removeGenre(Genre g) {
        dao.removeGenre(g);
    }
}
