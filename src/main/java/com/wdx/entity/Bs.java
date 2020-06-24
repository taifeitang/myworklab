package com.wdx.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: myworklab
 * @description: 股价和股票名称对象
 * @author: wdx
 * @create: 2020-06-16 21:15
 **/
@Data
public class Bs implements Serializable {
    private static final long serialVersionUID = 1L;
    private  String name;
    private BigDecimal price;
}
