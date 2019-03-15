package com.cr.domain;

import java.util.Date;

/**
 * TZcgjd entity. @author MyEclipse Persistence Tools
 */

public class TZcgjd implements java.io.Serializable {

	// Fields

	private long id;
	private TJcxxx TJcxxx;
	private String shdm;
	private String shmx;
	private double sl;
	private double xs;
	private double gsf;
	private double clf;
	private double hj;
	private String sfxl;
	private String fff;
	private String hblx;
	private String shlx;
	private String shwz;
	private String lrr;
	private Date lrsj;

	// Constructors

	/** default constructor */
	public TZcgjd() {
	}

	/** minimal constructor */
	public TZcgjd(TJcxxx TJcxxx) {
		this.TJcxxx = TJcxxx;
	}

	/** full constructor */
	public TZcgjd(TJcxxx TJcxxx, String shdm, String shmx, double sl,
			double xs, double gsf, double clf, double hj, String sfxl,
			String fff, String hblx, String shlx, String shwz, String lrr,
			Date lrsj) {
		this.TJcxxx = TJcxxx;
		this.shdm = shdm;
		this.shmx = shmx;
		this.sl = sl;
		this.xs = xs;
		this.gsf = gsf;
		this.clf = clf;
		this.hj = hj;
		this.sfxl = sfxl;
		this.fff = fff;
		this.hblx = hblx;
		this.shlx = shlx;
		this.shwz = shwz;
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

	public String getShdm() {
		return this.shdm;
	}

	public void setShdm(String shdm) {
		this.shdm = shdm;
	}

	public String getShmx() {
		return this.shmx;
	}

	public void setShmx(String shmx) {
		this.shmx = shmx;
	}

	public double getSl() {
		return this.sl;
	}

	public void setSl(double sl) {
		this.sl = sl;
	}

	public double getXs() {
		return this.xs;
	}

	public void setXs(double xs) {
		this.xs = xs;
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

	public double getHj() {
		return this.hj;
	}

	public void setHj(double hj) {
		this.hj = hj;
	}

	public String getSfxl() {
		return this.sfxl;
	}

	public void setSfxl(String sfxl) {
		this.sfxl = sfxl;
	}

	public String getFff() {
		return this.fff;
	}

	public void setFff(String fff) {
		this.fff = fff;
	}

	public String getHblx() {
		return this.hblx;
	}

	public void setHblx(String hblx) {
		this.hblx = hblx;
	}

	public String getShlx() {
		return this.shlx;
	}

	public void setShlx(String shlx) {
		this.shlx = shlx;
	}

	public String getShwz() {
		return this.shwz;
	}

	public void setShwz(String shwz) {
		this.shwz = shwz;
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