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
 * 医疗板块医院退款流水
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_refund_flow")
@ApiModel(value="HospitalRefundFlow对象", description="医疗板块医院退款流水")
public class HospitalRefundFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "退款流水id")
    @TableId(value = "refund_flow_id", type = IdType.ID_WORKER)
    private String refundFlowId;

    @ApiModelProperty(value = "支付流水id")
    @TableField("Payment_flow_id")
    private String paymentFlowId;

    @ApiModelProperty(value = "用户id")
    @TableField("UserId")
    private String UserId;

    @ApiModelProperty(value = "支付渠道")
    @TableField("payChannel")
    private String payChannel;

    @ApiModelProperty(value = "退款金额(分)")
    private Long refundCharge;

    @ApiModelProperty(value = "退款结果")
    private String refundResult;

    @ApiModelProperty(value = "失败原因")
    private String falseReason;

    @ApiModelProperty(value = "失败原因(中文)")
    private String falseReasonCn;

    @ApiModelProperty(value = "退款时间")
    private Date refundTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "生成时间")
    @TableField("Generate_time")
    private Date generateTime;

    @ApiModelProperty(value = "回调时间")
    @TableField("Callback_time")
    private Date callbackTime;

    @ApiModelProperty(value = "退款原因")
    private String refundReason;

    @ApiModelProperty(value = "插入时间")
    private Date insertTime;

    @ApiModelProperty(value = "编辑时间")
    private Date editTime;

    @ApiModelProperty(value = "退款银联流水号")
    @TableField("umsRefundSeqId")
    private String umsRefundSeqId;


}
