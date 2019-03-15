package com.cr.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TRole entity. @author MyEclipse Persistence Tools
 */

public class TRole implements java.io.Serializable {

	// Fields

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private long roleId;
	private String RName;
	private String RCaption;
	private String RDescription;
	private String color;
	private Set rolePrivs = new HashSet(0);
	private Set userRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public TRole() {
	}

	/** full constructor */
	public TRole(String RName, String RCaption, String RDescription,
			Set rolePrivs, Set userRoles) {
		this.RName = RName;
		this.RCaption = RCaption;
		this.RDescription = RDescription;
		this.rolePrivs = rolePrivs;
		this.userRoles = userRoles;
	}

	// Property accessors

	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRName() {
		return this.RName;
	}

	public void setRName(String RName) {
		this.RName = RName;
	}

	public String getRCaption() {
		return this.RCaption;
	}

	public void setRCaption(String RCaption) {
		this.RCaption = RCaption;
	}

	public String getRDescription() {
		return this.RDescription;
	}

	public void setRDescription(String RDescription) {
		this.RDescription = RDescription;
	}

	public Set getRolePrivs() {
		return this.rolePrivs;
	}

	public void setRolePrivs(Set rolePrivs) {
		this.rolePrivs = rolePrivs;
	}

	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

}