package com.zh.service.impl;

import com.zh.mapper.JycommentMapper;
import com.zh.model.Jycomment;
import com.zh.service.JycommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:13
 */
@Service
public class JycommentServiceImpl implements JycommentService {

    @Autowired
    private JycommentMapper jycommentMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return jycommentMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Jycomment record) {
        return jycommentMapper.insert(record);
    }

    @Override
    public int insertSelective(Jycomment record) {
        return insertSelective(record);
    }

    @Override
    public Jycomment selectByPrimaryKey(Integer cid) {
        return jycommentMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Jycomment record) {
        return jycommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jycomment record) {
        return jycommentMapper.updateByPrimaryKey(record);
    }
}
