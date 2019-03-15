package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TXxxx;
import com.cr.service.MyService;

public class EditXxController extends SimpleFormController {
MyService myService;
	public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}

	public EditXxController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TXxxx.class);
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

 

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		return myService.loadXxById(request.getParameter("bh"));
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
	TXxxx xx=(TXxxx)command;
	xx.setXxdm(xx.getXxdm().toUpperCase());
	if(xx.getXxdm().trim().equals(""))
		errors.rejectValue("xxdm", "", "箱型代码不能为空！");
	else if(!myService.editXx(xx))
		errors.rejectValue("xxdm", "", "修改失败，请与开发人员联系！");
	}

}
