package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.staffservice.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    /**
     * @Author: lkw
     * @Description:加载树
     * @Date: 2021/1/13 14:39
      * @param
     * @Return: java.util.List<com.jk.pojo.TreeBean>
     **/
    @RequestMapping("initTree")
    @ResponseBody
    public List<TreeBean> initTree(){
        return staffService.initTree();
    }

}
