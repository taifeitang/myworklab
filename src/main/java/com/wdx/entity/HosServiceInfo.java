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
 * 医疗板块医院服务信息表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hos_service_info")
@ApiModel(value="HosServiceInfo对象", description="医疗板块医院服务信息表")
public class HosServiceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医院服务id")
    @TableId(value = "hos_service_id", type = IdType.ID_WORKER)
    private String hosServiceId;

    @ApiModelProperty(value = "上一级医院服务id")
    private String upperLevelHosServiceId;

    @ApiModelProperty(value = "医院服务名称")
    private String hosServiceName;

    @ApiModelProperty(value = "服务上线时间")
    @TableField("Online_time")
    private Date onlineTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}
