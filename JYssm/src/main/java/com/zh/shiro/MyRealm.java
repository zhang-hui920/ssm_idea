package com.zh.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.Set;
/**
 * @author lenovo
 * @create 2019-10-2019/10/22 10:34
 */
public class MyRealm extends AuthorizingRealm {
    private ShiroUserService shiroUserService;

    public ShiroUserService getShiroUserService() {
        return shiroUserService;
    }

    public void setShiroUserService(ShiroUserService shiroUserService) {
        this.shiroUserService = shiroUserService;
    }

    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 认证
     *
     * 认证的过程
     * 1、数据源(ini)现在数据库
     * 2、doGetAuthenticationInfo将数据库的用户信息给subject主体做shiro认证
     *  2.1、需要在当前realm中调用service来验证，当前用户是覅有在数据库中存在
     *  2.2、盐加密
     *
     * @param token   从jsp传递过来的用户名密码组成的一个token对象
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName = token.getPrincipal().toString();
        String pwd = token.getCredentials().toString();
        ShiroUser shiroUser = this.shiroUserService.queryByName(userName);
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                shiroUser.getUsername(),
                shiroUser.getPassword(),
                ByteSource.Util.bytes(shiroUser.getSalt()),
                this.getName()
        );
        return info;
    }
}

