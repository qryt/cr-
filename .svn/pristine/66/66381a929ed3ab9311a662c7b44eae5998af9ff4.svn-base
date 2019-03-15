package com.cr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TUser;
import com.cr.service.MyService;
import com.cr.util.MyPasswordEncoder;



 

	public class EditPwdController extends SimpleFormController {
		private MyService myService;
			public EditPwdController() {
				// TODO Auto-generated constructor stub
				this.setCommandClass(TUser.class);
			}

			@Override
			protected ModelAndView onSubmit(HttpServletRequest request,
					HttpServletResponse response, Object command, BindException errors)
					throws Exception {
				// TODO Auto-generated method stub
				TUser tyh=(TUser)command;
				MyPasswordEncoder p=new MyPasswordEncoder();
              TUser user=myService.loadUserById(tyh.getZh());
			user.setMm(p.encode(tyh.getMm()));
			  myService.editUser(user);
				return new ModelAndView(getSuccessView());
			}

			
			@Override
			protected void onBindAndValidate(HttpServletRequest request,
					Object command, BindException errors) throws Exception {
				// TODO Auto-generated method stub
				TUser tyh=(TUser)command;
				 
				if(tyh.getOldmm().trim().equals(""))
					errors.rejectValue("mm","", "旧密码不能为空！");
				else if(tyh.getMm().trim().equals(""))
					errors.rejectValue("mm","", "新密码不能为空！");
				else if(!tyh.getMm().trim().equals(tyh.getMm1().trim()))
					errors.rejectValue("mm","", "两次新密码不一致！");
				else if(!myService.checkPwd(tyh.getZh(),tyh.getOldmm()))
					errors.rejectValue("mm","", "旧密码不正确！");
				
			}
			




			public MyService getMyService() {
				return myService;
			}

			public void setMyService(MyService myService) {
				this.myService = myService;
			}

			@Override
			protected Map referenceData(HttpServletRequest request) throws Exception {
				// TODO Auto-generated method stub
				  Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
				   Object   principal   =   auth.getPrincipal(); 
				   String   userId   =   null; 
				   if(principal   instanceof   UserDetails){ 
				   userId   =   ((UserDetails)principal).getUsername(); 
				   }Map model=new HashMap();
					model.put("username", userId);
					return model;
				   } 
			}