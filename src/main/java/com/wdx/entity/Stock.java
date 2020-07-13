package com.wdx.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-07-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Stock对象", description="")
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    @ApiModelProperty(value = "股票名字")
    private String name;

    @ApiModelProperty(value = "当前股价")
    private BigDecimal price;

    @ApiModelProperty(value = "上市板块")
    private String boardType;

    @ApiModelProperty(value = "上市时间")
    private Date time;

    @ApiModelProperty(value = "股票代码")
    private String code;

    @ApiModelProperty(value = "乐观锁版本控制")
    private String version;

    @ApiModelProperty(value = "是否被删除，0为有效，1为已被删除")
    private String deleted;

    @ApiModelProperty(value = "上市时的股价")
    private Long startPrice;

    @ApiModelProperty(value = "退市时间")
    private Date rebackTime;


}
