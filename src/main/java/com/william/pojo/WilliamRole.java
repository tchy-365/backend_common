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
@ApiModel(value="WilliamRole对象", description="")
public class WilliamRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String version;

    private String groupId;

    @ApiModelProperty(value = "角色名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "状态1 启用 2 停用")
    private Integer status;

    @ApiModelProperty(value = "租户ID")
    private String tId;

    private String entId;

    private String entName;

    private Date entTime;

    private String modId;

    private String modName;

    private Date modTime;


}
