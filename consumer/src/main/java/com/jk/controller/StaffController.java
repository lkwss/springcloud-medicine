package com.jk.controller;

import com.jk.staffservice.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;
}
