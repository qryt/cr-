package com.cr.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TJcxxx;
import com.cr.domain.TUser;
import com.cr.domain.TZcgjd;
import com.cr.domain.Zcgjd2;
import com.cr.service.MyService;

public class AddJc2Controller extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public AddJc2Controller() {
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
		   jc.setBz(jc.getBz().replaceAll("'", "’"));
		   /* if(jc.getJczt().equals("坏箱")&&jc.getZdbh().equals(""))
			   jc.setZdbh(myService.getJczt());
		   if(jc.getJczt().equals("好箱")&&!jc.getZdbh().equals(""))
			   jc.setZdbh("");*/
		TUser user=myService.loadUserById(userId);
		   jc.setLlr(user.getXm());
		jc.setLlrq(new Date());
		jc.setLczt("进场");
		if(!jc.getJczt().equals("NM"))
		   if((jc.getZdbh()==null||jc.getZdbh().trim().equals("")))
		jc.setZdbh(myService.getJczt(jc.getCgs()));	

	jc.setRcbh(myService.getRcbh());
	boolean b=myService.addJcxxx(jc);
	if(null!=request.getParameterValues("shlx")){
		String[] shlx=request.getParameterValues("shlx");
		String[] shwz=request.getParameterValues("shwz");
		String[] bjmc=request.getParameterValues("bjmc");
		String[] xlff=request.getParameterValues("xlff");
		String[] c=request.getParameterValues("c");
		String[] k=request.getParameterValues("k");
		String[] lx=request.getParameterValues("lx");
		String[] sl=request.getParameterValues("sl");
		String[] gs=request.getParameterValues("xs");
		String[] gsf=request.getParameterValues("gsf");
		String[] clf=request.getParameterValues("clf");
		String[] xlmx=request.getParameterValues("xlmx");
		String[] fff=request.getParameterValues("fff");
		
		for(int i=0;i<shlx.length;i++){
			if(shlx[i].trim().length()>0){
		Zcgjd2 gjd2=new Zcgjd2();
			gjd2.setShlx(shlx[i].toUpperCase());
			gjd2.setWzdm(shwz[i].toUpperCase());
			gjd2.setBjmc(bjmc[i].toUpperCase());
			gjd2.setXlff(xlff[i].toUpperCase());
			gjd2.setXlmx(xlmx[i]);
			gjd2.setC(c[i]);
			gjd2.setK(k[i]);
			gjd2.setLx(lx[i]);
			gjd2.setSl(Double.parseDouble(sl[i]));
			gjd2.setGs(Double.parseDouble(gs[i]));
			gjd2.setGsf(Double.parseDouble(gsf[i]));
			gjd2.setClf(Double.parseDouble(clf[i]));
			gjd2.setFff(fff[i]);
			gjd2.setLrr(user.getXm());
			gjd2.setLrsj(new Date());
 gjd2.setTJcxxx(jc);
 myService.addGjd2(gjd2);
 
			}
	}
		}
if(!b){
			errors.rejectValue("xh", "","添加失败，请与开发人员联系！");
			
	}
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
}
