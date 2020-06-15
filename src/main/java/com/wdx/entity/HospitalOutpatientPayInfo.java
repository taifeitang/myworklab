package com.wdx.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 门诊缴费信息表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_outpatient_pay_info")
@ApiModel(value="HospitalOutpatientPayInfo对象", description="门诊缴费信息表")
public class HospitalOutpatientPayInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "门诊缴费id")
    @TableId(value = "outpatient_pay_info_id", type = IdType.ID_WORKER)
    private String outpatientPayInfoId;

    @ApiModelProperty(value = "订单id")
    private String orderId;

    @ApiModelProperty(value = "健康卡与医院对应id")
    private String healthcardHosSbucId;

    @ApiModelProperty(value = "医院信息id")
    @TableField("Hospital_info_id")
    private String hospitalInfoId;

    @ApiModelProperty(value = "健康卡id")
    private String healthCardId;

    @ApiModelProperty(value = "用户id")
    @TableField("UserId")
    private String UserId;

    @ApiModelProperty(value = "医院的挂号单号")
    @TableField("RegisterNo")
    private String RegisterNo;

    @ApiModelProperty(value = "缴费数量")
    @TableField("Count")
    private Integer Count;

    @ApiModelProperty(value = "总金额(分)")
    private Long allCharge;

    @ApiModelProperty(value = "结算类型")
    @TableField("InsureType")
    private String InsureType;

    @ApiModelProperty(value = "门诊缴费结果")
    private String outpatientPayResult;

    @ApiModelProperty(value = "门诊缴费时间")
    private Date outpatientPayTime;

    @ApiModelProperty(value = "插入时间")
    private Date insertTime;

    @ApiModelProperty(value = "编辑时间")
    private Date editTime;


}
