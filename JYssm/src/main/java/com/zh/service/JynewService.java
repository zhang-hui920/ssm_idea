package com.zh.service;

import com.zh.model.Jynew;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:21
 */
public interface JynewService {
    int deleteByPrimaryKey(Integer nid);

    int insert(Jynew record);

    int insertSelective(Jynew record);

    Jynew selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Jynew record);

    int updateByPrimaryKey(Jynew record);
}
