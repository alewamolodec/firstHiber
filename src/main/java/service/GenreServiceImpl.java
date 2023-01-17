package service;

import dao.GenreDaoImpl;
import model.Book;
import model.Genre;
import util.StringFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenreServiceImpl implements genreService {
    private GenreDaoImpl dao;

    public GenreServiceImpl(GenreDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public Genre getGenreById(int i) {
        try{
            Optional<Genre> g =Optional.of(dao.getGenreById(i));
            if(g.isPresent()){
                return dao.getGenreById(i);
            }else{
                return null;}}
        catch (Exception e){
            System.out.println("такого жанра нет, нате этот");
            return dao.getGenreById(1);
        }
    }

    @Override
    public List<Genre> getAllGenres() {
        return Optional.ofNullable(dao.getAllGenres()).orElse(new ArrayList<>());
    }

    @Override
    public void addGenre(Genre g) {
        g.setName(StringFormatter.strCheck(g.getName()));
        dao.addGenre(g);

    }

    @Override
    public void removeGenre(int g) {
        dao.removeGenre(g);
    }
}
