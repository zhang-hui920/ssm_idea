package com.zh.service.impl;

import com.zh.model.Jyuser;
import com.zh.service.JyuserService;
import com.zh.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 毅哥哥
 * @site
 * @company
 * @create 2019-10-25 9:45
 */
public class JyuserServiceImplTest {

    private JyuserService jyuserService;
    private SqlSession sqlSession;

    @Test
    public void login() {
        Jyuser ly = jyuserService.login("ly", "123");
        System.out.println(ly.getAddress());
    }

    @Before
    public void setUp() throws Exception {
        JyuserServiceImpl jyuserServiceImpl = new JyuserServiceImpl();
        sqlSession = SessionUtil.openSession();
        this.jyuserService = jyuserServiceImpl;
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
    }

}