package com.william.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 菜单
 * </p>
 *
 * @author mybatisPlusGenerator
 * @since 2019-11-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WilliamMenu对象", description="菜单")
public class WilliamMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "menu permission")
    private String type;

    @ApiModelProperty(value = "父节点id")
    private Integer pid;

    @ApiModelProperty(value = "根节点id")
    private String rootId;

    @ApiModelProperty(value = "系统id")
    private String systemId;

    @ApiModelProperty(value = "编号")
    private String code;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "图标颜色")
    private String iconColor;

    @ApiModelProperty(value = "url")
    private String href;

    @ApiModelProperty(value = "是否展开")
    private Integer spread;

    @ApiModelProperty(value = "树结构层级")
    private String level;

    @ApiModelProperty(value = "菜单颜色")
    private String menuColor;

    @ApiModelProperty(value = "是否显示 1 显示 2 不显示")
    private Integer showFlag;

    @ApiModelProperty(value = "当前页还是跳转_block")
    private String target;

    @ApiModelProperty(value = "排序")
    private Integer seq;

    @ApiModelProperty(value = "权限")
    private String permission;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "添加人id")
    private String entId;

    @ApiModelProperty(value = "添加人姓名")
    private String entName;

    @ApiModelProperty(value = "添加时间")
    private Date entDate;

    @ApiModelProperty(value = "修改人id")
    private String modId;

    @ApiModelProperty(value = "修改人姓名")
    private String modName;

    @ApiModelProperty(value = "修改时间")
    private Date modDate;

    @ApiModelProperty(value = "端")
    private String client;

    @TableField(exist = false)
    private List<WilliamMenu> children;
}
