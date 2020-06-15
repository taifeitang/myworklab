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
 * 
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_healthcard_hos_sbuc")
@ApiModel(value="HealthcardHosSbuc对象", description="")
public class HealthcardHosSbuc implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "健康卡与服务对应id")
    private String healthcardHosId;

    @ApiModelProperty(value = "健康卡id")
    private String healthCardId;

    @ApiModelProperty(value = "医院信息id")
    @TableField("Hospital_info_id")
    private String hospitalInfoId;

    @ApiModelProperty(value = "病人的id")
    @TableField("PatientId")
    private String PatientId;


}
