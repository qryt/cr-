package com.cr.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoSupport {
	private JdbcTemplate jtl=null;

	public JdbcTemplate getJtl() {
		return jtl;
	}

	public void setJtl(JdbcTemplate jtl) {
		this.jtl = jtl;
	}
	public List getObjectList(String sqlSelect){
		List list=jtl.queryForList(sqlSelect);
		return list;
	}
	public void executeSql(String insertSql){
		jtl.execute(insertSql);
	}
}
