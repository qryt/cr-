package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TDcfl;
import com.cr.service.MyService;

public class EditDcflController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}
public void setMyService(MyService myService) {
	this.myService = myService;
}
	public EditDcflController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TDcfl.class);
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
		return myService.loadDcflById(Long.parseLong(request.getParameter("bh")));
	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		TDcfl dcfl=(TDcfl)command;
		dcfl.setXx(dcfl.getXx().toUpperCase());
		if(dcfl.getCc().trim().equals(""))
			errors.rejectValue("cc", "", "尺寸不能为空！");
		else if(!myService.editDcfl(dcfl))
			 errors.rejectValue("cc", "", "修改失败，请与开发人员联系！");
	}

}
