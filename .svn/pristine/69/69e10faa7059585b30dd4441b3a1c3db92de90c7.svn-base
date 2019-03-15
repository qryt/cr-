package com.cr.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TShlxsz;
import com.cr.service.MyService;

public class AddShlxController extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public AddShlxController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TShlxsz.class);
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView(getSuccessView());
	}

	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		Map model =new HashMap();
		String data="";
		List list=myService.listAllShlx();
		Iterator it=list.iterator();
		for(;it.hasNext();){
			TShlxsz shlx=(TShlxsz)it.next();
 
		 
			data=data+"{cz:'<img src=images/pen.gif alt=\"修改\" onclick=winopen2(\"editshlx.htm?bh="+shlx.getShlxdm()+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delshlx(\""+shlx.getShlxdm()+"\",\"r\")  style=\"cursor:hand\">', lxdm : '"+shlx.getShlxdm()+"' , lxmc : '"+shlx.getShlxmc()+"' , lxmx : '"+shlx.getShlxmx()+"'},";
		}
		if(data.length()>0)
		data=data.substring(0,data.length()-1);
		model.put("data",data);
		return model;
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		 TShlxsz shlx=(TShlxsz)command;
		 shlx.setShlxdm(shlx.getShlxdm().trim().toUpperCase());
		 if(shlx.getShlxdm().equals(""))
			 errors.rejectValue("shlxdm", "",  "损坏类型代码不能为空！");
		 else if(!myService.addShlxsz(shlx)){
			 errors.rejectValue("shlxdm", "", "添加失败，请与开发人员联系！");
		 }
	}

}
