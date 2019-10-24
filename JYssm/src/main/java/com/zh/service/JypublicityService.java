package com.zh.service;

import com.zh.model.Jypublicity;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:28
 */
public interface JypublicityService {
    int deleteByPrimaryKey(Integer cid);

    int insert(Jypublicity record);

    int insertSelective(Jypublicity record);

    Jypublicity selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Jypublicity record);

    int updateByPrimaryKey(Jypublicity record);
}
