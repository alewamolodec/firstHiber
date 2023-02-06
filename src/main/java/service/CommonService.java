package service;

import java.util.List;

public interface CommonService<T>  {
    T getById(int id);
    List<T> getAll();
    boolean add(T a);
    boolean remove(T a);
    boolean update(T id,String nS);
}
