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
import com.cr.domain.UserRole;
import com.cr.domain.UserRoleId;
import com.cr.service.MyService;

public class AddYhController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}

	public AddYhController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TUser.class);
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
		List list=myService.listAllUser();
		Iterator it=list.iterator();
		for(;it.hasNext();){
			TUser user=(TUser)it.next();
 data=data+"{cz:'<img src=images/pen.gif alt=\"修改\" onclick=winopen2(\"edityh.htm?bh="+user.getZh()+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delyh(\""+user.getZh()+"\",\"r\")  style=\"cursor:hand;\">&nbsp;&nbsp;<a href=\"#\" onclick=hy(\""+user.getZh()+"\",\"r\")>密码重置</a>', zh : '"+user.getZh()+"' , xm : '"+user.getXm()+"' , jsmc : '"+user.getJsmc()+"' , qxfw : '"+user.getQxfw()+"'},";
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
		TUser user=(TUser)command;
		 String[] arr=user.getJsmc().split(",");
	 		if(user.getJsmc()!=null&&!user.getJsmc().trim().equals("")&&arr.length>0){
	 		 for(int i=0;i<arr.length;i++){
	 			
	 			 UserRole ur=new UserRole();
	 	         UserRoleId ud=new UserRoleId();
	 	         
	 	       ud.setTUser(user);
	 	        TRole role= myService.loadRoleByCaption(arr[i]);
	 			ud.setTRole(role);
	 			ur.setId(ud);
	 			
	 			user.getUserRoles().add(ur);
	 		 }
	 		}
		if(user.getZh().trim().equals(""))
		errors.rejectValue("zh", "", "帐号不能为空!");
		else if(user.getMm().trim().equals(""))
		errors.rejectValue("mm", "", "密码不能为空!");
		else if(!myService.findUserByZh(user.getZh().trim()))
			errors.rejectValue("zh","", "该帐号已经存在,不能添加!");
		else if(!myService.addUser(user))
        errors.rejectValue("zh","","添加失败,请与开发人员联系!");
		
	}

}
