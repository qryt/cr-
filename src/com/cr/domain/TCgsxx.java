package com.cr.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * TCgsxx entity. @author MyEclipse Persistence Tools
 */

public class TCgsxx  implements java.io.Serializable {


    // Fields    

     private long gsid;
     private String gsdm;
     private String gsmc;
     private String ywmc;
     private String lxdh;
     private String cz;
     private String fzr;
     private String email;
     private String lgsmc;
     private String lywmc;
     private String llxdh;
     private String lcz;
     private String lfzr;
     private String lemail;
     private String hblx;
     private double gsfl;
     private String lgsdz;
     private String fllx;
     private String lgsdm;
     private String ssgs;
     private String xz;
     private Set TDcfls = new HashSet(0);
     private Set xlfl2s = new HashSet(0);
     private Set TXlfls = new HashSet(0);


    // Constructors

    /** default constructor */
    public TCgsxx() {
    }

	/** minimal constructor */
    public TCgsxx(String gsdm) {
        this.gsdm = gsdm;
    }
    
    /** full constructor */
    public TCgsxx(String gsdm, String gsmc, String ywmc, String lxdh, String cz, String fzr, String email, String lgsmc, String lywmc, String llxdh, String lcz, String lfzr, String lemail, String hblx, double gsfl, String lgsdz, String fllx, String lgsdm, String ssgs, String xz, Set TDcfls, Set xlfl2s, Set TXlfls) {
        this.gsdm = gsdm;
        this.gsmc = gsmc;
        this.ywmc = ywmc;
        this.lxdh = lxdh;
        this.cz = cz;
        this.fzr = fzr;
        this.email = email;
        this.lgsmc = lgsmc;
        this.lywmc = lywmc;
        this.llxdh = llxdh;
        this.lcz = lcz;
        this.lfzr = lfzr;
        this.lemail = lemail;
        this.hblx = hblx;
        this.gsfl = gsfl;
        this.lgsdz = lgsdz;
        this.fllx = fllx;
        this.lgsdm = lgsdm;
        this.ssgs = ssgs;
        this.xz = xz;
        this.TDcfls = TDcfls;
        this.xlfl2s = xlfl2s;
        this.TXlfls = TXlfls;
    }

   
    // Property accessors

    public long getGsid() {
        return this.gsid;
    }
    
    public void setGsid(long gsid) {
        this.gsid = gsid;
    }

    public String getGsdm() {
        return this.gsdm;
    }
    
    public void setGsdm(String gsdm) {
        this.gsdm = gsdm;
    }

    public String getGsmc() {
        return this.gsmc;
    }
    
    public void setGsmc(String gsmc) {
        this.gsmc = gsmc;
    }

    public String getYwmc() {
        return this.ywmc;
    }
    
    public void setYwmc(String ywmc) {
        this.ywmc = ywmc;
    }

    public String getLxdh() {
        return this.lxdh;
    }
    
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getCz() {
        return this.cz;
    }
    
    public void setCz(String cz) {
        this.cz = cz;
    }

    public String getFzr() {
        return this.fzr;
    }
    
    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getLgsmc() {
        return this.lgsmc;
    }
    
    public void setLgsmc(String lgsmc) {
        this.lgsmc = lgsmc;
    }

    public String getLywmc() {
        return this.lywmc;
    }
    
    public void setLywmc(String lywmc) {
        this.lywmc = lywmc;
    }

    public String getLlxdh() {
        return this.llxdh;
    }
    
    public void setLlxdh(String llxdh) {
        this.llxdh = llxdh;
    }

    public String getLcz() {
        return this.lcz;
    }
    
    public void setLcz(String lcz) {
        this.lcz = lcz;
    }

    public String getLfzr() {
        return this.lfzr;
    }
    
    public void setLfzr(String lfzr) {
        this.lfzr = lfzr;
    }

    public String getLemail() {
        return this.lemail;
    }
    
    public void setLemail(String lemail) {
        this.lemail = lemail;
    }

    public String getHblx() {
        return this.hblx;
    }
    
    public void setHblx(String hblx) {
        this.hblx = hblx;
    }

    public double getGsfl() {
        return this.gsfl;
    }
    
    public void setGsfl(double gsfl) {
        this.gsfl = gsfl;
    }

    public String getLgsdz() {
        return this.lgsdz;
    }
    
    public void setLgsdz(String lgsdz) {
        this.lgsdz = lgsdz;
    }

    public String getFllx() {
        return this.fllx;
    }
    
    public void setFllx(String fllx) {
        this.fllx = fllx;
    }

    public String getLgsdm() {
        return this.lgsdm;
    }
    
    public void setLgsdm(String lgsdm) {
        this.lgsdm = lgsdm;
    }

    public String getSsgs() {
        return this.ssgs;
    }
    
    public void setSsgs(String ssgs) {
        this.ssgs = ssgs;
    }

    public String getXz() {
        return this.xz;
    }
    
    public void setXz(String xz) {
        this.xz = xz;
    }

    public Set getTDcfls() {
        return this.TDcfls;
    }
    
    public void setTDcfls(Set TDcfls) {
        this.TDcfls = TDcfls;
    }

    public Set getXlfl2s() {
        return this.xlfl2s;
    }
    
    public void setXlfl2s(Set xlfl2s) {
        this.xlfl2s = xlfl2s;
    }

    public Set getTXlfls() {
        return this.TXlfls;
    }
    
    public void setTXlfls(Set TXlfls) {
        this.TXlfls = TXlfls;
    }
   








}