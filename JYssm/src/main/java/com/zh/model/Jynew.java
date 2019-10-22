package com.zh.model;

public class Jynew {
    private Integer nid;

    private String writer;

    private String ntitle;

    private String nbody;

    private String ndate;

    private Integer elite;

    private Integer pv;

    public Jynew(Integer nid, String writer, String ntitle, String nbody, String ndate, Integer elite, Integer pv) {
        this.nid = nid;
        this.writer = writer;
        this.ntitle = ntitle;
        this.nbody = nbody;
        this.ndate = ndate;
        this.elite = elite;
        this.pv = pv;
    }

    public Jynew() {
        super();
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
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