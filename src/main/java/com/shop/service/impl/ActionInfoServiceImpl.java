package com.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.util.StringUtils;
import com.shop.bean.ActionInfo;
import com.shop.mapper.ActionInfoMapper;
import com.shop.service.ActionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 用户行为信息 Service 接口实现类
 */
@Service
public class ActionInfoServiceImpl implements ActionInfoService {

    /**
     * 注入用户行为信息 Service 接口
     */
    @Autowired
    private ActionInfoMapper actionInfoMapper;

    /**
     * 模糊查询用户行为信息
     */
    @Override
    public PageInfo<ActionInfo> getAllActionInfo(ActionInfo actionInfo, int limit, int page) {
        PageHelper.startPage(page, limit);
        Example example = new Example(actionInfo.getClass());
        Example.Criteria criteria = example.createCriteria();
        if (actionInfo.getUser_id() != null) {
            criteria.andLike("user_id", "%" + actionInfo.getUser_id() + "%");
        }
        if (!StringUtils.isNullOrEmpty(actionInfo.getProduct_type())) {
            criteria.andEqualTo("product_type", actionInfo.getProduct_type());
        }
        if (!StringUtils.isNullOrEmpty(actionInfo.getAction())) {
            criteria.andEqualTo("action", actionInfo.getAction());
        }
        example.setOrderByClause("action_time asc");
        List<ActionInfo> list = actionInfoMapper.selectByExample(example);
        PageInfo<ActionInfo> pageInfo = new PageInfo<ActionInfo>(list);
        return pageInfo;
    }

    /**
     * 用户画像
     */
    @Override
    public List getUserWordCloud(String user_name) {
        return actionInfoMapper.getUserWordCloud(user_name);
    }

    /**
     * 获取用户标签
     */
    @Override
    public List getUserTag(Integer user_id) {
        return actionInfoMapper.getUserTag(user_id);
    }

    /**
     * 获取用户身份画像标签
     */
    @Override
    public List getUserTypeTag(Integer user_id) {
        return actionInfoMapper.getUserTypeTag(user_id);
    }
}
