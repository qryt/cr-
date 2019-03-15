package com.cr.domain;

/**
 * RolePriv entity. @author MyEclipse Persistence Tools
 */

public class RolePriv implements java.io.Serializable {

	// Fields

	private RolePrivId id;

	// Constructors

	/** default constructor */
	public RolePriv() {
	}

	/** full constructor */
	public RolePriv(RolePrivId id) {
		this.id = id;
	}

	// Property accessors

	public RolePrivId getId() {
		return this.id;
	}

	public void setId(RolePrivId id) {
		this.id = id;
	}

}