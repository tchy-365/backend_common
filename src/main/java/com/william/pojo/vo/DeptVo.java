package com.william.pojo.vo;

import com.william.pojo.WilliamDept;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/22 9:12
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DeptVo extends WilliamDept {

    private Integer page = 1;
    private Integer limit = 10;
}
