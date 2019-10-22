package com.zh.mapper;

import com.zh.model.Jynew;

public interface JynewMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(Jynew record);

    int insertSelective(Jynew record);

    Jynew selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Jynew record);

    int updateByPrimaryKey(Jynew record);
}