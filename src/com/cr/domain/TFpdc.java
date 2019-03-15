package com.cr.domain;

import java.util.Date;

/**
 * TFpdc entity. @author MyEclipse Persistence Tools
 */

public class TFpdc implements java.io.Serializable {

	// Fields

	private long id;
	private TJcxxx TJcxxx;
	private Date zzrq;
	private double dcfl;

	// Constructors

	/** default constructor */
	public TFpdc() {
	}

	/** full constructor */
	public TFpdc(TJcxxx TJcxxx, Date zzrq, double dcfl) {
		this.TJcxxx = TJcxxx;
		this.zzrq = zzrq;
		this.dcfl = dcfl;
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

	public Date getZzrq() {
		return this.zzrq;
	}

	public void setZzrq(Date zzrq) {
		this.zzrq = zzrq;
	}

	public double getDcfl() {
		return this.dcfl;
	}

	public void setDcfl(double dcfl) {
		this.dcfl = dcfl;
	}

}