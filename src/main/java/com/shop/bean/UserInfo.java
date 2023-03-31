package com.shop.bean;

/**
 * 用户信息
 */
public class UserInfo {

    /**
     * 用户编号
     */
    private Integer user_id;

    /**
     * 用户名称
     */
    private String user_name;

    /**
     * 用户年龄
     */
    private String user_age;

    /**
     * 用户性别
     */
    private String user_gender;

    /**
     * 用户城市
     */
    private String user_city;

    /**
     * 用户城市类别
     */
    private String user_city_type;

    /**
     * 用户工资
     */
    private String user_wage;

    /**
     * 用户年龄标签
     */
    private String user_age_flag;

    /**
     * 用户收入标签
     */
    private String user_wage_flag;

    /**
     * 用户行为限定时间开始
     */
    private String user_action_start;

    /**
     * 用户行为限定时间结束
     */
    private String user_action_end;

    /**
     * 用户行为商品类别列表
     */
    private String product_type_list;

    public UserInfo() {
    }

    public UserInfo(Integer user_id, String user_name, String user_age, String user_gender, String user_city, String user_city_type, String user_wage, String user_age_flag, String user_wage_flag, String user_action_start, String user_action_end, String product_type_list) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.user_city = user_city;
        this.user_city_type = user_city_type;
        this.user_wage = user_wage;
        this.user_age_flag = user_age_flag;
        this.user_wage_flag = user_wage_flag;
        this.user_action_start = user_action_start;
        this.user_action_end = user_action_end;
        this.product_type_list = product_type_list;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public String getUser_city_type() {
        return user_city_type;
    }

    public void setUser_city_type(String user_city_type) {
        this.user_city_type = user_city_type;
    }

    public String getUser_wage() {
        return user_wage;
    }

    public void setUser_wage(String user_wage) {
        this.user_wage = user_wage;
    }

    public String getUser_age_flag() {
        return user_age_flag;
    }

    public void setUser_age_flag(String user_age_flag) {
        this.user_age_flag = user_age_flag;
    }

    public String getUser_wage_flag() {
        return user_wage_flag;
    }

    public void setUser_wage_flag(String user_wage_flag) {
        this.user_wage_flag = user_wage_flag;
    }

    public String getUser_action_start() {
        return user_action_start;
    }

    public void setUser_action_start(String user_action_start) {
        this.user_action_start = user_action_start;
    }

    public String getUser_action_end() {
        return user_action_end;
    }

    public void setUser_action_end(String user_action_end) {
        this.user_action_end = user_action_end;
    }

    public String getProduct_type_list() {
        return product_type_list;
    }

    public void setProduct_type_list(String product_type_list) {
        this.product_type_list = product_type_list;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_age='" + user_age + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_city='" + user_city + '\'' +
                ", user_city_type='" + user_city_type + '\'' +
                ", user_wage='" + user_wage + '\'' +
                ", user_age_flag='" + user_age_flag + '\'' +
                ", user_wage_flag='" + user_wage_flag + '\'' +
                ", user_action_start='" + user_action_start + '\'' +
                ", user_action_end='" + user_action_end + '\'' +
                ", product_type_list='" + product_type_list + '\'' +
                '}';
    }
}
