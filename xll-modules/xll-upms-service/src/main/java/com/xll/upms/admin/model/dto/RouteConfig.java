package com.xll.upms.admin.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author 徐亮亮
 * @Description：  路由配置
 * @Date 2019/1/18 21:46
 */
@Data
public class RouteConfig implements Serializable{

    @com.alibaba.fastjson.annotation.JSONField(name = "path")
    private String path;
    @com.alibaba.fastjson.annotation.JSONField(name = "component")
    private String component;
    @com.alibaba.fastjson.annotation.JSONField(name = "name")
    private String name;
    @com.alibaba.fastjson.annotation.JSONField(name = "components")
    private String components;
    @com.alibaba.fastjson.annotation.JSONField(name = "redirect")
    private String redirect;
    @com.alibaba.fastjson.annotation.JSONField(name = "props")
    private String props;
    @com.alibaba.fastjson.annotation.JSONField(name = "alias")
    private String alias;
    @com.alibaba.fastjson.annotation.JSONField(name = "children")
    private String children;
    @com.alibaba.fastjson.annotation.JSONField(name = "beforeEnter")
    private String beforeEnter;
    @com.alibaba.fastjson.annotation.JSONField(name = "meta")
    private Map<String,String> meta;
    @com.alibaba.fastjson.annotation.JSONField(name = "caseSensitive")
    private Boolean caseSensitive;
    @com.alibaba.fastjson.annotation.JSONField(name = "pathToRegexpOptions")
    private String pathToRegexpOptions;
}
