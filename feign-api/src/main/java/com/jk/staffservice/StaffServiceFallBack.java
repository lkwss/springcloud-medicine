package com.jk.staffservice;

import com.jk.pojo.MeetingBean;
import com.jk.pojo.TreeBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
@Component
public class StaffServiceFallBack implements StaffService {
    @Override
    public List<TreeBean> initTree() {
        return null;
    }

    @Override
    public HashMap<String, Object> initdomestic(Integer page, Integer rows, MeetingBean meetingBean) {
        return null;
    }

    @Override
    public HashMap<String, Object> initabroad(Integer page, Integer rows, MeetingBean meetingBean) {
        return null;
    }

    @Override
    public MeetingBean findMeetingById(Integer id) {
        return null;
    }

    @Override
    public void delMeeting(Integer id) {

    }

    @Override
    public void addMeeting(MeetingBean meetingBean) {

    }
}
