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
 * 多个系统用户加密信息表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_sys_en_info")
@ApiModel(value="SysEnInfo对象", description="多个系统用户加密信息表")
public class SysEnInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "系统id")
    @TableId(value = "sys_id", type = IdType.ID_WORKER)
    private String sysId;

    @ApiModelProperty(value = "系统名称(中文)")
    private String sysNameCn;

    @ApiModelProperty(value = "系统名称(英文)")
    private String sysNameEn;

    @ApiModelProperty(value = "系统密码")
    private String sysPasswd;

    @ApiModelProperty(value = "RSA公钥")
    @TableField("RSA_publicKey")
    private String rsaPublickey;

    @ApiModelProperty(value = "RSA私钥")
    @TableField("RSA_privateKey")
    private String rsaPrivatekey;

    @ApiModelProperty(value = "限制ip")
    private String sysIp;

    @ApiModelProperty(value = "备注")
    private String remark;


}
