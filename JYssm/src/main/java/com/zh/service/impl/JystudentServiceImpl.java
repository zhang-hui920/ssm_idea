package com.zh.service.impl;

import com.zh.mapper.JystudentMapper;
import com.zh.model.Jystudent;
import com.zh.service.JystudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:37
 */
@Service
public class JystudentServiceImpl implements JystudentService {

    @Autowired
    private JystudentMapper jystudentMapper;

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return jystudentMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(Jystudent record) {
        return jystudentMapper.insert(record);
    }

    @Override
    public int insertSelective(Jystudent record) {
        return jystudentMapper.insertSelective(record);
    }

    @Override
    public Jystudent selectByPrimaryKey(Integer sid) {
        return jystudentMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jystudent record) {
        return jystudentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jystudent record) {
        return updateByPrimaryKey(record);
    }
}
