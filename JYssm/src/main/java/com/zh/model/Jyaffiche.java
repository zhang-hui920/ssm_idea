package com.zh.model;

public class Jyaffiche {
    private Integer aid;

    private String writer;

    private String ntitle;

    private String nbody;

    private String ndate;

    private String grade;

    private Integer pv;

    public Jyaffiche(Integer aid, String writer, String ntitle, String nbody, String ndate, String grade, Integer pv) {
        this.aid = aid;
        this.writer = writer;
        this.ntitle = ntitle;
        this.nbody = nbody;
        this.ndate = ndate;
        this.grade = grade;
        this.pv = pv;
    }

    public Jyaffiche() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNbody() {
        return nbody;
    }

    public void setNbody(String nbody) {
        this.nbody = nbody;
    }

    public String getNdate() {
        return ndate;
    }

    public void setNdate(String ndate) {
        this.ndate = ndate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }
}