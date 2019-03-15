package com.cr.controller;

import java.text.DateFormat;
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
import com.cr.domain.TUser;
import com.cr.service.MyService;

public class AddJcdjController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}
public void setMyService(MyService myService) {
	this.myService = myService;
}
	public AddJcdjController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TJcxxx.class);
		
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
 return new ModelAndView(getSuccessView());
	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
		//super.onBindAndValidate(request, command, errors);
		TJcxxx jc=(TJcxxx)command;
		  Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
		   Object   principal   =   auth.getPrincipal(); 
		   String   userId   =   null; 
		   if(principal   instanceof   UserDetails){ 
		   userId   =   ((UserDetails)principal).getUsername(); 
		   }
		   
		   jc.setXh(jc.getXh().toUpperCase());
		   jc.setXx(jc.getXx().toUpperCase());
		   jc.setCgs(jc.getCgs().toUpperCase());
		   jc.setTdh(jc.getTdh().toUpperCase());
		   jc.setJctc(request.getParameter("hjctc").toUpperCase());
		   jc.setQdf(myService.getQdf(jc.getCgs(), jc.getCc(),jc.getXx()));
		   jc.setTyf(myService.getTyf(jc.getCgs(),jc.getCc(), jc.getXx()));
		   /* if(jc.getJczt().equals("坏箱")&&jc.getZdbh().equals(""))
			   jc.setZdbh(myService.getJczt());
		   if(jc.getJczt().equals("好箱")&&!jc.getZdbh().equals(""))
			   jc.setZdbh("");*/
		TUser user=myService.loadUserById(userId);
		   jc.setLlr(user.getXm());
		jc.setLlrq(new Date());
		jc.setLczt("进场");
		if(jc.getJczt().equals("坏箱"))
		   if((jc.getZdbh()==null||jc.getZdbh().trim().equals("")))
		jc.setZdbh(myService.getJczt(jc.getCgs()));	

	jc.setRcbh(myService.getRcbh());

	 if(jc.getXh().trim().equals(""))
			errors.rejectValue("xh", "","箱号不能为空！");
	 else if(jc.getXx().trim().equals(""))
		    errors.rejectValue("xx","","箱型不能为空!");
		else if(jc.getCgs().trim().equals(""))
			errors.rejectValue("cgs", "","船公司不能为空！");
		else if(jc.getJcrq()==null)
			errors.rejectValue("jcrq", "","进场时间不能为空！");
		else if(myService.chkZczt(jc.getXh()))
			errors.rejectValue("xh", "", "该箱号已经入库，尚未出库，不能录入！");
		else if(!myService.chkXx(jc.getXx()))
			errors.rejectValue("xx", "", "该箱型不正确，不能录入！");
		else if(!myService.chkCgs(jc.getCgs()))
			errors.rejectValue("cgs", "", "该船公司不正确，不能录入！");
	 
		else if(!myService.addJcxxx(jc)){
			errors.rejectValue("xh", "","添加失败，请与开发人员联系！");
		}
	//	else if(jc.getJcrq())
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
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		Map model =new HashMap();
		String data="";
		List xxls=myService.listAllXxl();
		List list=myService.listTodayJcxxx();
		Iterator it=list.iterator();
		String jcrq="";
		String lrrq="";
		for(;it.hasNext();){
			Map map=(Map)it.next();
			if(null!=map.get("JCRQ"))
				jcrq=map.get("JCRQ").toString().substring(2,16);
					else
						jcrq="";
			if(null!=map.get("LLRQ"))
				lrrq=map.get("LLRQ").toString().substring(2,16);
					else
						lrrq="";
			if(null!=map.get("fllx")&&map.get("fllx").toString().equals("2"))
				data=data+"{cz:'<img src=images/pen.gif alt=\"编辑\" onclick=winopen(\"editjcdj2.htm?bh="+map.get("RCBH")+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deljcdj(\""+map.get("RCBH")+"\",\"r\")  style=\"cursor:hand\">', rcbh : '"+map.get("RCBH")+"',cgs : '"+map.get("CGS")+"' , xh : '"+map.get("XH")+"' , cc : '"+map.get("CC")+"', xx: '"+map.get("XX")+"', zzrq : '"+map.get("ZZRQ")+"',  jctc : '"+map.get("JCTC")+"', lxd : '"+map.get("LXD")+"', jczt : '"+map.get("JCZT")+"', jcwz : '"+map.get("JCWZ")+"', wzmx : '"+map.get("WZMX")+"', eirlsh : '"+map.get("EIRLSH")+"', zgd : '"+map.get("ZGD")+"', sfbf : '"+map.get("SFBF")+"', jcrq : '"+jcrq+"', lrr : '"+map.get("LLR")+"', lrrq : '"+lrrq+"'},";

			else
			data=data+"{cz:'<img src=images/pen.gif alt=\"编辑\" onclick=winopen(\"editjcdj.htm?bh="+map.get("RCBH")+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deljcdj(\""+map.get("RCBH")+"\",\"r\")  style=\"cursor:hand\">', rcbh : '"+map.get("RCBH")+"',cgs : '"+map.get("CGS")+"' , xh : '"+map.get("XH")+"' , cc : '"+map.get("CC")+"', xx: '"+map.get("XX")+"', zzrq : '"+map.get("ZZRQ")+"',  jctc : '"+map.get("JCTC")+"', lxd : '"+map.get("LXD")+"', jczt : '"+map.get("JCZT")+"', jcwz : '"+map.get("JCWZ")+"', wzmx : '"+map.get("WZMX")+"', eirlsh : '"+map.get("EIRLSH")+"', zgd : '"+map.get("ZGD")+"', sfbf : '"+map.get("SFBF")+"', jcrq : '"+jcrq+"', lrr : '"+map.get("LLR")+"', lrrq : '"+lrrq+"'},";

	//		data=data+"{cz:'<img src=images/pen.gif alt=\"修改\" onclick=winopen(\"editjcdj.htm?bh="+jc.getRcbh()+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deljcdj(\""+jc.getRcbh()+"\",\"r\")  style=\"cursor:hand\">', rcbh : '"+jc.getRcbh()+"' , xh : '"+jc.getXh()+"' , cc : '"+jc.getCc()+"', xx: '"+jc.getXx()+"', zzrq : '"+jc.getZzrq()+"', cgs : '"+jc.getCgs()+"', jctc : '"+jc.getJctc()+"', lxd : '"+jc.getLxd()+"', jczt : '"+jc.getJczt()+"', jcwz : '"+jc.getJcwz()+"', wzmx : '"+jc.getWzmx()+"', eirlsh : '"+jc.getEirlsh()+"', zgd : '"+jc.getZgd()+"', sfbf : '"+jc.getSfbf()+"', jcrq : '"+jc.getJcrq()+"'},";
		}
		if(data.length()>0)
		data=data.substring(0,data.length()-1);
		model.put("data",data);
		model.put("xxls", xxls);
		return model;
	}

}
