package com.jk.staffservice;

import com.jk.pojo.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "service-provider",fallback = StaffServiceFallBack.class)
public interface StaffService {

    @RequestMapping("staff/initTree")
    List<TreeBean> initTree();
}
