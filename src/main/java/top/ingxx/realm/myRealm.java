package top.ingxx.realm;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


public class myRealm extends AuthorizingRealm {
//    授权方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermission("test");

        // TODO: 2018/9/15 需要改成从数据库中查询
        return null;
    }

//    认证方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // TODO: 2018/9/15 需要改成从数据库中查询 
        //转换为UsernamePasswordToken
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //实体，数据库密码，类名
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(token.getUsername(), "123456", this.getName());
        return info;
    }
}
