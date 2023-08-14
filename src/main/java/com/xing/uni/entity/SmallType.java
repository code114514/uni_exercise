package com.xing.uni.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName("smalltype")
@Data
public class SmallType  implements Serializable {
    private Integer id;
    private  String name;
    private  String remark;
    private Integer bigTypeId;

    @TableField(select = false,insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)
    private BigType bigType;  // 所属商品大类


    @TableField(select = false)
    private List<Product> productList;
}
