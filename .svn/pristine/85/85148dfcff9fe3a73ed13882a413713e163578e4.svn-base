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

import com.cr.domain.TXxl;
import com.cr.domain.TXxxx;
import com.cr.service.MyService;

public class AddXxlController extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public AddXxlController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TXxl.class);
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
		List list=myService.listAllXxl();
		Iterator it=list.iterator();
		for(;it.hasNext();){
			TXxl xxl=(TXxl)it.next();
 
		 
			data=data+"{cz:'<img src=images/pen.gif alt=\"修改\" onclick=winopen2(\"editxxl.htm?bh="+xxl.getId()+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delxxl(\""+xxl.getId()+"\",\"r\")  style=\"cursor:hand\">', xxl : '"+xxl.getXxl()+"' , mx : '"+xxl.getMx() +"'},";
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
		 TXxl xxl=(TXxl)command;
		 xxl.setXxl(xxl.getXxl().toUpperCase());
		 if(xxl.getXxl().trim().equals(""))
			 errors.rejectValue("xxl", "",  "箱型类不能为空！");
		 else if(!myService.addXxl(xxl)){
			 errors.rejectValue("xxl", "", "添加失败，请与开发人员联系！");
		 }
	}

}
