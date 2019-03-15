package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TXxl;
import com.cr.service.MyService;

public class EditXxlController extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public EditXxlController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TXxl.class);
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
		return myService.loadXxl(Long.parseLong(request.getParameter("bh")));
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		 TXxl xxl=(TXxl)command;
		 xxl.setXxl(xxl.getXxl().toUpperCase());
		 if(xxl.getXxl().trim().equals(""))
			 errors.rejectValue("xxl", "",  "箱型类不能为空！");
		 else if(!myService.editXxl(xxl)){
			 errors.rejectValue("xxl", "", "修改失败，请与开发人员联系！");
		 }
	}

}
