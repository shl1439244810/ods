package com.shop.service;

import com.github.pagehelper.PageInfo;
import com.shop.bean.UserInfo;

/**
 * 用户信息 Service 接口
 */
public interface UserInfoService {

    /**
     * 模糊查询用户信息
     */
    PageInfo<UserInfo> getAllUserInfo(UserInfo userInfo, int limit, int page);

}
