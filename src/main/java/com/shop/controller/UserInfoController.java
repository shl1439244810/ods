package com.shop.controller;

import com.github.pagehelper.PageInfo;
import com.shop.bean.UserInfo;
import com.shop.bean.ResultObject;
import com.shop.service.UserInfoService;
import com.shop.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息 Controller
 */
@RequestMapping("/user_info")
@RestController
public class UserInfoController {

    /**
     * 注入用户信息 Service 接口
     */
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 模糊查询用户信息
     */
    @RequestMapping("/getAllUserInfo")
    public ResultObject<List<UserInfo>> getAllUserInfo(UserInfo UserInfo, @RequestParam("limit") int limit, @RequestParam("page") int page) {
        // 1.模糊查询用户信息
        PageInfo<UserInfo> pageInfo = userInfoService.getAllUserInfo(UserInfo, limit, page);
        // 2.统一返回
        ResultObject<List<UserInfo>> rs = new ResultObject<List<UserInfo>>();
        // 3.返回获取到的数据
        List<UserInfo> list = pageInfo.getList();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

}
