package com.wdx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: onecode
 * @description: 挂号信息表需要插入的5个外键获取
 * @author: wdx
 * @create: 2020-06-16 17:58
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmitInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private  String registId;//UUID生成
    private  String userId;
    private  String healthcardHosId;
    private  String healthCardId;
    private  String orderId;
    private  String HospitalInfoId;
}
