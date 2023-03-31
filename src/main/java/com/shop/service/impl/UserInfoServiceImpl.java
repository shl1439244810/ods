package com.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.bean.UserInfo;
import com.shop.mapper.UserInfoMapper;
import com.shop.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 用户信息 Service 接口实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    /**
     * 注入用户信息 Service 接口
     */
    @Autowired
    private UserInfoMapper UserInfoMapper;

    /**
     * 模糊查询用户信息
     */
    @Override
    public PageInfo<UserInfo> getAllUserInfo(UserInfo userInfo, int limit, int page) {
        PageHelper.startPage(page, limit);
        Example example = new Example(userInfo.getClass());
        example.setOrderByClause("user_id asc");
        List<UserInfo> list = UserInfoMapper.selectByExample(example);
        PageInfo<UserInfo> pageInfo = new PageInfo<UserInfo>(list);
        return pageInfo;
    }
}
