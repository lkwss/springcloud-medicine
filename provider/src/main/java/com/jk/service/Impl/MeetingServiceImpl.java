package com.jk.service.Impl;

import com.jk.dao.MeetingDao;
import com.jk.pojo.MeetingBean;
import com.jk.pojo.ProductBean;
import com.jk.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    private MeetingDao meetingDao;

    @Override
    public HashMap<String, Object> initdomestic(Integer page, Integer rows, MeetingBean meetingBean) {
        int count=meetingDao.domesticnum(meetingBean);
        int open=(page-1)*rows;
        List<MeetingBean> list=meetingDao.initdomestic(open,rows,meetingBean);
        HashMap<String, Object> map=new HashMap<String, Object>();
        map.put("total",count);
        map.put("rows",list);
        return map;
    }

    @Override
    public HashMap<String, Object> initabroad(Integer page, Integer rows, MeetingBean meetingBean) {
        int count=meetingDao.abroadnum(meetingBean);
        int open=(page-1)*rows;
        List<MeetingBean> list=meetingDao.initabroad(open,rows,meetingBean);
        HashMap<String, Object> map=new HashMap<String, Object>();
        map.put("total",count);
        map.put("rows",list);
        return map;
    }

    @Override
    public MeetingBean findMeetingById(Integer id) {
        return meetingDao.findMeetingById(id);
    }

    @Override
    public void delMeeting(Integer id) {
        meetingDao.delMeeting(id);
    }

    @Override
    public void addMeeting(MeetingBean meetingBean) {
        if(meetingBean.getMeetingid()==null){
            meetingDao.addMeeting(meetingBean);
        }else{
            meetingDao.updMeeting(meetingBean);
        }
    }

    @Override
    public List<ProductBean> initproduct() {
        return meetingDao.initproduct();
    }
}
