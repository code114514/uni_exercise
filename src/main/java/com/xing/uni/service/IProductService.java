package com.xing.uni.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xing.uni.entity.Product;

import java.util.List;
import java.util.Map;

public interface IProductService extends IService<Product> {

    List<Product> list(Map<String,Object> map);

    Long getTotal(Map<String,Object> map);

    void add(Product product);

    void update(Product product);

    Product findById(Integer id);
}
