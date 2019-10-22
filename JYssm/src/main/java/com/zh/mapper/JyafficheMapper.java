package com.zh.mapper;

import com.zh.model.Jyaffiche;

public interface JyafficheMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Jyaffiche record);

    int insertSelective(Jyaffiche record);

    Jyaffiche selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Jyaffiche record);

    int updateByPrimaryKey(Jyaffiche record);
}