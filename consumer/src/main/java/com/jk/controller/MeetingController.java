package com.jk.controller;

import com.jk.pojo.MeetingBean;
import com.jk.pojo.ProductBean;
import com.jk.staffservice.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/meeting")
public class MeetingController {
    @Autowired
    private StaffService meetingService;
    /**
     * @Author: lkw
     * @Description:查询国际会议
     * @Date: 2021/1/13 20:27
      * @param page
     * @param rows
     * @param meetingBean
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("initdomestic")
    @ResponseBody
    public HashMap<String,Object> initdomestic(Integer page, Integer rows, MeetingBean meetingBean){
        return meetingService.initdomestic(page,rows,meetingBean);
    }
    /**
     * @Author: lkw
     * @Description:查询国内会议
     * @Date: 2021/1/13 20:35
      * @param page
     * @param rows
     * @param meetingBean
     * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("initabroad")
    @ResponseBody
    public HashMap<String,Object> initabroad(Integer page, Integer rows, MeetingBean meetingBean){
        return meetingService.initabroad(page,rows,meetingBean);
    }
    /**
     * @Author: lkw
     * @Description:回显会议信息
     * @Date: 2021/1/13 20:37
      * @param id
     * @Return: com.jk.pojo.MeetingBean
     **/
    @RequestMapping("findMeetingById")
    @ResponseBody
    public MeetingBean findMeetingById(Integer id){
        return meetingService.findMeetingById(id);
    }
    /**
     * @Author: lkw
     * @Description:删除会议数据
     * @Date: 2021/1/13 20:51
      * @param id
     * @Return: void
     **/
    @RequestMapping("delMeeting")
    @ResponseBody
    public void delMeeting(Integer id){
        meetingService.delMeeting(id);
    }

    /**
     * @Author: lkw
     * @Description:新增会议
     * @Date: 2021/1/14 11:31
      * @param meetingBean
     * @Return: void
     **/
    @RequestMapping("addMeeting")
    @ResponseBody
    public void addMeeting(MeetingBean meetingBean){
        meetingService.addMeeting(meetingBean);
    }
    /**
     * @Author: lkw
     * @Description:动态加载项目组信息
     * @Date: 2021/1/14 17:11
      * @param
     * @Return: java.util.List<com.jk.pojo.ProductBean>
     **/
    @RequestMapping("initproduct")
    @ResponseBody
    public List<ProductBean> initproduct(){
        return meetingService.initproduct();
    }
}
