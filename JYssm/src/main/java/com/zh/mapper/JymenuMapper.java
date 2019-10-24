package com.zh.mapper;

import com.zh.model.Jymenu;
import org.springframework.stereotype.Repository;

@Repository
public interface JymenuMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Jymenu record);

    int insertSelective(Jymenu record);

    Jymenu selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Jymenu record);

    int updateByPrimaryKey(Jymenu record);
}