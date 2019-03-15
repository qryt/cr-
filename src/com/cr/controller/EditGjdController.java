package com.cr.controller;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TZcgjd;
import com.cr.service.MyService;

public class EditGjdController extends SimpleFormController {
private MyService myService;

	public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}

	public EditGjdController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TZcgjd.class);
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
	return myService.loadGjdById(Long.parseLong(request.getParameter("id")));
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		TZcgjd gjd=(TZcgjd)command;
		 String bh=request.getParameter("bh");
		 
		 gjd.setShlx(gjd.getShlx().toUpperCase());
		 gjd.setShdm(gjd.getShdm().toUpperCase());
		 gjd.setShwz(gjd.getShwz().toUpperCase());
		  if(gjd.getShdm().trim().equals(""))
				errors.rejectValue("shdm", "","损坏代码不能为空!");
		  else if(gjd.getShlx().trim().equals(""))
				errors.rejectValue("shlx", "","损坏类型不能为空!");

			 
			else if(!myService.editGjd(gjd)){
				errors.rejectValue("shdm", "","修改失败，请与开发人员联系!");
			}
	}

	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		List list=myService.listvar("select a.gs,a.clf,b.gsfl from t_xlfl a,t_cgsxx b,t_zcgjd c,t_jcxxx d where  c.id="+request.getParameter("id")+" and a.shdm=c.shdm   and c.rcbh=d.rcbh and d.cgs=b.gsdm and a.gsid=b.gsid ");
		Iterator it=list.iterator();
		String gs="0";
		String clf="0";
		String gsfl="0";
		Map model=new HashMap();
		for(;it.hasNext();){
			Map map=(Map)it.next();
			gs=map.get("gs").toString();
			clf=map.get("clf").toString();
			gsfl=map.get("gsfl").toString();
			
		}
		model.put("gs", gs);
		model.put("clf", clf);
		model.put("gsfl", gsfl);
		
		return model;
	}
 

}
