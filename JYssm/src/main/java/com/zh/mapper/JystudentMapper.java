package com.zh.mapper;

import com.zh.model.Jystudent;
import org.springframework.stereotype.Repository;

@Repository
public interface JystudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Jystudent record);

    int insertSelective(Jystudent record);

    Jystudent selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Jystudent record);

    int updateByPrimaryKey(Jystudent record);
}