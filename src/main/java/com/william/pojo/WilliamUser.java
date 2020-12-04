package com.william.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author mybatisPlusGenerator
 * @since 2019-11-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WilliamUser对象", description="")
public class WilliamUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String passWord;

    @ApiModelProperty(value = "姓名")
    private String realName;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "1:男。2:女")
    private Integer sex;

    @ApiModelProperty(value = "1启用 2 禁用")
    private Integer status;

    @ApiModelProperty(value = "部门ID")
    private String orgid;

    @ApiModelProperty(value = "岗位ID")
    private String stationid;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "身份证号")
    private String idcard;

    @ApiModelProperty(value = "权限")
    private String permission;

    @ApiModelProperty(value = "排序")
    private Long sort;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "头像")
    private String img;

    @ApiModelProperty(value = "用户类型")
    private Integer userType;

    @ApiModelProperty(value = "类型.0：试用期。1：正式员工。2：离职。3：实习")
    private Integer employeeType;

    @ApiModelProperty(value = "入职日期")
    private String entryDate;

    @ApiModelProperty(value = "出生日期")
    private String birthDate;

    @ApiModelProperty(value = "剩余年假天数")
    private Integer yearHoliday;

    @ApiModelProperty(value = "签名照片地址")
    private String signNamePic;

    @ApiModelProperty(value = "入司日期")
    private Date inCompanyDate;

    @ApiModelProperty(value = "离职日期")
    private Date dimissionDate;

    @ApiModelProperty(value = "过往经历")
    private String experience;

    @ApiModelProperty(value = "教育经历")
    private String eduExperience;

    @ApiModelProperty(value = "工号")
    private String workNum;

    private String position;

    @ApiModelProperty(value = "租户")
    private String tId;

    @ApiModelProperty(value = "盐")
    private String salt;

}
