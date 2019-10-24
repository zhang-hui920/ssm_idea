package com.zh.service.impl;

import com.zh.mapper.JyschoolMapper;
import com.zh.model.Jyschool;
import com.zh.service.JyschoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-10-2019/10/24 14:35
 */
@Service
public class JyschoolServiceImpl implements JyschoolService {

    @Autowired
    private JyschoolMapper jyschoolMapper;

    @Override
    public int insert(Jyschool record) {
        return jyschoolMapper.insert(record);
    }

    @Override
    public int insertSelective(Jyschool record) {
        return jyschoolMapper.insertSelective(record);
    }
}
