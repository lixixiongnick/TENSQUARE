package com.tensquare.qu.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "tb_pl")
public class Pl implements Serializable {
    @Id
    private String problemid;//问答id

    @Id
    private String labelid;//标签id

    public Pl() {
    }

    public Pl(String problemid, String labelid) {
        this.problemid = problemid;
        this.labelid = labelid;
    }

    public String getProblemid() {
        return problemid;
    }

    public void setProblemid(String problemid) {
        this.problemid = problemid;
    }

    public String getLabelid() {
        return labelid;
    }

    public void setLabelid(String labelid) {
        this.labelid = labelid;
    }
}
