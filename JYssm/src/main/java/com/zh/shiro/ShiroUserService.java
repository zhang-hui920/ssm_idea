package com.zh.shiro;

import java.util.Set;

/**
 * 用于shiro认证
 * @author tt
 * @create 2019-10-13 19:56
 */

public interface ShiroUserService {
    public ShiroUser queryByName(String uname);


    Set<String> getRolesByUserId(Integer uid);

    Set<String> getPersByUserId(Integer uid);

}
