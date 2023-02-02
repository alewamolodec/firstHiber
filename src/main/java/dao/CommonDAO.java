package dao;

import model.Authors;

import java.util.List;

public interface CommonDAO<T> {
    T getById(int id);
    List<T> getAll();
    boolean add(Authors a);
    boolean remove(Authors a);
}
