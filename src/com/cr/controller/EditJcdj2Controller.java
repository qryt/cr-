package com.cr.controller;

import java.math.BigDecimal;
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

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TJcxxx;
import com.cr.service.MyService;

public class EditJcdj2Controller extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}
	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	public EditJcdj2Controller() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TJcxxx.class);
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		TJcxxx jc=(TJcxxx)command;
		Map model=new HashMap();

		model.put("bh",jc.getRcbh());
		model.put("operation", request.getParameter("operation"));
	
		return new ModelAndView(getSuccessView(),model);
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		
		return myService.loadTJcxxxBybh(request.getParameter("bh"));
	}
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		// TODO Auto-generated method stub
		 DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
		    CustomDateEditor dateEditor = new CustomDateEditor(fmt, true); 
		    binder.registerCustomEditor(Date.class, dateEditor); 
		    super.initBinder(request, binder); 

	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		TJcxxx jc=(TJcxxx)command;
		  Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
		   Object   principal   =   auth.getPrincipal(); 
		   String   userId   =   null; 
		   if(principal   instanceof   UserDetails){ 
		   userId   =   ((UserDetails)principal).getUsername(); 
		   }
		//jc.setLlr(userId);
		//jc.setLlrq(new Date());
 jc.setJctc(request.getParameter("hjctc").toUpperCase());
		  jc.setCctc(request.getParameter("hcctc").toUpperCase());
		   jc.setXh(jc.getXh().toUpperCase());
		   jc.setXx(jc.getXx().toUpperCase());
		   jc.setCgs(jc.getCgs().toUpperCase());
		   jc.setTdh(jc.getTdh().toUpperCase());
		
		  if(!jc.getJczt().equals("NM"))
		   if((jc.getZdbh()==null||jc.getZdbh().trim().equals("")))
			   jc.setZdbh(myService.getJczt(jc.getCgs()));
			if(null!=jc.getCcrq()){
				jc.setJczt("NM");
			}
		if(jc.getRcbh().trim().equals(""))
			errors.rejectValue("rcbh","", "入场编号不能为空！");
		else if(jc.getXh().trim().equals(""))
			errors.rejectValue("xh", "","箱号不能为空！");
		else if(jc.getCgs().trim().equals(""))
			errors.rejectValue("xh", "","船公司不能为空！");
		else if(jc.getJcrq()==null)
			errors.rejectValue("jcrq", "","进场日期不能为空！");
		else if(!myService.editJcxxx(jc)){
			errors.rejectValue("xh", "","修改失败，请与开发人员联系！");
		}
	}

	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
		DecimalFormat  intFormat = new DecimalFormat("#0");
		Map model =new HashMap();
		String data="";
		String gs="0.00";
		String gsf="0.00";
		String clf="0.00";
		String hj="0.00";
		List xxls=myService.listAllXxl();
		List list=myService.listGjd2(request.getParameter("bh"));
		 		Iterator it=list.iterator();
		for(;it.hasNext();){
			Map map=(Map)it.next();
 
		 
			data=data+"['<img src=images/pen.gif alt=\"修改\" onclick=winopen1(\"editgjd2.htm?id="+map.get("id")+"&bh="+request.getParameter("bh")+"&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delgjd2(\""+map.get("id")+"\",\"r\")  style=\"cursor:hand\">','"+map.get("shlx")+"' ,'"+map.get("wzdm")+"' ,'"+map.get("lx")+"' ,'"+map.get("xlff")+"' ,'"+map.get("bjmc")+"' ,'"+map.get("xlmx")+"' ,'"+map.get("c")+"' ,'"+map.get("k")+"' ,'"+intFormat.format(Double.parseDouble(map.get("sl").toString()))+"' ,'"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("gsf").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"','"+map.get("fff")+"','"+map.get("lrr")+"','"+map.get("lrsj").toString().substring(2,16)+"'],";
		}
		List list1=myService.sumgjd2(request.getParameter("bh"));
		Iterator it1=list1.iterator();
		if(it1.hasNext()){
			Map map=(Map)it1.next();
	if(null!=map.get("gs")&&null!=map.get("gsf")&&null!=map.get("clf")){
			gs=decimalFormat.format(map.get("gs"));
			gsf=decimalFormat.format(map.get("gsf"));
			clf=decimalFormat.format(map.get("clf"));
			 hj=  decimalFormat.format(new BigDecimal(map.get("gsf").toString()).add(new BigDecimal(map.get("clf").toString())));		
	}
		}
		data=data+"['','','','','','','','','','合计：','"+gs+"','"+gsf+"','"+clf+"','"+hj+"','','']";
 
		model.put("xxls", xxls);
		model.put("data",data);
		return model;
	}

}
