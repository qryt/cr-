package com.cr.util;

import org.acegisecurity.providers.encoding.ShaPasswordEncoder;
import org.jasig.cas.authentication.handler.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

	public MyPasswordEncoder() {
		// TODO Auto-generated constructor stub
	}

	public String encode(String arg0) {
		// TODO Auto-generated method stub
		ShaPasswordEncoder p=new ShaPasswordEncoder();
		String pwd=p.encodePassword(arg0, new String("hejh"));
		
		return pwd;
	}

}
