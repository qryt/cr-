package com.cr.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.Zcgjd2;
import com.cr.service.MyService;

public class EditGjd2Controller extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}
	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	public EditGjd2Controller() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(Zcgjd2.class);
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		Map model=new HashMap();
		String bh=request.getParameter("bh");
		model.put("bh", bh);
		String id=request.getParameter("id");
		model.put("id", id);
		return new ModelAndView(getSuccessView(),model);
	}
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		return myService.loadGjd2ById(Long.parseLong(request.getParameter("id")));
	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		Zcgjd2 gjd2=(Zcgjd2)command;
		 String bh=request.getParameter("bh");

		gjd2.setWzdm(gjd2.getWzdm().toUpperCase());
		gjd2.setShlx(gjd2.getShlx().toUpperCase());
       gjd2.setXlff(gjd2.getXlff().toUpperCase());
       gjd2.setBjmc(gjd2.getBjmc().toUpperCase());
       gjd2.setLx(gjd2.getLx().toUpperCase());
       gjd2.setSl(gjd2.getSl());
       gjd2.setC(gjd2.getC().toUpperCase());
       gjd2.setK(gjd2.getK().toUpperCase());
       
	
		if(gjd2.getWzdm().trim().equals(""))
				errors.rejectValue("wzdm", "","位置代码不能为空！");
		 else if(gjd2.getXlff().trim().equals(""))
				errors.rejectValue("xlff", "","修理方法不能为空！");
		 else if(gjd2.getBjmc().trim().equals(""))
				errors.rejectValue("bjmc", "","部件名称不能为空！");
		 else if(isInteger(gjd2.getLx().trim())&&gjd2.getSl()!=1)
				errors.rejectValue("lx", "","当类型为数字时,数量必须为1！");
		 else if(gjd2.getC().trim().equals(""))
				errors.rejectValue("c", "","长不能为空！");	
		 else if(gjd2.getK().trim().equals(""))
				errors.rejectValue("k", "","宽不能为空！");
		
			else if(!myService.editGjd2(gjd2)){
				errors.rejectValue("wzdm", "","添加失败，请与开发人员联系！");
			}
	}
	private boolean isInteger(String lx) {
	    Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");    
	    return pattern.matcher(lx).matches();  
	}
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		List list=myService.listvar("select a.gs,a.clf,b.gsfl from xlfl2 a,t_cgsxx b,zcgjd2 c,t_jcxxx d where  c.id="+request.getParameter("id")+"  and a.lx=c.lx and a.xlff=c.xlff and a.bjmc=c.bjmc and a.c=c.c and a.k=c.k    and c.rcbh=d.rcbh and d.cgs=b.gsdm and a.gsid=b.gsid ");
 
		String gs="0";
		String clf="0";
		String gsfl="0";
		Map model=new HashMap();
		System.out.println(list.size());
		 if(list.size()>0){
			Map map=(Map)list.get(0);
			gs=map.get("gs").toString();
			clf=map.get("clf").toString();
			gsfl=map.get("gsfl").toString();
			
		}
		System.out.println(gs);
		model.put("gs", gs);
		model.put("clf", clf);
		model.put("gsfl", gsfl);
		
		return model;
	}
 

}
