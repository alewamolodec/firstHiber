package dao;

import model.Authors;

public interface AuthorDao {
    Authors getByGenre(int id);
}
