package com.xing.uni.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xing.uni.entity.WxUserInfo;
import com.xing.uni.mapper.WxUserInfoMapper;
import com.xing.uni.service.IWxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("wxUserInfoService")
public class IWxUserInfoServiceImpl extends ServiceImpl<WxUserInfoMapper, WxUserInfo> implements IWxUserInfoService {

    @Autowired
    private WxUserInfoMapper wxUserInfoMapper;
}
