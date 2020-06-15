package com.wdx.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 多个系统用户加密服务对应表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_sys_en_fw_dy")
@ApiModel(value="SysEnFwDy对象", description="多个系统用户加密服务对应表")
public class SysEnFwDy implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "服务id")
    private String fwId;

    @ApiModelProperty(value = "系统id")
    private String sysId;

    @ApiModelProperty(value = "加密服务对应id")
    private String enFwDyId;


}
