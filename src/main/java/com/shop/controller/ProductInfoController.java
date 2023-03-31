package com.shop.controller;

import com.github.pagehelper.PageInfo;
import com.shop.bean.ProductInfo;
import com.shop.bean.ResultObject;
import com.shop.service.ProductInfoService;
import com.shop.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 商品信息 Controller
 */
@RequestMapping("/product_info")
@RestController
public class ProductInfoController {

    /**
     * 注入商品信息 Service 接口
     */
    @Autowired
    private ProductInfoService productInfoService;

    /**
     * 模糊查询商品信息
     */
    @RequestMapping("/getAllProductInfo")
    public ResultObject<List<ProductInfo>> getAllProductInfo(ProductInfo productInfo, @RequestParam("limit") int limit, @RequestParam("page") int page) {
        // 1.模糊查询商品信息
        PageInfo<ProductInfo> pageInfo = productInfoService.getAllProductInfo(productInfo, limit, page);
        // 2.统一返回
        ResultObject<List<ProductInfo>> rs = new ResultObject<List<ProductInfo>>();
        // 3.返回获取到的数据
        List<ProductInfo> list = pageInfo.getList();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

}
