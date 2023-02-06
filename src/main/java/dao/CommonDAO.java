package dao;

import model.Authors;

import java.util.List;

public interface CommonDAO<T> {
    T getById(int id);
    List<T> getAll();
    boolean add(T a);
    boolean remove(T a);
    boolean update(T t, String nS);
}
