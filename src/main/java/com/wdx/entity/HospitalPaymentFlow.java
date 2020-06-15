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
 * 医疗板块医院支付流水
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_payment_flow")
@ApiModel(value="HospitalPaymentFlow对象", description="医疗板块医院支付流水")
public class HospitalPaymentFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "支付流水id")
    @TableId(value = "Payment_flow_id", type = IdType.ID_WORKER)
    private String paymentFlowId;

    @ApiModelProperty(value = "支付渠道")
    @TableField("payChannel")
    private String payChannel;

    @ApiModelProperty(value = "支付金额(分)")
    @TableField("Payment_charge")
    private Long paymentCharge;

    @ApiModelProperty(value = "支付结果")
    private String paymentResult;

    @ApiModelProperty(value = "失败原因")
    private String falseReason;

    @ApiModelProperty(value = "失败原因(中文)")
    private String falseReasonCn;

    @ApiModelProperty(value = "银联流水号")
    private String seqid;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "生成时间")
    @TableField("Generate_time")
    private Date generateTime;

    @ApiModelProperty(value = "回调时间")
    @TableField("Callback_time")
    private Date callbackTime;

    @ApiModelProperty(value = "插入时间")
    private Date insertTime;

    @ApiModelProperty(value = "编辑时间")
    private Date editTime;


}
