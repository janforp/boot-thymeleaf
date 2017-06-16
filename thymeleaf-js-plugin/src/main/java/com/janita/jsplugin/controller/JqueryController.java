package com.janita.jsplugin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Janita on 2017/6/16 0016-下午 2:07
 * 该类是：
 */
@Controller
public class JqueryController {

    /**
     * 跳转到 jquery 页面
     * @param map
     * @return
     */
    @RequestMapping("/jquery")
    public String jquery(Map<String, Object> map) {
        map.put("jquery", "我是来自后台的参数");
        return "jquery";
    }
}
