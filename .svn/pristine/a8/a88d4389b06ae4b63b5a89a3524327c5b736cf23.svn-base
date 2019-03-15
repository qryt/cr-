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

import com.cr.domain.TJcxxx;
import com.cr.domain.TXxxx;
import com.cr.service.MyService;

public class AddXxController extends SimpleFormController {
	private MyService myService;
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
		List list=myService.listAllXx();
		Iterator it=list.iterator();
		for(;it.hasNext();){
			TXxxx xx=(TXxxx)it.next();
 
		 
			data=data+"{cz:'<img src=images/pen.gif alt=\"修改\" onclick=winopen2(\"editxx.htm?bh="+xx.getXxdm()+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delxx(\""+xx.getXxdm()+"\",\"r\")  style=\"cursor:hand\">', xxdm : '"+xx.getXxdm()+"' , xxmc : '"+xx.getXxmc()+"' , xxmx : '"+xx.getXxmx()+"'},";
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
	 TXxxx xx=(TXxxx)command;
	 xx.setXxdm(xx.getXxdm().toUpperCase());
	 if(xx.getXxdm().trim().equals(""))
		 errors.rejectValue("xxdm", "",  "箱型代码不能为空！");
	 else if(!myService.addXx(xx)){
		 errors.rejectValue("xxdm", "", "添加失败，请与开发人员联系！");
	 }
	}
	public AddXxController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TXxxx.class);
	}
	public MyService getMyService() {
		return myService;
	}
	public void setMyService(MyService myService) {
		this.myService = myService;
	}

}
