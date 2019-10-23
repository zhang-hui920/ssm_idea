package com.zh.service;

import com.zh.model.Jyaffiche;

/**
 * @author lenovo
 * @create 2019-10-2019/10/22 21:58
 */
public interface JyafficheService {
    int deleteByPrimaryKey(Integer aid);

    int insert(Jyaffiche record);

    int insertSelective(Jyaffiche record);

    Jyaffiche selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Jyaffiche record);

    int updateByPrimaryKey(Jyaffiche record);
}
