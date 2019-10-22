package com.zh.model;

public class Jypublicity {
    private Integer cid;

    private Integer pid;

    private String writer;

    private String title;

    private String body;

    private String date;

    private Integer elite;

    private Integer pv;

    public Jypublicity(Integer cid, Integer pid, String writer, String title, String body, String date, Integer elite, Integer pv) {
        this.cid = cid;
        this.pid = pid;
        this.writer = writer;
        this.title = title;
        this.body = body;
        this.date = date;
        this.elite = elite;
        this.pv = pv;
    }

    public Jypublicity() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getElite() {
        return elite;
    }

    public void setElite(Integer elite) {
        this.elite = elite;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }
}