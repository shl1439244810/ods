package com.shop.service;

import com.github.pagehelper.PageInfo;
import com.shop.bean.ProductInfo;

/**
 * 商品信息 Service 接口
 */
public interface ProductInfoService {

    /**
     * 模糊查询商品信息
     */
    PageInfo<ProductInfo> getAllProductInfo(ProductInfo productInfo, int limit, int page);

}
