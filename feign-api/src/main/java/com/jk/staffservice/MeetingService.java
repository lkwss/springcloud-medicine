package com.jk.staffservice;

import com.jk.pojo.MeetingBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@FeignClient(value = "service-provider",fallback = MeetingServiceFallBack.class)
public interface MeetingService {

    @RequestMapping("meeting/initdomestic")
    HashMap<String, Object> initdomestic(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows")Integer rows, MeetingBean meetingBean);
    @RequestMapping("meeting/initabroad")
    HashMap<String, Object> initabroad(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows")Integer rows, MeetingBean meetingBean);
    @RequestMapping("meeting/findMeetingById")
    MeetingBean findMeetingById(@RequestParam(value = "id")Integer id);
    @RequestMapping("meeting/delMeeting")
    void delMeeting(@RequestParam(value = "id")Integer id);
    @RequestMapping("meeting/addMeeting")
    void addMeeting(MeetingBean meetingBean);
}
