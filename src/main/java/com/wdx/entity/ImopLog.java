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
 * 医疗板块重要操作日志表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_imop_log")
@ApiModel(value="ImopLog对象", description="医疗板块重要操作日志表")
public class ImopLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "操作类型")
    @TableField("ACTION_TYPE")
    private String actionType;

    @ApiModelProperty(value = "操作类型（中文）")
    @TableField("ACTION_TYPE_cn")
    private String actionTypeCn;

    @ApiModelProperty(value = "操作时间")
    @TableField("ACTION_TIME")
    private Date actionTime;

    @ApiModelProperty(value = "操作记录详情1")
    private String logDetil1;

    @ApiModelProperty(value = "操作记录详情2")
    private String logDetil2;

    @ApiModelProperty(value = "操作记录详情3")
    private String logDetil3;

    @ApiModelProperty(value = "操作记录详情4")
    private String logDetil4;


}
