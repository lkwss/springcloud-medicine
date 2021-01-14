package com.jk.dao;

import com.jk.pojo.MeetingBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MeetingDao {
    int domesticnum(@Param("meet")MeetingBean meetingBean);

    List<MeetingBean> initdomestic(@Param("open") int open, @Param("rows")Integer rows, @Param("meet")MeetingBean meetingBean);

    int abroadnum(@Param("meet") MeetingBean meetingBean);

    List<MeetingBean> initabroad(@Param("open")int open,@Param("rows") Integer rows, @Param("meet")MeetingBean meetingBean);

    MeetingBean findMeetingById(Integer id);

    void delMeeting(Integer id);

    void addMeeting(MeetingBean meetingBean);

    void updMeeting(MeetingBean meetingBean);
}
