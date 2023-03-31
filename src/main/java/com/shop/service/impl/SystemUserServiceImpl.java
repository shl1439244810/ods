package com.shop.service.impl;

import com.shop.bean.SystemUser;
import com.shop.mapper.SystemUserMapper;
import com.shop.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * 系统用户服务接口实现类
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {

    /**
     * 注入系统用户管理接口
     */
    @Autowired
    private SystemUserMapper systemUserMapper;

    /**
     * 系统用户注册
     */
    @Override
    public Integer reg(SystemUser user) {
        return systemUserMapper.insert(user);
    }

    /**
     * 系统用户登录
     */
    @Override
    public SystemUser login(SystemUser user) {
        Example example = new Example(SystemUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", user.getUsername());
        criteria.andEqualTo("password", user.getPassword());
        return systemUserMapper.selectOneByExample(example);
    }

}
