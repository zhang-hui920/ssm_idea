package com.zh.mapper;

import com.zh.model.Jyuser;
import org.springframework.stereotype.Repository;

@Repository
public interface JyuserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(Jyuser record);

    int insertSelective(Jyuser record);

    Jyuser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(Jyuser record);

    int updateByPrimaryKey(Jyuser record);
}