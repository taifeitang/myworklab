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
 * 医疗板块挂号信息表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_registration_info")
@ApiModel(value="HospitalRegistrationInfo对象", description="医疗板块挂号信息表")
public class HospitalRegistrationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "挂号id")
    @TableId(value = "regist_id", type = IdType.ID_WORKER)
    private String registId;

    @ApiModelProperty(value = "健康卡id")
    private String healthCardId;

    @ApiModelProperty(value = "健康卡与医院对应id")
    private String healthcardHosSbucId;

    @ApiModelProperty(value = "用户id")
    @TableField("UserId")
    private String UserId;

    @ApiModelProperty(value = "订单id")
    private String orderId;

    @ApiModelProperty(value = "医院信息id")
    @TableField("Hospital_info_id")
    private String hospitalInfoId;

    @ApiModelProperty(value = "医院的挂号单号")
    @TableField("RegisterNo")
    private String RegisterNo;

    @ApiModelProperty(value = "挂号订单号")
    @TableField("OrderNo")
    private String OrderNo;

    @ApiModelProperty(value = "号源序号")
    @TableField("OrderNum")
    private String OrderNum;

    @ApiModelProperty(value = "就诊序号")
    @TableField("JZNo")
    private String JZNo;

    @ApiModelProperty(value = "挂号安排ID")
    @TableField("AsRowid")
    private String AsRowid;

    @ApiModelProperty(value = "挂号时间")
    private Date registTime;

    @ApiModelProperty(value = "挂号结果")
    private String registResult;

    @ApiModelProperty(value = "就诊时间段")
    private String visitTime;

    @TableField("Return_No_reason")
    private String returnNoReason;

    @ApiModelProperty(value = "退号时间")
    @TableField("Return_No_time")
    private Date returnNoTime;

    @ApiModelProperty(value = "插入时间")
    private Date insertTime;

    @ApiModelProperty(value = "编辑时间")
    private Date editTime;

    @ApiModelProperty(value = "就诊医生名字")
    @TableField("DoctorName")
    private String DoctorName;

    @ApiModelProperty(value = "就诊医生所属科室名称")
    @TableField("DeptName")
    private String DeptName;

    @ApiModelProperty(value = " 就诊时间（年月日）")
    @TableField("JZTime")
    private String JZTime;


}
