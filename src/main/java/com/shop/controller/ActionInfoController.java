package com.shop.controller;

import com.github.pagehelper.PageInfo;
import com.shop.bean.ActionInfo;
import com.shop.bean.ResultObject;
import com.shop.service.ActionInfoService;
import com.shop.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户行为信息 Controller
 */
@RequestMapping("/action_info")
@RestController
public class ActionInfoController {

    /**
     * 注入用户行为信息 Service 接口
     */
    @Autowired
    private ActionInfoService actionInfoService;

    /**
     * 模糊查询用户行为信息
     */
    @RequestMapping("/getAllActionInfo")
    public ResultObject<List<ActionInfo>> getAllActionInfo(ActionInfo actionInfo, @RequestParam("limit") int limit, @RequestParam("page") int page) {
        // 1.模糊查询用户行为信息
        PageInfo<ActionInfo> pageInfo = actionInfoService.getAllActionInfo(actionInfo, limit, page);
        // 2.统一返回
        ResultObject<List<ActionInfo>> rs = new ResultObject<List<ActionInfo>>();
        // 3.返回获取到的数据
        List<ActionInfo> list = pageInfo.getList();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

    /**
     * 用户画像
     */
    @RequestMapping("/getUserWordCloud")
    public ResultObject<Object> getUserWordCloud(@RequestParam("user_name") String user_name) {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.用户画像
        List dataList = actionInfoService.getUserWordCloud(user_name);
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

    /**
     * 获取用户标签
     */
    @RequestMapping("/getUserTag")
    public ResultObject<Object> getUserTag(@RequestParam("user_id") Integer user_id) {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.获取用户标签
        List dataList = actionInfoService.getUserTag(user_id);
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

    /**
     * 获取用户身份画像标签
     */
    @RequestMapping("/getUserTypeTag")
    public ResultObject<Object> getUserTypeTag(@RequestParam("user_id") Integer user_id) {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.获取用户身份画像标签
        List dataList = actionInfoService.getUserTypeTag(user_id);
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

}
