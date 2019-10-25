package com.zh.service;

import com.zh.model.Jyuser;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:39
 */
public interface JyuserService {
    int deleteByPrimaryKey(String uid);

    int insert(Jyuser record);

    int insertSelective(Jyuser record);

    Jyuser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(Jyuser record);

    int updateByPrimaryKey(Jyuser record);

    Jyuser login(String uid, String upwd);
}
