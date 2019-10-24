package com.zh.service;

import com.zh.model.Jymenu;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:16
 */
public interface JymenuService {
    int deleteByPrimaryKey(Integer mid);

    int insert(Jymenu record);

    int insertSelective(Jymenu record);

    Jymenu selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Jymenu record);

    int updateByPrimaryKey(Jymenu record);
}
