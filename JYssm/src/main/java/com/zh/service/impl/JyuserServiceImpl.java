package com.zh.service.impl;

import com.zh.mapper.JyuserMapper;
import com.zh.model.Jyuser;
import com.zh.service.JyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:39
 */
@Service
public class JyuserServiceImpl implements JyuserService {

    @Autowired
    private JyuserMapper jyuserMapper;

    @Override
    public int deleteByPrimaryKey(String uid) {
        return jyuserMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(Jyuser record) {
        return jyuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Jyuser record) {
        return jyuserMapper.insertSelective(record);
    }

    @Override
    public Jyuser selectByPrimaryKey(String uid) {
        return jyuserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jyuser record) {
        return jyuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jyuser record) {
        return jyuserMapper.updateByPrimaryKey(record);
    }
}
