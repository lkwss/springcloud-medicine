package com.jk.pojo;

public class MeetingBean {
    private Integer meetingid;
    private String meetingname;
    private String meetingaddress;
    private String units;
    private Integer meetingstatus;
    private Integer productid;
    private Integer meetingtype;
    private Integer attend;
    private Integer accompany;
    private String remarks;
    private String opendate;
    private String enddate;

    //业务字段
    private String productname;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public String getMeetingname() {
        return meetingname;
    }

    public void setMeetingname(String meetingname) {
        this.meetingname = meetingname;
    }

    public String getMeetingaddress() {
        return meetingaddress;
    }

    public void setMeetingaddress(String meetingaddress) {
        this.meetingaddress = meetingaddress;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getMeetingstatus() {
        return meetingstatus;
    }

    public void setMeetingstatus(Integer meetingstatus) {
        this.meetingstatus = meetingstatus;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getMeetingtype() {
        return meetingtype;
    }

    public void setMeetingtype(Integer meetingtype) {
        this.meetingtype = meetingtype;
    }

    public Integer getAttend() {
        return attend;
    }

    public void setAttend(Integer attend) {
        this.attend = attend;
    }

    public Integer getAccompany() {
        return accompany;
    }

    public void setAccompany(Integer accompany) {
        this.accompany = accompany;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
