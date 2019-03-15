package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TRole;
import com.cr.domain.TUser;
import com.cr.domain.UserRole;
import com.cr.domain.UserRoleId;
import com.cr.service.MyService;

public class EditYhController extends SimpleFormController {
MyService myService;
	public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}

	public EditYhController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TUser.class);
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
		return myService.loadUserById(request.getParameter("bh"));
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
         TUser user=(TUser)command;
        myService.delUserRoleByZh(user.getZh());
         String[] arr=user.getJsmc().split(",");
 		if(user.getJsmc()!=null&&!user.getJsmc().trim().equals("")&&arr.length>0){
 		 for(int i=0;i<arr.length;i++){
 			
 			 UserRole ur=new UserRole();
 	         UserRoleId ud=new UserRoleId();
 	         
 	       ud.setTUser(myService.loadUserById(user.getZh()));
 	        TRole role= myService.loadRoleByCaption(arr[i]);
 			ud.setTRole(role);
 			ur.setId(ud);
 			
 			user.getUserRoles().add(ur);
 		 }
 		}
        if(!myService.editYh(user))
        	errors.rejectValue("zh", "", "修改失败,请与开发人员联系!");
	}

}
