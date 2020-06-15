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
 * 医疗板块关注信息表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_follow_info")
@ApiModel(value="FollowInfo对象", description="医疗板块关注信息表")
public class FollowInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "关注信息id")
    @TableId(value = "follow_info_id", type = IdType.ID_WORKER)
    private String followInfoId;

    @ApiModelProperty(value = "医院信息id")
    @TableField("Hospital_info_id")
    private String hospitalInfoId;

    @ApiModelProperty(value = "用户id")
    @TableField("UserId")
    private String UserId;

    @ApiModelProperty(value = "关注时间")
    private Date followTime;

    @ApiModelProperty(value = "0：关注  1：取消关注")
    private String status;


}
