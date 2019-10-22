package com.zh.model;

public class Jycomment {
    private Integer cid;

    private Integer nid;

    private String cbody;

    private String cdate;

    private String uid;

    public Jycomment(Integer cid, Integer nid, String cbody, String cdate, String uid) {
        this.cid = cid;
        this.nid = nid;
        this.cbody = cbody;
        this.cdate = cdate;
        this.uid = uid;
    }

    public Jycomment() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getCbody() {
        return cbody;
    }

    public void setCbody(String cbody) {
        this.cbody = cbody;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}