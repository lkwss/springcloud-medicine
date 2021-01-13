package com.jk.pojo;

import java.io.Serializable;

public class StaffBean implements Serializable {
    private static final long serialVersionUID = -2479205222560726699L;
    private Integer staffid;
    private String staffname;
    private String pwd;
    private Integer number;
    private Integer sex;
    private String phone;
    private String email;
    private String vxaccount;
    private String qqaccount;
    private Integer departmentid;
    private Integer positionid;
    private Integer regionid;
    private Integer regionsid;
    private Integer provinceid;
    private String address;
    private Integer productid;
    private Integer staffstatus;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVxaccount() {
        return vxaccount;
    }

    public void setVxaccount(String vxaccount) {
        this.vxaccount = vxaccount;
    }

    public String getQqaccount() {
        return qqaccount;
    }

    public void setQqaccount(String qqaccount) {
        this.qqaccount = qqaccount;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Integer getRegionsid() {
        return regionsid;
    }

    public void setRegionsid(Integer regionsid) {
        this.regionsid = regionsid;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getStaffstatus() {
        return staffstatus;
    }

    public void setStaffstatus(Integer staffstatus) {
        this.staffstatus = staffstatus;
    }
}
