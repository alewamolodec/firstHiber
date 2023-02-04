package dao;

import model.Genre;

public interface GenreDao {
    Genre getByBook(int id);
}
