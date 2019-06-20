package com.tl.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    springboot集成freemarker
    动态资源应该放在动态资源文件：templates文件中
 */
@Controller
public class FreemarkerController {

    @RequestMapping("freemarker")
    public String freemarker(Model model){
        //第一个参数名应与界面中${}里的名称对应
        model.addAttribute("name","Freemarker");
        return "index";
    }

}
