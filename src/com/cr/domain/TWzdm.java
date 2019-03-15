package com.cr.domain;

/**
 * TWzdm entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TWzdm implements java.io.Serializable {

	// Fields

	private long id;
	private String wzdm;

	// Constructors

	/** default constructor */
	public TWzdm() {
	}

	/** full constructor */
	public TWzdm(String wzdm) {
		this.wzdm = wzdm;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWzdm() {
		return this.wzdm;
	}

	public void setWzdm(String wzdm) {
		this.wzdm = wzdm;
	}

}