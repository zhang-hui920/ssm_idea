package com.zh.service.impl;

import com.zh.mapper.JynewMapper;
import com.zh.model.Jynew;
import com.zh.service.JynewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:22
 */
@Service
public class JynewServiceImpl implements JynewService {

    @Autowired
    private JynewMapper jynewMapper;

    @Override
    public int deleteByPrimaryKey(Integer nid) {
        return jynewMapper.deleteByPrimaryKey(nid);
    }

    @Override
    public int insert(Jynew record) {
        return jynewMapper.insert(record);
    }

    @Override
    public int insertSelective(Jynew record) {
        return jynewMapper.insertSelective(record);
    }

    @Override
    public Jynew selectByPrimaryKey(Integer nid) {
        return jynewMapper.selectByPrimaryKey(nid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jynew record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jynew record) {
        return jynewMapper.updateByPrimaryKey(record);
    }
}
