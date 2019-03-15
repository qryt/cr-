package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TRole;
import com.cr.service.MyService;

public class EditRoleController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}

	public EditRoleController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TRole.class);
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
		return myService.loadRoleById(Long.parseLong(request.getParameter("bh")));
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		TRole role=(TRole)command;
		 if(role.getRName().trim().equals(""))
			 errors.rejectValue("RName", "","请输入角色名称！");
		 else if(role.getRCaption().trim().equals(""))
			 errors.rejectValue("RCaption", "", "请输入角色标题！");
		 else if(!myService.editRole(role))
			 errors.rejectValue("RName", "","修改失败，请与开发人员联系！");
	}

}
