package com.william.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2019-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WilliamDept对象", description="")
public class WilliamDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer pid;

    private String title;

    @ApiModelProperty(value = "是否展开 1 展开 2 不展开")
    private Integer open;

    private String remark;

    private String address;

    @ApiModelProperty(value = "状态【2不可用1可用】")
    private Integer status;

    @ApiModelProperty(value = "排序码【为了调事显示顺序】")
    private Integer seq;

    private Date createTime;

    private String createId;

    private Date updateTime;

    private String updateId;


}
