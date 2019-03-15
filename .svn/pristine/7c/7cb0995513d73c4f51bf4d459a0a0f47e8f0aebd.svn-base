package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TWzdm;
import com.cr.domain.TXxl;
import com.cr.service.MyService;

public class EditWzdmController extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}



	public void setMyService(MyService myService) {
		this.myService = myService;
	}



	public EditWzdmController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TWzdm.class);
	}

 

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		return myService.loadWzdm(Long.parseLong(request.getParameter("bh")));
	}



	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		 TWzdm wzdm=(TWzdm)command;
		wzdm.setWzdm(wzdm.getWzdm().toUpperCase());
		 if(wzdm.getWzdm().trim().equals(""))
			 errors.rejectValue("wzdm", "",  "位置代码不能为空！");
		 else if(!myService.editWzdm(wzdm)){
			 errors.rejectValue("wzdm", "", "修改失败，请与开发人员联系！");
		 }
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		Map model=new HashMap();

		String bh=request.getParameter("bh");
		model.put("bh", bh);
		return new ModelAndView(getSuccessView(),model);
	}

}
