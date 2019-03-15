package com.cr.controller;

import java.util.ArrayList;
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

import com.cr.domain.TCgsxx;
import com.cr.domain.TDcfl;
import com.cr.service.MyService;

public class EditCgsController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}
public void setMyService(MyService myService) {
	this.myService = myService;
}
	public EditCgsController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TCgsxx.class);
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
		return myService.loadCgsxxById(Long.parseLong(request.getParameter("bh")));
	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		 TCgsxx cgs=(TCgsxx)command;
		 cgs.setGsdm(cgs.getGsdm().toUpperCase());
		 cgs.setLgsdm(cgs.getLgsdm().toUpperCase());
		 cgs.setXz(cgs.getXz().toUpperCase());
		 if(cgs.getGsdm().trim().equals(""))
			 errors.rejectValue("gsdm", "", "公司代码不能为空！");
		 else if(!myService.editCgs(cgs)){
			 errors.rejectValue("gsdm", "", "修改失败，请与开发人员联系！");
		 }
	}

}
