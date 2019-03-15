package com.cr.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TData entity. @author MyEclipse Persistence Tools
 */

public class TData implements java.io.Serializable {

	// Fields

	private long dataId;
	private long seId;
	private String dataTypeName;
	private Set TDataDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public TData() {
	}

	/** full constructor */
	public TData(long seId, String dataTypeName, Set TDataDetails) {
		this.seId = seId;
		this.dataTypeName = dataTypeName;
		this.TDataDetails = TDataDetails;
	}

	// Property accessors

	public long getDataId() {
		return this.dataId;
	}

	public void setDataId(long dataId) {
		this.dataId = dataId;
	}

	public long getSeId() {
		return this.seId;
	}

	public void setSeId(long seId) {
		this.seId = seId;
	}

	public String getDataTypeName() {
		return this.dataTypeName;
	}

	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

	public Set getTDataDetails() {
		return this.TDataDetails;
	}

	public void setTDataDetails(Set TDataDetails) {
		this.TDataDetails = TDataDetails;
	}

}