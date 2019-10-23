package com.zh.service.impl;

import com.zh.mapper.JyafficheMapper;
import com.zh.model.Jyaffiche;
import com.zh.service.JyafficheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/22 21:59
 */
@Service
public class JyafficheServiceImpl implements JyafficheService {

    @Autowired
    private JyafficheMapper jyafficheMapper;


    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return jyafficheMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(Jyaffiche record) {
        return jyafficheMapper.insert(record);
    }

    @Override
    public int insertSelective(Jyaffiche record) {
        return jyafficheMapper.insertSelective(record);
    }

    @Override
    public Jyaffiche selectByPrimaryKey(Integer aid) {
        return jyafficheMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jyaffiche record) {
        return jyafficheMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jyaffiche record) {
        return jyafficheMapper.updateByPrimaryKey(record);
    }
}
