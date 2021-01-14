package com.jk.staffservice;

import com.jk.pojo.MeetingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MeetingServiceFallBack implements MeetingService {
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
}
