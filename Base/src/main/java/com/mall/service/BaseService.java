package com.mall.service;

import java.util.List;

public interface BaseService<T>{
    public List<T> query(T param);

    public Integer update(T param);

    public Integer delete(Long id);

    public Integer insert(T param);

    public T findById(Long id);
}
