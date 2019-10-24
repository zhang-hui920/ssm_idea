package com.zh.service.impl;

import com.zh.mapper.JypublicityMapper;
import com.zh.model.Jypublicity;
import com.zh.service.JypublicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:29
 */

@Service
public class JypublicityServiceImpl implements JypublicityService {

    @Autowired
    private JypublicityMapper jypublicityMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return jypublicityMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Jypublicity record) {
        return jypublicityMapper.insert(record);
    }

    @Override
    public int insertSelective(Jypublicity record) {
        return jypublicityMapper.insertSelective(record);
    }

    @Override
    public Jypublicity selectByPrimaryKey(Integer cid) {
        return jypublicityMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jypublicity record) {
        return jypublicityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jypublicity record) {
        return jypublicityMapper.updateByPrimaryKey(record);
    }
}
