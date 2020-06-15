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
 * 加密传输系统服务信息表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_sys_en_fw")
@ApiModel(value="SysEnFw对象", description="加密传输系统服务信息表")
public class SysEnFw implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "服务id")
    @TableId(value = "fw_id", type = IdType.ID_WORKER)
    private String fwId;

    @ApiModelProperty(value = "服务名称")
    private String fwName;

    @ApiModelProperty(value = "服务字段")
    private String fwZd;

    @ApiModelProperty(value = "服务备注")
    private String fwRemark;


}
