package com.zh.model;

public class Jyclass {
    private Integer cid;

    private String cname;

    private String teacher;

    private Integer ctype;

    private Integer cstatus;

    private String cdate;

    private String school;

    public Jyclass(Integer cid, String cname, String teacher, Integer ctype, Integer cstatus, String cdate, String school) {
        this.cid = cid;
        this.cname = cname;
        this.teacher = teacher;
        this.ctype = ctype;
        this.cstatus = cstatus;
        this.cdate = cdate;
        this.school = school;
    }

    public Jyclass() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public Integer getCstatus() {
        return cstatus;
    }

    public void setCstatus(Integer cstatus) {
        this.cstatus = cstatus;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}