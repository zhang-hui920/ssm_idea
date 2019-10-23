package com.zh.service;

import com.zh.model.Jyclass;

/**
 * @author lenovo
 * @create 2019-10-2019/10/22 22:27
 */
public interface JyclassService {
    int deleteByPrimaryKey(Integer cid);

    int insert(Jyclass record);

    int insertSelective(Jyclass record);

    Jyclass selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Jyclass record);

    int updateByPrimaryKey(Jyclass record);
}
