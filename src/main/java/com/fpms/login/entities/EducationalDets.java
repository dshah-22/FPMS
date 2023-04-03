package com.fpms.login.entities;

public class EducationalDets{
    String primaryEdu,secondaryEdu,ugc,pgc,phd;
    Float secondaryPercent,ugcPercent,pgcPercent,phdPercent;

    public EducationalDets(String primaryEdu, String secondaryEdu, String ugc, String pgc, String phd, Float secondaryPercent, Float ugcPercent, Float pgcPercent, Float phdPercent) {
        this.primaryEdu = primaryEdu;
        this.secondaryEdu = secondaryEdu;
        this.ugc = ugc;
        this.pgc = pgc;
        this.phd = phd;
        this.secondaryPercent = secondaryPercent;
        this.ugcPercent = ugcPercent;
        this.pgcPercent = pgcPercent;
        this.phdPercent = phdPercent;
    }

    public String getPrimaryEdu() {
        return primaryEdu;
    }

    public void setPrimaryEdu(String primaryEdu) {
        this.primaryEdu = primaryEdu;
    }

    public String getSecondaryEdu() {
        return secondaryEdu;
    }

    public void setSecondaryEdu(String secondaryEdu) {
        this.secondaryEdu = secondaryEdu;
    }

    public String getUgc() {
        return ugc;
    }

    public void setUgc(String ugc) {
        this.ugc = ugc;
    }

    public String getPgc() {
        return pgc;
    }

    public void setPgc(String pgc) {
        this.pgc = pgc;
    }

    public String getPhd() {
        return phd;
    }

    public void setPhd(String phd) {
        this.phd = phd;
    }

    public Float getSecondaryPercent() {
        return secondaryPercent;
    }

    public void setSecondaryPercent(Float secondaryPercent) {
        this.secondaryPercent = secondaryPercent;
    }

    public Float getUgcPercent() {
        return ugcPercent;
    }

    public void setUgcPercent(Float ugcPercent) {
        this.ugcPercent = ugcPercent;
    }

    public Float getPgcPercent() {
        return pgcPercent;
    }

    public void setPgcPercent(Float pgcPercent) {
        this.pgcPercent = pgcPercent;
    }

    public Float getPhdPercent() {
        return phdPercent;
    }

    public void setPhdPercent(Float phdPercent) {
        this.phdPercent = phdPercent;
    }

    @Override
    public String toString() {
        return "EducationalDets{" +
                "primaryEdu='" + primaryEdu + '\'' +
                ", secondaryEdu='" + secondaryEdu + '\'' +
                ", ugc='" + ugc + '\'' +
                ", pgc='" + pgc + '\'' +
                ", phd='" + phd + '\'' +
                ", secondaryPercent=" + secondaryPercent +
                ", ugcPercent=" + ugcPercent +
                ", pgcPercent=" + pgcPercent +
                ", phdPercent=" + phdPercent +
                '}';
    }
}
