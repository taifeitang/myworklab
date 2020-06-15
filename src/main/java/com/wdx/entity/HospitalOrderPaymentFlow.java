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
 * 医疗版块订单支付流水信息对应表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_order_payment_flow")
@ApiModel(value="HospitalOrderPaymentFlow对象", description="医疗版块订单支付流水信息对应表")
public class HospitalOrderPaymentFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单支付流水id")
    @TableId(value = "order_Payment_flow_id", type = IdType.ID_WORKER)
    private String orderPaymentFlowId;

    @ApiModelProperty(value = "订单id")
    private String orderId;

    @ApiModelProperty(value = "支付流水id")
    @TableField("Payment_flow_id")
    private String paymentFlowId;


}
