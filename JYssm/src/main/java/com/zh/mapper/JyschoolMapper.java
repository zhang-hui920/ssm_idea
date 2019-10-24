package com.zh.mapper;

import com.zh.model.Jyschool;
import org.springframework.stereotype.Repository;

@Repository
public interface JyschoolMapper {
    int insert(Jyschool record);

    int insertSelective(Jyschool record);
}