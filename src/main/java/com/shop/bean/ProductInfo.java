package com.shop.bean;

/**
 * 商品信息
 */
public class ProductInfo {

    /**
     * 商品编号
     */
    private String product_id;

    /**
     * 商品标题
     */
    private String product_name;

    /**
     * 价格
     */
    private Double product_price;

    /**
     * 商品类别
     */
    private String product_type;

    /**
     * 用户标签
     */
    private String user_type;

    /**
     * 无参构造
     */
    public ProductInfo() {
    }

    /**
     * 有参构造
     */
    public ProductInfo(String product_id, String product_name, Double product_price, String product_type, String user_type) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_type = product_type;
        this.user_type = user_type;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
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

    @Override
    public String toString() {
        return "ProductInfo{" +
                "product_id='" + product_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_type='" + product_type + '\'' +
                ", user_type='" + user_type + '\'' +
                '}';
    }
}
