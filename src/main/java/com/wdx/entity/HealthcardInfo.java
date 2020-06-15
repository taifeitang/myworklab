package com.wdx.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_healthcard_info")
@ApiModel(value="HealthcardInfo对象", description="")
public class HealthcardInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String healthCardId;

    private String name;

    private String cardNo;

    private String birthDate;

    private String sex;

    private String phone;

    private String detailsAddress;

    private String status;

    private Date insertTime;

    private Date editTime;

    private String areaCode;

    private String cardType;

    private String contactCardNo;

    private String relationDesc;

    private String contactPhone;

    private String contactName;

    private String userId;


}
