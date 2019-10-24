package com.zh.mapper;

import com.zh.model.Jypublicity;
import org.springframework.stereotype.Repository;

@Repository
public interface JypublicityMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Jypublicity record);

    int insertSelective(Jypublicity record);

    Jypublicity selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Jypublicity record);

    int updateByPrimaryKey(Jypublicity record);
}