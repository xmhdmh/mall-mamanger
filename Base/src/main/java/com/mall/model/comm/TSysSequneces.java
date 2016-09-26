package com.mall.model.comm;

import java.util.Date;

public class TSysSequneces {
    private Integer seqCode;

    private String seqName;

    private Integer seqNo;

    private Date seqDate;

    private Integer seqStep;

    private Integer seqMin;

    private Integer seqMax;

    public Integer getSeqCode() {
        return seqCode;
    }

    public void setSeqCode(Integer seqCode) {
        this.seqCode = seqCode;
    }

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public Date getSeqDate() {
        return seqDate;
    }

    public void setSeqDate(Date seqDate) {
        this.seqDate = seqDate;
    }

    public Integer getSeqStep() {
        return seqStep;
    }

    public void setSeqStep(Integer seqStep) {
        this.seqStep = seqStep;
    }

    public Integer getSeqMin() {
        return seqMin;
    }

    public void setSeqMin(Integer seqMin) {
        this.seqMin = seqMin;
    }

    public Integer getSeqMax() {
        return seqMax;
    }

    public void setSeqMax(Integer seqMax) {
        this.seqMax = seqMax;
    }
}