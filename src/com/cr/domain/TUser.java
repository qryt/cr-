package com.cr.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	public String getMm1() {
		return mm1;
	}

	public void setMm1(String mm1) {
		this.mm1 = mm1;
	}

	public String getOldmm() {
		return oldmm;
	}

	public void setOldmm(String oldmm) {
		this.oldmm = oldmm;
	}

	private String zh;
	private String xm;
	private String mm;
	private String mm1;
	private String oldmm;
	private String jsmc;
	private String qxfw;
	private Set userRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** full constructor */
	public TUser(String xm, String mm,String mm1,String oldmm, String jsmc, String qxfw, Set userRoles) {
		this.xm = xm;
		this.mm = mm;
		this.mm1=mm1;
		this.jsmc = jsmc;
		this.qxfw = qxfw;
		this.oldmm=oldmm;
		
		this.userRoles = userRoles;
	}

	// Property accessors

	public String getZh() {
		return this.zh;
	}

	public void setZh(String zh) {
		this.zh = zh;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getMm() {
		return this.mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getJsmc() {
		return this.jsmc;
	}

	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}

	public String getQxfw() {
		return this.qxfw;
	}

	public void setQxfw(String qxfw) {
		this.qxfw = qxfw;
	}

	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

}