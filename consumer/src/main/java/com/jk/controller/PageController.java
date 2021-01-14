package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }
    @RequestMapping("tometting")
    public String tometting(){
        return "metting";
    }

    @RequestMapping("toabroad")
    public String toabroad(){
        return "abroad";
    }

    @RequestMapping("tologins")
    public String tologins(){
        return "logins";
    }

    @RequestMapping("toadd")
    public String toadd(Model model,Integer id){
        model.addAttribute("id",id);
        return "addgoods";
    }

    @RequestMapping("toaddmeeting")
    public String toaddmeeting(Model model,Integer id){
        model.addAttribute("id",id);
        return "addmeeting";
    }
}
