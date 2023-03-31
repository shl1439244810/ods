package com.shop.bean;

/**
 * 用户行为信息
 */
public class ActionInfo {

    /**
     * 用户编号
     */
    private Integer user_id;

    /**
     * 用户姓名
     */
    private String user_name;

    /**
     * 用户年龄
     */
    private Integer user_age;

    /**
     * 用户性别
     */
    private String user_gender;

    /**
     * 用户工资
     */
    private Integer user_wage;

    /**
     * 产品编号
     */
    private String product_id;

    /**
     * 商品类别
     */
    private String product_type;

    /**
     * 用户标签
     */
    private String user_type;

    /**
     * 行为
     */
    private String action;

    /**
     * 行为分值
     */
    private Integer action_score;

    /**
     * 行为时间
     */
    private String action_time;

    /**
     * 行为时间区间
     */
    private String action_range;

    public ActionInfo() {
    }

    public ActionInfo(Integer user_id, String user_name, Integer user_age, String user_gender, Integer user_wage, String product_id, String product_type, String user_type, String action, Integer action_score, String action_time, String action_range) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.user_wage = user_wage;
        this.product_id = product_id;
        this.product_type = product_type;
        this.user_type = user_type;
        this.action = action;
        this.action_score = action_score;
        this.action_time = action_time;
        this.action_range = action_range;
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

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public Integer getUser_wage() {
        return user_wage;
    }

    public void setUser_wage(Integer user_wage) {
        this.user_wage = user_wage;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getAction_score() {
        return action_score;
    }

    public void setAction_score(Integer action_score) {
        this.action_score = action_score;
    }

    public String getAction_time() {
        return action_time;
    }

    public void setAction_time(String action_time) {
        this.action_time = action_time;
    }

    public String getAction_range() {
        return action_range;
    }

    public void setAction_range(String action_range) {
        this.action_range = action_range;
    }

    @Override
    public String toString() {
        return "ActionInfo{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_age=" + user_age +
                ", user_gender='" + user_gender + '\'' +
                ", user_wage=" + user_wage +
                ", product_id='" + product_id + '\'' +
                ", product_type='" + product_type + '\'' +
                ", user_type='" + user_type + '\'' +
                ", action='" + action + '\'' +
                ", action_score=" + action_score +
                ", action_time='" + action_time + '\'' +
                ", action_range='" + action_range + '\'' +
                '}';
    }
}
