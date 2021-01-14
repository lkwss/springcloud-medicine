package com.jk.staffservice;

import com.jk.pojo.TreeBean;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StaffServiceFallBack implements StaffService {
    @Override
    public List<TreeBean> initTree() {
        return null;
    }
}
