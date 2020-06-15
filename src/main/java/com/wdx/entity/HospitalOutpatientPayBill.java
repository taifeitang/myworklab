package com.wdx.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * 医院门诊缴费单据信息
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_outpatient_pay_bill")
@ApiModel(value="HospitalOutpatientPayBill对象", description="医院门诊缴费单据信息")
public class HospitalOutpatientPayBill implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "门诊缴费单据号id")
    @TableId(value = "outpatient_pay_bill_id", type = IdType.ID_WORKER)
    private String outpatientPayBillId;

    @ApiModelProperty(value = "门诊缴费id")
    private String outpatientPayInfoId;

    @ApiModelProperty(value = "单据号")
    @TableField("BillNo")
    private String BillNo;

    @ApiModelProperty(value = "金额(分)")
    private Long charge;


}
