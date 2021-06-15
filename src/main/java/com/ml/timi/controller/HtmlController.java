/**
 * Description:
 * Copyright (C), 2021 2021/6/12 15:24
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */


package com.ml.timi.controller;

import com.ml.timi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 框架页面整合
 */
@Controller
@RequestMapping("api/v1/html")
public class HtmlController {

    /**
     * 返回 Freemarker 页面
     * @param modelMap
     * @return
     */
    @GetMapping("freemarker")
    public String freemarker(ModelMap modelMap) {

        User user = new User();

        user.setName("李凌");
        modelMap.addAttribute("a", user);

        return "testhtml/freemarker/freemarker";
    }

    /**
     * 返回 Thymeleaf 页面
     * @param modelMap
     * @return
     */
    @GetMapping("thymeleaf")
    public String thymeleaf(ModelMap modelMap) {

        User user = new User();

        user.setName("李凌");
        modelMap.addAttribute("a", user);
        return "testhtml/thymeleaf/thymeleaf";
    }


}
