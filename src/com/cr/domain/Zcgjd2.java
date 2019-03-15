package com.cr.domain;

import java.util.Date;

/**
 * Zcgjd2 entity. @author MyEclipse Persistence Tools
 */

public class Zcgjd2 implements java.io.Serializable {

	// Fields

	private long id;
	private TJcxxx TJcxxx;
	private String wzdm;
	private String shlx;
	private String xlff;
	private String xlmx;
	private String bjmc;
	private String c;
	private String k;
	private double sl;
	private double gs;
	private double gsf;
	private double clf;
	private String fff;
	private String lx;
	private String lrr;
	private Date lrsj;

	// Constructors

	/** default constructor */
	public Zcgjd2() {
	}

	/** full constructor */
	public Zcgjd2(TJcxxx TJcxxx, String wzdm, String shlx, String xlff,
			String xlmx, String bjmc, String c, String k, double sl, double gs,
			double gsf, double clf, String fff, String lx, String lrr, Date lrsj) {
		this.TJcxxx = TJcxxx;
		this.wzdm = wzdm;
		this.shlx = shlx;
		this.xlff = xlff;
		this.xlmx = xlmx;
		this.bjmc = bjmc;
		this.c = c;
		this.k = k;
		this.sl = sl;
		this.gs = gs;
		this.gsf = gsf;
		this.clf = clf;
		this.fff = fff;
		this.lx = lx;
		this.lrr = lrr;
		this.lrsj = lrsj;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TJcxxx getTJcxxx() {
		return this.TJcxxx;
	}

	public void setTJcxxx(TJcxxx TJcxxx) {
		this.TJcxxx = TJcxxx;
	}

	public String getWzdm() {
		return this.wzdm;
	}

	public void setWzdm(String wzdm) {
		this.wzdm = wzdm;
	}

	public String getShlx() {
		return this.shlx;
	}

	public void setShlx(String shlx) {
		this.shlx = shlx;
	}

	public String getXlff() {
		return this.xlff;
	}

	public void setXlff(String xlff) {
		this.xlff = xlff;
	}

	public String getXlmx() {
		return this.xlmx;
	}

	public void setXlmx(String xlmx) {
		this.xlmx = xlmx;
	}

	public String getBjmc() {
		return this.bjmc;
	}

	public void setBjmc(String bjmc) {
		this.bjmc = bjmc;
	}

	public String getC() {
		return this.c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getK() {
		return this.k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public double getSl() {
		return this.sl;
	}

	public void setSl(double sl) {
		this.sl = sl;
	}

	public double getGs() {
		return this.gs;
	}

	public void setGs(double gs) {
		this.gs = gs;
	}

	public double getGsf() {
		return this.gsf;
	}

	public void setGsf(double gsf) {
		this.gsf = gsf;
	}

	public double getClf() {
		return this.clf;
	}

	public void setClf(double clf) {
		this.clf = clf;
	}

	public String getFff() {
		return this.fff;
	}

	public void setFff(String fff) {
		this.fff = fff;
	}

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getLrr() {
		return this.lrr;
	}

	public void setLrr(String lrr) {
		this.lrr = lrr;
	}

	public Date getLrsj() {
		return this.lrsj;
	}

	public void setLrsj(Date lrsj) {
		this.lrsj = lrsj;
	}

}