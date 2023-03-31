package com.shop.service;

import com.github.pagehelper.PageInfo;
import com.shop.bean.ActionInfo;

import java.util.List;

/**
 * 用户行为信息 Service 接口
 */
public interface ActionInfoService {

    /**
     * 模糊查询用户行为信息
     */
    PageInfo<ActionInfo> getAllActionInfo(ActionInfo actionInfo, int limit, int page);

    /**
     * 用户画像
     */
    List<Integer> getUserWordCloud(String user_name);

    /**
     * 获取用户标签
     */
    List<Integer> getUserTag(Integer user_id);

    /**
     * 获取用户身份画像标签
     */
    List<Integer> getUserTypeTag(Integer user_id);
}
