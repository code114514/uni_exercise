package com.xing.uni.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xing.uni.entity.BigType;
import com.xing.uni.entity.Product;
import com.xing.uni.entity.R;
import com.xing.uni.entity.SmallType;
import com.xing.uni.service.IBigTypeService;
import com.xing.uni.service.IProductService;
import com.xing.uni.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/nav")
public class BigTypeController {

    @Autowired
    private IBigTypeService bigTypeService;

    @Autowired
    private ISmallTypeService smallService;

    @Autowired
    private IProductService productService;

    /**
     * 查询所有商品大类
     * @return
     */
    @GetMapping("/findAll")
    public R findAll(){
        List<BigType> bigTypeList = bigTypeService.list();
        Map<String,Object> map=new HashMap<>();
        map.put("message",bigTypeList);
        return R.ok(map);
    }

    /**
     * 获取所有菜单信息
     * @return
     */
    @GetMapping("/findCategories")
    public R findCategories(){
        List<BigType> bigTypeList = bigTypeService.list();
        for(BigType bigType:bigTypeList){
            List<SmallType> smallTypeList = smallService.list(new QueryWrapper<SmallType>().eq("bigTypeId", bigType.getId()));
            bigType.setSmallTypeList(smallTypeList);
            for(SmallType smallType:smallTypeList){
                List<Product> productList = productService.list(new QueryWrapper<Product>().eq("typeId", smallType.getId()));
                smallType.setProductList(productList);
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("message",bigTypeList);
        return R.ok(map);
    }

}
