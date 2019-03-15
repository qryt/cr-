package com.cr.domain;

/**
 * TDcfl entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TDcfl implements java.io.Serializable {

	// Fields

	private long id;
	private TCgsxx TCgsxx;
	private String cc;
	private String xx;
	private double qdf;
	private double tyf;
	private double dcfl;
	private double bgdcf;
	private String hblx;

	// Constructors

	/** default constructor */
	public TDcfl() {
	}

	/** full constructor */
	public TDcfl(TCgsxx TCgsxx, String cc, String xx, double qdf, double tyf,
			double dcfl, double bgdcf, String hblx) {
		this.TCgsxx = TCgsxx;
		this.cc = cc;
		this.xx = xx;
		this.qdf = qdf;
		this.tyf = tyf;
		this.dcfl = dcfl;
		this.bgdcf = bgdcf;
		this.hblx = hblx;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TCgsxx getTCgsxx() {
		return this.TCgsxx;
	}

	public void setTCgsxx(TCgsxx TCgsxx) {
		this.TCgsxx = TCgsxx;
	}

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getXx() {
		return this.xx;
	}

	public void setXx(String xx) {
		this.xx = xx;
	}

	public double getQdf() {
		return this.qdf;
	}

	public void setQdf(double qdf) {
		this.qdf = qdf;
	}

	public double getTyf() {
		return this.tyf;
	}

	public void setTyf(double tyf) {
		this.tyf = tyf;
	}

	public double getDcfl() {
		return this.dcfl;
	}

	public void setDcfl(double dcfl) {
		this.dcfl = dcfl;
	}

	public double getBgdcf() {
		return this.bgdcf;
	}

	public void setBgdcf(double bgdcf) {
		this.bgdcf = bgdcf;
	}

	public String getHblx() {
		return this.hblx;
	}

	public void setHblx(String hblx) {
		this.hblx = hblx;
	}

}