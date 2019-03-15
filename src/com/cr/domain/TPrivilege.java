package com.cr.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TPrivilege entity. @author MyEclipse Persistence Tools
 */

public class TPrivilege implements java.io.Serializable {

	// Fields

	private long privId;
	private String privName;
	private String privTitle;
	private String privDetail;
	private Set rolePrivs = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPrivilege() {
	}

	/** full constructor */
	public TPrivilege(String privName, String privTitle, String privDetail,
			Set rolePrivs) {
		this.privName = privName;
		this.privTitle = privTitle;
		this.privDetail = privDetail;
		this.rolePrivs = rolePrivs;
	}

	// Property accessors

	public long getPrivId() {
		return this.privId;
	}

	public void setPrivId(long privId) {
		this.privId = privId;
	}

	public String getPrivName() {
		return this.privName;
	}

	public void setPrivName(String privName) {
		this.privName = privName;
	}

	public String getPrivTitle() {
		return this.privTitle;
	}

	public void setPrivTitle(String privTitle) {
		this.privTitle = privTitle;
	}

	public String getPrivDetail() {
		return this.privDetail;
	}

	public void setPrivDetail(String privDetail) {
		this.privDetail = privDetail;
	}

	public Set getRolePrivs() {
		return this.rolePrivs;
	}

	public void setRolePrivs(Set rolePrivs) {
		this.rolePrivs = rolePrivs;
	}

}