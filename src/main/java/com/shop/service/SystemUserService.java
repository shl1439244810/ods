package com.shop.service;

import com.shop.bean.SystemUser;

/**
 * 系统用户服务接口
 */
public interface SystemUserService {

    /**
     * 系统用户登录
     */
    SystemUser login(SystemUser user);

    /**
     * 系统用户注册
     */
    Integer reg(SystemUser user);

}
