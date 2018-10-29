package com.andidz.authorithy.shiro;

import com.andidz.authorithy.domain.User;
import com.andidz.authorithy.service.RightResourceService;
import com.andidz.authorithy.service.UserRightRelationShipService;
import com.andidz.authorithy.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm {

    Boolean cachingEnabled=true;
    @Autowired
    UserService userService;
    @Autowired
    RightResourceService rightResourceService;
    @Autowired
    UserRightRelationShipService userRightRelationShipService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        User user  = (User)principals.getPrimaryPrincipal();
        Set<String> permissionSet = rightResourceService.findRightResorceByResourceId(userRightRelationShipService.findResourceIdByUserId(user.getId()));
        authorizationInfo.setStringPermissions(permissionSet);
        System.out.println("授权完毕");
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) {
        //获取基于用户名和密码的令牌
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String username = token.getUsername();
        User user = userService.findUserByUserName(username);//根据登陆名account从库中查询user对象
        if(user==null){throw new AuthenticationException("用户不存在");}
        System.out.println(user.getUsername() + "-------->" + user.getPassword());
        //进行认证，将正确数据给shiro处理
        //密码不用自己比对，AuthenticationInfo认证信息对象，一个接口，new他的实现类对象SimpleAuthenticationInfo
        /*	第一个参数随便放，可以放user对象，程序可在任意位置获取 放入的对象
         * 第二个参数必须放密码，
         * 第三个参数放 当前realm的名字，因为可能有多个realm*/
        AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
        //清之前的授权信息
        super.clearCachedAuthorizationInfo(authcInfo.getPrincipals());
        SecurityUtils.getSubject().getSession().setAttribute("login", user);
        return authcInfo;//返回给安全管理器，securityManager，由securityManager比对数据库查询出的密码和页面提交的密码
        //如果有问题，向上抛异常，一直抛到控制器
    }
}
