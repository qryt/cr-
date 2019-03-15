package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.Xlfl2;
import com.cr.service.MyService;

public class EditXlfl2Controller extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public EditXlfl2Controller() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(Xlfl2.class);
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
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		Xlfl2 xlfl2=(Xlfl2)command;
		xlfl2.setLx(xlfl2.getLx().toUpperCase());
		xlfl2.setBjmc(xlfl2.getBjmc().toUpperCase());
		xlfl2.setXlff(xlfl2.getXlff().toUpperCase());
		xlfl2.setC(xlfl2.getC().toUpperCase());
		xlfl2.setK(xlfl2.getK().toUpperCase());
		String xlmx=xlfl2.getXlmx();
		xlmx=xlmx.replaceAll("\'", "’");
		xlmx=xlmx.replaceAll("\"", "”");
		xlmx=xlmx.replaceAll(",", "，");
		xlfl2.setXlmx(xlmx);
if(xlfl2.getLx().trim().equals(""))
	errors.rejectValue("lx","","类型不能为空！");
else if(xlfl2.getBjmc().trim().equals(""))
	errors.rejectValue("bjmc", "", "部件名称不能为空！");
else if(xlfl2.getXlff().trim().equals(""))
	errors.rejectValue("xlff", "", "修理方法不能为空！");
else if(xlfl2.getC().trim().equals(""))
			errors.rejectValue("c", "", "长不能为空！");
else if(xlfl2.getK().trim().equals(""))
	errors.rejectValue("k", "", "宽不能为空！");
		else if(!myService.editXlfl2(xlfl2))
			 errors.rejectValue("xlff", "", "添加失败，请与开发人员联系！");
	
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		return myService.loadXlfl2ById(Long.parseLong(request.getParameter("bh")));

	}

}
