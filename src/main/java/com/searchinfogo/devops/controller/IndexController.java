package com.searchinfogo.devops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author junhua
 * @date 2018/2/5 20:36
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
