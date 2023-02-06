package service;

import dao.CommonDAOIml;
import java.util.List;

public class CommonServiceImpl<T> implements CommonService<T>{
    protected CommonDAOIml<T>commonDAOIml;

    public CommonServiceImpl(CommonDAOIml<T> commonDAOIml) {
        this.commonDAOIml = commonDAOIml;
    }

    @Override
    public T getById(int id) {
        return commonDAOIml.getById(id);
    }

    @Override
    public List<T> getAll() {
        return commonDAOIml.getAll();
    }

    @Override
    public boolean add(T a) {
        return commonDAOIml.add(a);
    }

    @Override
    public boolean remove(T a) {
        return commonDAOIml.remove(a);
    }

    @Override
    public boolean update(T id, String nS) {
        return true;
    }
}
