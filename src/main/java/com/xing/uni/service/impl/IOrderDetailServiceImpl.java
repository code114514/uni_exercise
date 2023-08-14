package com.xing.uni.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xing.uni.entity.OrderDetail;
import com.xing.uni.mapper.OrderDetailMapper;
import com.xing.uni.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单详情Service实现类
 */
@Service("orderDetailService")
public class IOrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;
}
