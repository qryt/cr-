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

import com.cr.domain.TRole;
import com.cr.domain.TUser;
import com.cr.service.MyService;

public class AddJsController extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public AddJsController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TRole.class);
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
		List list=myService.listAllRole();
		Iterator it=list.iterator();
		for(;it.hasNext();){
			TRole role=(TRole)it.next();
 data=data+"{cz:'<img src=images/pen.gif alt=\"修改\" onclick=winopen2(\"editrole.htm?bh="+role.getRoleId()+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delrole(\""+role.getRoleId()+"\",\"r\")  style=\"cursor:hand;\">', RName : '"+role.getRName()+"' , RCaption : '"+role.getRCaption()+"', RDescription : '"+role.getRDescription()+"'},";
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
 TRole role=(TRole)command;
 if(role.getRName().trim().equals(""))
	 errors.rejectValue("RName", "","请输入角色名称！");
 else if(role.getRCaption().trim().equals(""))
	 errors.rejectValue("RCaption", "", "请输入角色标题！");
 else if(!myService.addRole(role))
	 errors.rejectValue("RName", "","添加失败，请与开发人员联系！");
	}

}
