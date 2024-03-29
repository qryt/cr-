package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
 
import com.cr.domain.TXlfl;
import com.cr.service.MyService;

public class EditXlflController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}
public void setMyService(MyService myService) {
	this.myService = myService;
}
	public EditXlflController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TXlfl.class);
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
		return myService.loadXlflById(Long.parseLong(request.getParameter("bh")));
	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		TXlfl xlfl=(TXlfl)command;
		String shmx=xlfl.getShmx().replaceAll("\'", "’");
		shmx=shmx.replaceAll("\"", "”");
		shmx=shmx.replaceAll(",", "，");
		xlfl.setShmx(shmx);
		if(xlfl.getShdm().trim().equals(""))
			errors.rejectValue("shdm", "","损坏代码不能为空！");
		else if(!myService.editXlfl(xlfl))
			 errors.rejectValue("shdm", "", "修改失败，请与开发人员联系！");
	}
}
