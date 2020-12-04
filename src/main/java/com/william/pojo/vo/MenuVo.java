package com.william.pojo.vo;

import com.william.pojo.WilliamMenu;
import com.william.pojo.WilliamRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/21 16:05
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MenuVo extends WilliamMenu {

    private Integer page = 1;
    private Integer limit = 10;
}
