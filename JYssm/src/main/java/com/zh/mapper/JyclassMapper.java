package com.zh.mapper;

import com.zh.model.Jyclass;

public interface JyclassMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Jyclass record);

    int insertSelective(Jyclass record);

    Jyclass selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Jyclass record);

    int updateByPrimaryKey(Jyclass record);
}