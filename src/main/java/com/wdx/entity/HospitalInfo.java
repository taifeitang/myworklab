package com.wdx.entity;

import java.math.BigDecimal;
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
 * 医疗板块医院信息表
 * </p>
 *
 * @author wdx
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ylbk_hospital_info")
@ApiModel(value="HospitalInfo对象", description="医疗板块医院信息表")
public class HospitalInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医院信息id")
    @TableId(value = "Hospital_info_id", type = IdType.ID_WORKER)
    private String hospitalInfoId;

    @ApiModelProperty(value = "医院名称")
    @TableField("Hospital_name")
    private String hospitalName;

    @ApiModelProperty(value = "医院联系号码")
    @TableField("Hospital_Contact_number")
    private String hospitalContactNumber;

    @ApiModelProperty(value = "医院地址")
    @TableField("Hospital_address")
    private String hospitalAddress;

    @ApiModelProperty(value = "插入时间")
    private Date insertTime;

    @ApiModelProperty(value = "编辑时间")
    private Date editTime;

    @ApiModelProperty(value = "机构ID")
    @TableField("Institution_ID")
    private String institutionId;

    @ApiModelProperty(value = "组织机构代码")
    @TableField("Organization_code")
    private String organizationCode;

    @ApiModelProperty(value = "经济类型代码")
    @TableField("Economic_type_code")
    private String economicTypeCode;

    @ApiModelProperty(value = "卫生机构类别代码")
    @TableField("Health_institution_category_co")
    private String healthInstitutionCategoryCo;

    @ApiModelProperty(value = "类别代码")
    @TableField("Class_code")
    private String classCode;

    @ApiModelProperty(value = "单位开业/成立时间")
    @TableField("Establishment_time")
    private Date establishmentTime;

    @ApiModelProperty(value = "注册资金(万元)")
    @TableField("Registered_capital")
    private BigDecimal registeredCapital;

    @ApiModelProperty(value = "法定代表人(负责人)")
    @TableField("Legal_representative")
    private String legalRepresentative;

    @ApiModelProperty(value = "邮政编码")
    @TableField("Postal_Code")
    private String postalCode;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;


}
