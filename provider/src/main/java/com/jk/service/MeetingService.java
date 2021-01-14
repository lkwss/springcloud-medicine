package com.jk.service;

import com.jk.pojo.MeetingBean;

import java.util.HashMap;

public interface MeetingService {
    HashMap<String, Object> initdomestic(Integer page, Integer rows, MeetingBean meetingBean);

    HashMap<String, Object> initabroad(Integer page, Integer rows, MeetingBean meetingBean);

    MeetingBean findMeetingById(Integer id);

    void delMeeting(Integer id);

    void addMeeting(MeetingBean meetingBean);
}
