package com.cr.controller;

import java.text.DecimalFormat;
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

import com.cr.domain.TDcfl;
import com.cr.service.MyService;

public class AddDcflController extends SimpleFormController {
private MyService myService;
	public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}

	public AddDcflController() {
		// TODO Auto-generated constructor stub
		this.setCommandClass(TDcfl.class);
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
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		Map model =new HashMap();
		String data="";
List list=myService.listDcflByGsid(Long.parseLong(request.getParameter("bh")));
DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
		
		Iterator it=list.iterator();
		for(;it.hasNext();){
			Map map=(Map)it.next();
 
		 
			data=data+"{czfs:'<img src=images/pen.gif alt=\"修改\" onclick=winopen2(\"editdcfl.htm?bh="+map.get("id")+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deldcfl(\""+map.get("id")+"\",\"r\")  style=\"cursor:hand\">', cc: '"+map.get("cc")+"' , xx : '"+map.get("xx")+"'   , qdf : '"+decimalFormat.format(Double.parseDouble(map.get("qdf").toString()))+"' , tyf : '"+decimalFormat.format(Double.parseDouble(map.get("tyf").toString()))+"' , dcfl : '"+decimalFormat.format(Double.parseDouble(map.get("dcfl").toString()))+"' , bgdcf : '"+decimalFormat.format(Double.parseDouble(map.get("bgdcf").toString()))+"'},";
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
		TDcfl dcfl=(TDcfl)command;
		if(dcfl.getCc().trim().equals(""))
			errors.rejectValue("cc", "", "尺寸不能为空！");
		else 
		if(!myService.addDcfl(Long.parseLong(request.getParameter("bh")), dcfl))
			 errors.rejectValue("cc", "", "添加堆存费率失败，请与开发人员联系!");
	}

}
