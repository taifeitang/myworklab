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
 * 医疗板块医院订单信息
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_order_info")
@ApiModel(value="HospitalOrderInfo对象", description="医疗板块医院订单信息")
public class HospitalOrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "order_id", type = IdType.ID_WORKER)
    private String orderId;

    @ApiModelProperty(value = "用户id")
    @TableField("UserId")
    private String UserId;

    @ApiModelProperty(value = "订单类型")
    private String orderType;

    @ApiModelProperty(value = "订单金额(分)")
    private Long orderCharge;

    @ApiModelProperty(value = "支付结果")
    private String paymentResult;

    @ApiModelProperty(value = "退款结果")
    private String refundResult;

    @ApiModelProperty(value = "失败原因")
    private String falseReason;

    @ApiModelProperty(value = "失败原因(中文)")
    private String falseReasonCn;

    @ApiModelProperty(value = "支付成功金额(分)")
    private Long paySuccessCharge;

    @ApiModelProperty(value = "支付失败金额(分)")
    private Long payFalseCharge;

    @ApiModelProperty(value = "支付时间")
    private Date paymentTime;

    @ApiModelProperty(value = "退款成功金额(分)")
    private Long refundSuccessCharge;

    @ApiModelProperty(value = "退款失败金额(分)")
    private Long refundFalseCharge;

    @ApiModelProperty(value = "退款时间")
    private Date refundTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "插入时间")
    private Date insertTime;

    @ApiModelProperty(value = "回调时间")
    @TableField("Callback_time")
    private Date callbackTime;

    @ApiModelProperty(value = "生成时间")
    @TableField("Generate_time")
    private Date generateTime;

    @ApiModelProperty(value = "编辑时间")
    private Date editTime;


}
