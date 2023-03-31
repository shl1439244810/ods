package com.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.util.StringUtils;
import com.shop.bean.ProductInfo;
import com.shop.mapper.ProductInfoMapper;
import com.shop.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 商品信息 Service 接口实现类
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    /**
     * 注入商品信息 Service 接口
     */
    @Autowired
    private ProductInfoMapper productInfoMapper;

    /**
     * 模糊查询商品信息
     */
    @Override
    public PageInfo<ProductInfo> getAllProductInfo(ProductInfo productInfo, int limit, int page) {
        PageHelper.startPage(page, limit);
        Example example = new Example(productInfo.getClass());
        Example.Criteria criteria = example.createCriteria();
        if (!StringUtils.isNullOrEmpty(productInfo.getProduct_name())) {
            criteria.andLike("product_name", "%" + productInfo.getProduct_name() + "%");
        }
        if (!StringUtils.isNullOrEmpty(productInfo.getProduct_type())) {
            criteria.andEqualTo("product_type", productInfo.getProduct_type());
        }
        example.setOrderByClause("product_id asc");
        List<ProductInfo> list = productInfoMapper.selectByExample(example);
        PageInfo<ProductInfo> pageInfo = new PageInfo<ProductInfo>(list);
        return pageInfo;
    }
}
