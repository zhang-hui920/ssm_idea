package com.zh.service;

import com.zh.model.Jycomment;
import org.springframework.stereotype.Repository;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:13
 */
public interface JycommentService {
    int deleteByPrimaryKey(Integer cid);

    int insert(Jycomment record);

    int insertSelective(Jycomment record);

    Jycomment selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Jycomment record);

    int updateByPrimaryKey(Jycomment record);
}
