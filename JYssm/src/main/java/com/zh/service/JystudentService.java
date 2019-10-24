package com.zh.service;

import com.zh.model.Jystudent;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:37
 */
public interface JystudentService {
    int deleteByPrimaryKey(Integer sid);

    int insert(Jystudent record);

    int insertSelective(Jystudent record);

    Jystudent selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Jystudent record);

    int updateByPrimaryKey(Jystudent record);
}
