package com.cr.controller;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TUser;
import com.cr.domain.TZcgjd;
import com.cr.domain.Zcgjd2;
import com.cr.service.MyService;

public class addGjd2Controller extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}
	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	public addGjd2Controller() {
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
		return new ModelAndView(getSuccessView(),model);
	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		Zcgjd2 gjd2=(Zcgjd2)command;
		  Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
		   Object   principal   =   auth.getPrincipal(); 
		   String   userId   =   null; 
		   if(principal   instanceof   UserDetails){ 
		   userId   =   ((UserDetails)principal).getUsername(); 
		   
		   }
		   TUser user=myService.loadUserById(userId);
		 String bh=request.getParameter("bh");
	
		gjd2.setWzdm(gjd2.getWzdm().toUpperCase());
		gjd2.setShlx(gjd2.getShlx().toUpperCase());
        gjd2.setXlff(gjd2.getXlff().toUpperCase());
        gjd2.setBjmc(gjd2.getBjmc().toUpperCase());
        gjd2.setC(gjd2.getC().toUpperCase());
        gjd2.setK(gjd2.getK().toUpperCase());
        gjd2.setLx(gjd2.getLx().toUpperCase());
        gjd2.setSl(gjd2.getSl());
        gjd2.setLrr(user.getXm());
   	 gjd2.setLrsj(new Date());
	
		if(gjd2.getWzdm().equals(""))
				errors.rejectValue("wzdm", "","位置代码不能为空！");
		 else if(gjd2.getXlff().trim().equals(""))
				errors.rejectValue("xlff", "","修理方法不能为空！");
		 else if(gjd2.getBjmc().trim().equals(""))
				errors.rejectValue("bjmc", "","部件名称不能为空！");
		 else if(gjd2.getC().trim().equals(""))
				errors.rejectValue("c", "","长不能为空！");	
		 else if(isInteger(gjd2.getLx().trim())&&gjd2.getSl()!=1)
				errors.rejectValue("lx", "","当类型为数字时,数量必须为1！");
		 else if(gjd2.getK().trim().equals(""))
				errors.rejectValue("k", "","宽不能为空！");
		
			else if(!myService.addZcgjd2(bh,gjd2)){
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
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		DecimalFormat  intFormat = new DecimalFormat("#0");
		Map model =new HashMap();
		String data="";
		List wzdms=myService.listAllWzdm();
		List list=myService.listGjd2(request.getParameter("bh"));
		Iterator it=list.iterator();
		for(;it.hasNext();){
			Map map=(Map)it.next();
 
		 
			data=data+"['<img src=images/pen.gif alt=\"修改\" onclick=winopen1(\"editgjd2.htm?id="+map.get("id")+"&bh="+request.getParameter("bh")+"&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delgjd2(\""+map.get("id")+"\",\"r\")  style=\"cursor:hand\">', '"+map.get("wzdm")+"' ,'"+map.get("lx")+"' ,'"+map.get("shlx")+"' ,'"+map.get("xlff")+"' ,'"+map.get("bjmc")+"' , '"+map.get("xlmx")+"' ,'"+map.get("c")+"' , '"+map.get("k")+"' , '"+intFormat.format(Double.parseDouble(map.get("sl").toString()))+"' , '"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+"', '"+decimalFormat.format(Double.parseDouble(map.get("gsf").toString()))+"', '"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"', '"+map.get("fff")+"', '"+map.get("lrr")+"','"+map.get("lrsj").toString().substring(2,16)+"'],";
				}
		if(data.length()>0)
		data=data.substring(0,data.length()-1);
		model.put("data",data);
		model.put("wzdms", wzdms);
		return model;
	}
	

}
