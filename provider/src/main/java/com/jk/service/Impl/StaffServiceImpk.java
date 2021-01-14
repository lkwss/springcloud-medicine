package com.jk.service.Impl;

import com.jk.dao.StaffDao;
import com.jk.pojo.TreeBean;
import com.jk.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpk implements StaffService {
    @Autowired
    private StaffDao staffDao;

    @Override
    public List<TreeBean> initTree() {
        int pid=0;
        List<TreeBean> list = getTreeBeans(pid);
        return list;
    }

    private List<TreeBean> getTreeBeans(int pid) {
            List<TreeBean> list = staffDao.initTree(pid);
            for (TreeBean tree:list) {
                Integer id = tree.getId();
                List<TreeBean> lists = getTreeBeans(id);
                if (list != null && lists.size()>0) {
                    tree.setNodes(lists);
                    tree.setSelectable(false);
                }else {
                    tree.setSelectable(true);
                }
            }
            return list;
    }
}
