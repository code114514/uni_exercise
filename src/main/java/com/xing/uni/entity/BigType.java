package com.xing.uni.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("nav")
@Data
public class BigType {
    private Integer id;
    private String name;
    private String remark;
    private  String image = "default.jpg";
    @TableField(select = false)
    private List<SmallType> smallTypeList;
}
