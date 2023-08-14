package com.xing.uni.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xing.uni.entity.BigType;


/**
 * 商品大类Mapper接口

 */
public interface BigTypeMapper extends BaseMapper<BigType> {

    public BigType findById(Integer id);
}
