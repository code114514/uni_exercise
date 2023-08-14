package com.xing.uni.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("product_swiper_image")
@Data
public class ProductSwiperImage {
    private Integer id;
    private  String image;
    private  Integer sort;
    private  Integer productId;
}
