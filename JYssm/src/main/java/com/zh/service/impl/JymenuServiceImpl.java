package com.zh.service.impl;

import com.zh.mapper.JymenuMapper;
import com.zh.model.Jymenu;
import com.zh.service.JymenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:17
 */
@Service
public class JymenuServiceImpl implements JymenuService {

    @Autowired
    private JymenuMapper jymenuMapper;

    @Override
    public int deleteByPrimaryKey(Integer mid) {
        return jymenuMapper.deleteByPrimaryKey(mid);
    }

    @Override
    public int insert(Jymenu record) {
        return jymenuMapper.insert(record);
    }

    @Override
    public int insertSelective(Jymenu record) {
        return jymenuMapper.insertSelective(record);
    }

    @Override
    public Jymenu selectByPrimaryKey(Integer mid) {
        return jymenuMapper.selectByPrimaryKey(mid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jymenu record) {
        return jymenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jymenu record) {
        return updateByPrimaryKey(record);
    }
}
