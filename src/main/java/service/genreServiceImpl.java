package service;

import dao.genreDaoImpl;
import model.Genre;

public class genreServiceImpl implements genreService {
    private genreDaoImpl dao;

    public genreServiceImpl(genreDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public void getGenreById(int i) {
        dao.getGenreById(i);
    }

    @Override
    public void getAllGenres() {
        dao.getAllGenres();
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
