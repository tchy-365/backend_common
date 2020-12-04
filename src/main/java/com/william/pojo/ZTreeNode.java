package com.william.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/17 11:44
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@NoArgsConstructor
public class ZTreeNode {

    private Integer id;
    private String pid;
    private String title;
    private String icon;
    private String href;
    private Boolean spread;
    private String target;
    private String permission;
    private Integer showFlag;
    private List<ZTreeNode> children;


}
