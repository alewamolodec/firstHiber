package dao;

import model.Book;

public interface BookDao {
    Book getByGenre(int id);
}
