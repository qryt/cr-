package com.cr.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TJcxxx;
import com.cr.domain.TUser;
import com.cr.domain.TZcgjd;
import com.cr.service.MyService;

public class AddGjdController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}

	public AddGjdController() {
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
		return new ModelAndView(getSuccessView(),model);
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		TZcgjd gjd=(TZcgjd)command;
		  Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
		   Object   principal   =   auth.getPrincipal(); 
		   String   userId   =   null; 
		   if(principal   instanceof   UserDetails){ 
		   userId   =   ((UserDetails)principal).getUsername(); 
		   
		   }
		   TUser user=myService.loadUserById(userId);
		   
	 String bh=request.getParameter("bh");
	 gjd.setShwz(gjd.getShwz().toUpperCase());
	 gjd.setShlx(gjd.getShlx().toUpperCase());
	 gjd.setShdm(gjd.getShdm().toUpperCase());
	 gjd.setLrr(user.getXm());
	 gjd.setLrsj(new Date());
	if(gjd.getShdm().trim().equals(""))
			errors.rejectValue("shdm", "","损坏代码不能为空！");
	 else if(gjd.getShlx().trim().equals(""))
			errors.rejectValue("shlx", "","损坏类型不能为空！");

		 
		else if(!myService.addZcgjd(bh,gjd)){
			errors.rejectValue("shdm", "","添加失败，请与开发人员联系！");
		}
	}

	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		DecimalFormat  intFormat = new DecimalFormat("#0");
		Map model =new HashMap();
		String data="";
		String gs="0.00";
		String gsf="0.00";
		String clf="0.00";
		String hj="0.00";
		List wzdms=myService.listAllWzdm();
		List list=myService.listGjd(request.getParameter("bh"));
		Iterator it=list.iterator();
		for(;it.hasNext();){
			Map map=(Map)it.next();
 
		 
			data=data+"['<img src=images/pen.gif alt=\"修改\" onclick=winopen1(\"editgjd.htm?id="+map.get("id")+"&bh="+request.getParameter("bh")+"&op=n\") style=\"cursor:hand\"> &nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delgjd(\""+map.get("id")+"\",\"r\")  style=\"cursor:hand\">',  '"+map.get("shlx")+"','"+map.get("shdm")+"','"+map.get("shwz")+"' ,'"+map.get("shmx")+"' , '"+intFormat.format(map.get("sl"))+"' , '"+decimalFormat.format(map.get("xs"))+"',  '"+decimalFormat.format(map.get("gsf"))+"', '"+decimalFormat.format(map.get("clf"))+"', '"+map.get("fff")+"','"+map.get("lrr")+"', '"+map.get("lrsj").toString().substring(2,16)+"'],";
			}
		List list1=myService.sumgjd(request.getParameter("bh"));
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
		data=data+"['','','','','','合计：','"+gs+"','"+gsf+"','"+clf+"','"+hj+"','','']";

	
		model.put("wzdms", wzdms);
		model.put("data",data);
		return model;
	}

}
