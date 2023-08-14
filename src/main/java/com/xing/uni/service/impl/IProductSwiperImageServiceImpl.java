package com.xing.uni.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xing.uni.entity.Product;
import com.xing.uni.entity.ProductSwiperImage;
import com.xing.uni.mapper.ProductMapper;
import com.xing.uni.mapper.ProductSwiperImageMapper;
import com.xing.uni.service.IProductService;
import com.xing.uni.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ProductSwiperImageService")
public class IProductSwiperImageServiceImpl extends ServiceImpl<ProductSwiperImageMapper,ProductSwiperImage>
    implements IProductSwiperImageService
{
   @Autowired
    private ProductSwiperImageMapper productSwiperImageMapper;
}
