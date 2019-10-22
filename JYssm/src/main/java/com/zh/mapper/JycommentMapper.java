package com.zh.mapper;

import com.zh.model.Jycomment;

public interface JycommentMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Jycomment record);

    int insertSelective(Jycomment record);

    Jycomment selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Jycomment record);

    int updateByPrimaryKey(Jycomment record);
}