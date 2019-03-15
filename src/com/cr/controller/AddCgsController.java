package com.cr.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cr.domain.TCgsxx;
import com.cr.domain.TXxxx;
import com.cr.service.MyService;

public class AddCgsController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}
public void setMyService(MyService myService) {
	this.myService = myService;
}
	public AddCgsController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TCgsxx.class);
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView(getSuccessView());
	}
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		Map model =new HashMap();
		String data="";
		List list=myService.listAllCgs();
		Iterator it=list.iterator();
		for(;it.hasNext();){
			TCgsxx cgs=(TCgsxx)it.next();
 
		 
			data=data+"{czfs:'<img src=images/pen.gif alt=\"编辑\" onclick=winopen(\"editcgs.htm?bh="+cgs.getGsid()+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delcgs(\""+cgs.getGsid()+"\",\"r\")  style=\"cursor:hand\">&nbsp;&nbsp;<a class=\"co\" href=\"#\" onclick=clone(\""+cgs.getGsid()+"\",\"r\") >克隆</a>', gsdm : '"+cgs.getGsdm()+"' , gsmc : '"+cgs.getGsmc()+"' , ywmc : '"+cgs.getYwmc()+"' , lxdh : '"+cgs.getLxdh()+"' , cz : '"+cgs.getCz()+"' , fzr : '"+cgs.getFzr()+"' , email : '"+cgs.getEmail()+"' , hblx : '"+cgs.getHblx()+"' , gsfl : '"+cgs.getGsfl()+"' , lgsmc : '"+cgs.getLgsmc()+"' , lywmc : '"+cgs.getLywmc()+"' , llxdh : '"+cgs.getLlxdh()+"' , lcz : '"+cgs.getLcz()+"' , lgsdz : '"+cgs.getLgsdz()+"' , lfzr : '"+cgs.getLfzr()+"' , lemail : '"+cgs.getLemail()+"'},";
		}
		if(data.length()>0)
		data=data.substring(0,data.length()-1);
		model.put("data",data);
		return model;
	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		// TODO Auto-generated method stub
	 TCgsxx cgs=(TCgsxx)command;
	 cgs.setGsdm(cgs.getGsdm().toUpperCase());
	 cgs.setXz(cgs.getXz().toUpperCase());
	 if(cgs.getGsdm().trim().equals(""))
		 errors.rejectValue("gsdm", "", "公司代码不能为空!");
	 else if(!myService.addCgs(cgs)){
		 errors.rejectValue("gsdm", "", "添加船公司失败，请与开发人员联系!");
	 }
	}
}
