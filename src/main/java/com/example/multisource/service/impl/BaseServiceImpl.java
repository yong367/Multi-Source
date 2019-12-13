package com.example.multisource.service.impl;

import com.example.multisource.service.BaseService;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {



    @Override
    public T queryById(Long id) {
        return null;
    }

    @Override
    public List<T> queryAll() {
        return null;
    }

    @Override
    public Integer queryCountByWhere(T t) {
        return null;
    }

    @Override
    public List<T> queryListByWhere(T t) {
        return null;
    }

    @Override
    public List<T> queryByPage(Integer page, Integer rows) {
        return null;
    }

    @Override
    public T queryOne(T t) {
        return null;
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void saveSelective(T t) {
    }

    @Override
    public void updateById(T t) {
    }

    @Override
    public void updateByIdSelective(T t) {
    }

    @Override
    public void deleteById(Long id) {
    }

    @Override
    public void deleteByIds(List<Object> ids) {
    }
}
