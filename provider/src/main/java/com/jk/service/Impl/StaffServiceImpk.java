package com.jk.service.Impl;

import com.jk.dao.StaffDao;
import com.jk.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpk implements StaffService {
    @Autowired
    private StaffDao staffDao;
}
