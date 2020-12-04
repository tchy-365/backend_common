package com.william.pojo.vo;

import com.william.pojo.WilliamRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/21 16:08
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class RoleVo extends WilliamRole {

    private static final long serialVersionUID = 1L;
    private Integer page=1;
    private Integer limit=10;
}
