package com.zh.service.impl;

import com.zh.mapper.JyclassMapper;
import com.zh.model.Jyclass;
import com.zh.service.JyclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/22 22:28
 */
@Service
public class JyclassServiceImpl implements JyclassService {

    @Autowired
    private JyclassMapper jyclassMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return jyclassMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Jyclass record) {
        return jyclassMapper.insert(record);
    }

    @Override
    public int insertSelective(Jyclass record) {
        return insertSelective(record);
    }

    @Override
    public Jyclass selectByPrimaryKey(Integer cid) {
        return jyclassMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jyclass record) {
        return jyclassMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jyclass record) {
        return jyclassMapper.updateByPrimaryKey(record);
    }
}
