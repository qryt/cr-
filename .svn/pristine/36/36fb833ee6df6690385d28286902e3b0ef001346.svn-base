package com.cr.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.cr.domain.TXlfl;
import com.cr.domain.TZcgjd;
import com.cr.service.MyService;

public class AddJcController extends SimpleFormController {
	private MyService myService;
	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public AddJcController() {
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
	if(null!=request.getParameterValues("shdm")){
		String[] shdm=request.getParameterValues("shdm");
		String[] shlx=request.getParameterValues("shlx");
		String[] shwz=request.getParameterValues("shwz");
		String[] shmx=request.getParameterValues("shmx");
		String[] sl=request.getParameterValues("sl");
		String[] xs=request.getParameterValues("xs");
		String[] gsf=request.getParameterValues("gsf");
		String[] clf=request.getParameterValues("clf");
		String[] fff=request.getParameterValues("fff");

		
		for(int i=0;i<shdm.length;i++){
			if(shdm[i].trim().length()>0){
			
		TZcgjd zcgjd=new TZcgjd();
	 zcgjd.setShdm(shdm[i].toUpperCase());
 
	 zcgjd.setShlx(shlx[i].toUpperCase());
	 zcgjd.setShwz(shwz[i].toUpperCase());
	 zcgjd.setShmx(shmx[i]);
	 zcgjd.setSl(Double.parseDouble(sl[i]));
	 zcgjd.setXs(Double.parseDouble(xs[i]));
	 
	 zcgjd.setGsf(Double.parseDouble(gsf[i]));
	 zcgjd.setClf(Double.parseDouble(clf[i]));
	 zcgjd.setFff(fff[i]);
	 zcgjd.setTJcxxx(jc);
	 zcgjd.setLrr(user.getXm());
	 zcgjd.setLrsj(new Date());
	zcgjd.setTJcxxx(jc);
	 myService.addGjd(zcgjd);
	//jc.getTZcgjds().add(zcgjd);
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
