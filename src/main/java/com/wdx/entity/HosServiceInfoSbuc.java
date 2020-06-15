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
 * 医院与服务对应表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hos_service_info_sbuc")
@ApiModel(value="HosServiceInfoSbuc对象", description="医院与服务对应表")
public class HosServiceInfoSbuc implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医院与服务对应id")
    @TableId(value = "hos_service_info_id", type = IdType.ID_WORKER)
    private String hosServiceInfoId;

    @ApiModelProperty(value = "医院服务id")
    private String hosServiceId;

    @ApiModelProperty(value = "医院信息id")
    @TableField("Hospital_info_id")
    private String hospitalInfoId;


}
