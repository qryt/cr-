package com.cr.domain;

/**
 * TSum entity. @author MyEclipse Persistence Tools
 */

public class TSum implements java.io.Serializable {

	// Fields

	private long id;
	private TJcxxx TJcxxx;
	private String fff;
	private double gs;
	private double gsf;
	private double clf;
	private double hj;

	// Constructors

	/** default constructor */
	public TSum() {
	}

	/** minimal constructor */
	public TSum(TJcxxx TJcxxx) {
		this.TJcxxx = TJcxxx;
	}

	/** full constructor */
	public TSum(TJcxxx TJcxxx, String fff, double gs, double gsf, double clf,
			double hj) {
		this.TJcxxx = TJcxxx;
		this.fff = fff;
		this.gs = gs;
		this.gsf = gsf;
		this.clf = clf;
		this.hj = hj;
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

	public String getFff() {
		return this.fff;
	}

	public void setFff(String fff) {
		this.fff = fff;
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

	public double getHj() {
		return this.hj;
	}

	public void setHj(double hj) {
		this.hj = hj;
	}

}