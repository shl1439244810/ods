package com.shop.mapper;

import com.shop.bean.ActionInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 用户行为信息 Mapper接口
 */
public interface ActionInfoMapper extends Mapper<ActionInfo> {

    /**
     * 用户画像
     */
    @Select("select pwi.product_word,count(1) as counts \n" +
            "from action_info ai inner join product_word_info pwi on ai.product_id = pwi.product_id \n" +
            "where ai.user_name = #{usern_ame}\n" +
            "group by pwi.product_word")
    List<Map<String, Integer>> getUserWordCloud(String user_name);

    /**
     * 获取用户标签
     */
    @Select("select user_age_flag,user_wage_flag,tuc.user_sale_type,tut.user_time_type \n" +
            "from user_info ui \n" +
            "inner join tag_user_consumption tuc on ui.user_id = tuc.user_id \n" +
            "inner join tag_user_time tut on ui.user_id = tut.user_id \n" +
            "where ui.user_id = #{user_id}\n" )
    List<Map<String, Integer>> getUserTag(Integer user_id);

    /**
     * 获取用户身份画像标签
     */
    @Select("select tut.user_type from user_info ui inner join tag_user_type tut on ui.user_id = tut.user_id where ui.user_id = #{user_id}")
    List<Map<String, Integer>> getUserTypeTag(Integer user_id);
}
