package com.xing.uni.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xing.uni.entity.BigType;
import com.xing.uni.mapper.BigTypeMapper;
import com.xing.uni.mapper.ProductMapper;
import com.xing.uni.service.IBigTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BigTypeService")
public class IBigTypeServiceImpl extends ServiceImpl<BigTypeMapper, BigType> implements IBigTypeService
{
    @Autowired
    private BigTypeMapper bigTypeMapper;
}
