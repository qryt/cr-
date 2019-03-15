package com.cr.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
 
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.cr.domain.TCgsxx;
import com.cr.domain.TFpdc;
import com.cr.domain.TJcxxx;
import com.cr.domain.TUser;
import com.cr.service.MyService;
import com.cr.util.Arith;
import com.cr.util.MyPasswordEncoder;
import com.cr.domain.TData;
import com.cr.domain.TDataDetail;
 

public class ListController extends MultiActionController {
private MyService myService;

public MyService getMyService() {
	return myService;
}

public void setMyService(MyService myService) {
	this.myService = myService;
}
public ModelAndView pwdsuccess(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	System.out.println("editPwd.htm");
	model.put("url", "editPwd.htm");
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView jcdj(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.DAY_OF_MONTH, +1);
	model.put("year", cal.get(Calendar.YEAR));
	model.put("month", cal.get(Calendar.MONTH));
	model.put("day", cal.get(Calendar.DATE));
	 
	return new ModelAndView("jcdj",model);
}
public ModelAndView addjcsuccess(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "addjcdj.htm");
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editjcsuccess(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editjcdj.htm?bh="+request.getParameter("bh")+"&operation="+request.getParameter("operation"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editjc2success(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editjcdj2.htm?bh="+request.getParameter("bh")+"&operation="+request.getParameter("operation"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editgjd(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editgjd.htm?id="+request.getParameter("id")+"&bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editxx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editxx.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editxxl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editxxl.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editwzdm(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editwzdm.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editcgs(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editcgs.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editdcfl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editdcfl.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editxlfl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editxlfl.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView edityh(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "edityh.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editrole(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editrole.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editshlx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editshlx.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editxlfl2(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editxlfl2.htm?bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView editgjd2(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	model.put("url", "editgjd2.htm?id="+request.getParameter("id")+"&bh="+request.getParameter("bh"));
	return new ModelAndView("pwdsuccess",model);
}
public ModelAndView delshlxsuccess(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String flag="0";
	boolean b=myService.delShlxsz(request.getParameter("bh"));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView deljcsuccess(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	 String flag="0";
boolean b=	myService.delJcxxx(request.getParameter("bh"));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delgjd(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	 String flag="0";
	 boolean b=myService.delGjd(Long.parseLong(request.getParameter("bh")));
	 if(b)
			flag="1";
		model.put("flag", flag);
	return new ModelAndView("success",model);
}
public ModelAndView delgjd2(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String flag="0";
	boolean b=myService.delGjd2(Long.parseLong(request.getParameter("bh")));
	 if(b)
			flag="1";
		model.put("flag", flag);
	return new ModelAndView("success",model);
}
public ModelAndView clonecgs(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
 
	boolean b=myService.addclonecgs(Long.parseLong(request.getParameter("bh")));
	 
	return new ModelAndView("clonesuccess",model);
}
public ModelAndView delxx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String flag="0";
	boolean b=myService.delXx(request.getParameter("bh"));
	 if(b)
			flag="1";
		model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delxxl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String flag="0";
	boolean b=myService.delXxl(Long.parseLong(request.getParameter("bh")));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delwzdm(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String flag="0";
	boolean b=myService.delWzdm(Long.parseLong(request.getParameter("bh")));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delyh(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String flag="0";
	boolean b=myService.delUser(request.getParameter("bh"));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delcgs(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String flag="0";
	boolean b=myService.delCgs(Long.parseLong(request.getParameter("bh")));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView deldcfl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	 
	String flag="0";
	boolean b=myService.delDcfl(Long.parseLong(request.getParameter("bh")));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delxlfl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	 
	String flag="0";
	boolean b=myService.delXlfl(Long.parseLong(request.getParameter("bh")));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delxlfl2(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	 
	String flag="0";
	boolean b=myService.delXlfl2(Long.parseLong(request.getParameter("bh")));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView delrole(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	 
	String flag="0";
	boolean b=myService.delRole(Long.parseLong(request.getParameter("bh")));
	if(b)
		flag="1";
	model.put("flag", flag);
	return new ModelAndView("delsuccess",model);
}
public ModelAndView hy(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	 TUser user=myService.loadUserById(request.getParameter("bh"));
	 MyPasswordEncoder coder=new MyPasswordEncoder();	
	 user.setMm(coder.encode("000"));
	myService.editUser(user);
	
	return new ModelAndView("hysuccess",model);
}
public ModelAndView findjcdj(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	 
	String lrrq="";
TJcxxx jc=new TJcxxx();
jc.setXh(request.getParameter("xh"));
jc.setRcbh(request.getParameter("rcbh"));
jc.setCc(request.getParameter("cc"));
jc.setXx(request.getParameter("xx"));
jc.setXh(request.getParameter("xh"));
jc.setJczt(request.getParameter("jczt"));
jc.setCgs(request.getParameter("cgs"));
jc.setTdh(request.getParameter("tdh"));
jc.setLczt(request.getParameter("lczt"));
jc.setSfbf(request.getParameter("sfbf"));
jc.setSfqr(request.getParameter("sfqr"));
jc.setSfwg(request.getParameter("sfwg"));
jc.setSfjz(request.getParameter("sfjz"));
jc.setZygr(request.getParameter("zygr"));
jc.setJczt(request.getParameter("jczt"));
Date da=null;
Date da1=null;
Date qrda=null;
Date qrda1=null;
try{
	if(null!=request.getParameter("qsrq")&&!request.getParameter("qsrq").equals(""))
da=fmt.parse(request.getParameter("qsrq"));
	if(null!=request.getParameter("jzrq")&&!request.getParameter("jzrq").equals(""))
da1=fmt.parse(request.getParameter("jzrq"));
	if(null!=request.getParameter("qrqsrq")&&!request.getParameter("qrqsrq").equals(""))
		qrda=fmt.parse(request.getParameter("qrqsrq"));
			if(null!=request.getParameter("qrjzrq")&&!request.getParameter("qrjzrq").equals(""))
		qrda1=fmt.parse(request.getParameter("qrjzrq"));
}catch(Exception e){
	e.printStackTrace();
}

jc.setJcrq(da);
jc.setLlrq(da1);
jc.setWgrq(qrda);
jc.setQrrq(qrda1);
model.put("jc", jc);
List list=myService.listJcxvar(jc);
Iterator it=list.iterator();
for(;it.hasNext();){
	Map map=(Map)it.next();
	if(null!=map.get("JCRQ"))
jcrq=map.get("JCRQ").toString().substring(2,16);
	else
	jcrq="";
	if(null!=map.get("CCRQ"))
 ccrq=map.get("CCRQ").toString().substring(2,16);
	else
		ccrq="";
	if(null!=map.get("QRRQ"))
 qrrq=map.get("QRRQ").toString().substring(2,16);
	else
		qrrq="";
	if(null!=map.get("JZRQ"))
 jzrq=map.get("JZRQ").toString().substring(2,16);
	else
		jzrq="";
	if(null!=map.get("WGRQ"))
 wgrq=map.get("WGRQ").toString().substring(2,16);
	else
		wgrq="";
	if(null!=map.get("LLRQ"))
		 lrrq=map.get("LLRQ").toString().substring(2,16);
			else
				lrrq="";
	if(null!=map.get("fllx")&&map.get("fllx").toString().equals("2"))
		data=data+"{cz:'<img src=images/pen.gif alt=\"编辑\" onclick=winopen(\"editjcdj2.htm?bh="+map.get("RCBH")+"&operation=s&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deljcdj(\""+map.get("RCBH")+"\",\"s\")  style=\"cursor:hand\">', rcbh : '"+map.get("RCBH")+"',cgs : '"+map.get("CGS")+"' , xh : '"+map.get("XH")+"' , cc : '"+map.get("CC")+"', xx: '"+map.get("XX")+"', zzrq : '"+map.get("ZZRQ")+"',  jctc : '"+map.get("JCTC")+"', lxd : '"+map.get("LXD")+"', jczt : '"+map.get("JCZT")+"', jcwz : '"+map.get("JCWZ")+"', wzmx : '"+map.get("WZMX")+"', eirlsh : '"+map.get("EIRLSH")+"', zgd : '"+map.get("ZGD")+"', sfbf : '"+map.get("SFBF")+"', zygr : '"+map.get("ZYGR")+"', jcrq : '"+jcrq+"', qrrq : '"+qrrq+"', wgrq : '"+wgrq+"', ccrq : '"+ccrq+"', jzrq : '"+jzrq+"', lrr : '"+map.get("LLR")+"', lrrq : '"+lrrq+"'},";

	else
	data=data+"{cz:'<img src=images/pen.gif alt=\"编辑\" onclick=winopen(\"editjcdj.htm?bh="+map.get("RCBH")+"&operation=s&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deljcdj(\""+map.get("RCBH")+"\",\"s\")  style=\"cursor:hand\">', rcbh : '"+map.get("RCBH")+"',cgs : '"+map.get("CGS")+"' , xh : '"+map.get("XH")+"' , cc : '"+map.get("CC")+"', xx: '"+map.get("XX")+"', zzrq : '"+map.get("ZZRQ")+"',  jctc : '"+map.get("JCTC")+"', lxd : '"+map.get("LXD")+"', jczt : '"+map.get("JCZT")+"', jcwz : '"+map.get("JCWZ")+"', wzmx : '"+map.get("WZMX")+"', eirlsh : '"+map.get("EIRLSH")+"', zgd : '"+map.get("ZGD")+"', sfbf : '"+map.get("SFBF")+"', zygr : '"+map.get("ZYGR")+"', jcrq : '"+jcrq+"', qrrq : '"+qrrq+"', wgrq : '"+wgrq+"', ccrq : '"+ccrq+"', jzrq : '"+jzrq+"', lrr : '"+map.get("LLR")+"', lrrq : '"+lrrq+"'},";
}
if(data.length()>0)
data=data.substring(0,data.length()-1);
model.put("data",data);
	return new ModelAndView("jcdj",model);
}
public ModelAndView listxh(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listXh(request.getParameter("id").trim());
	model.put("jc",list);
	model.put("size", list.size());
	
	return new ModelAndView("listxh",model);
}
public ModelAndView listxx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listXx(request.getParameter("id").trim());
	model.put("xx",list);
	model.put("size", list.size());
	
	return new ModelAndView("listxx",model);
}
public ModelAndView listxxl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listXxl(request.getParameter("id").trim());
	model.put("xxl",list);
	model.put("size", list.size());
	
	return new ModelAndView("listxxl",model);
}
public ModelAndView listshlx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listShlx(request.getParameter("id").trim());
	model.put("shlx",list);
	model.put("size", list.size());
	
	return new ModelAndView("listshlx",model);
}
public ModelAndView listshlx1(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listShlx(request.getParameter("id").trim());
	model.put("shlx",list);
	model.put("size", list.size());
	
	return new ModelAndView("listshlx1",model);
}
public ModelAndView listshwz(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listShwz(request.getParameter("id").trim());
	model.put("shwz",list);
	model.put("size", list.size());
	
	return new ModelAndView("listshwz",model);
}

public ModelAndView listshwz1(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listShwz(request.getParameter("id").trim());
	model.put("shwz",list);
	model.put("size", list.size());
	
	return new ModelAndView("listshwz1",model);
}

public ModelAndView listwz(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listShwz(request.getParameter("id").trim());
	model.put("shwz",list);
	model.put("size", list.size());
	
	return new ModelAndView("listwz",model);
}
public ModelAndView listbjmc(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listBjmc(request.getParameter("bh"),request.getParameter("xlff"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listbjmc",model);
}
public ModelAndView listbjmc1(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listBj(request.getParameter("id").trim(),request.getParameter("cgs"),request.getParameter("xlff"));
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listbjmc1",model);
}
public ModelAndView listxlff(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listXlff(request.getParameter("bh"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listxlff",model);
}
public ModelAndView listxlff1(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listXlff1(request.getParameter("cgs"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listxlff1",model);
}
public ModelAndView listc(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listC(request.getParameter("bh"),request.getParameter("bjmc"),request.getParameter("xlff"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listc",model);
}
public ModelAndView listc1(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listC1(request.getParameter("cgs"),request.getParameter("bjmc"),request.getParameter("xlff"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listc1",model);
}
public ModelAndView listk(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listK(request.getParameter("bh"),request.getParameter("bjmc"),request.getParameter("xlff"),request.getParameter("c"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listk",model);
}
public ModelAndView listk1(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listK1(request.getParameter("cgs"),request.getParameter("bjmc"),request.getParameter("xlff"),request.getParameter("c"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listk1",model);
}
public ModelAndView listlx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listLx(request.getParameter("bh"),request.getParameter("bjmc"),request.getParameter("xlff"),request.getParameter("c"),request.getParameter("k"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listlx",model);
}
public ModelAndView listlx1(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listLx1(request.getParameter("cgs"),request.getParameter("bjmc"),request.getParameter("xlff"),request.getParameter("c"),request.getParameter("k"),request.getParameter("id").trim());
	model.put("xlfl2",list);
	model.put("size", list.size());
	
	return new ModelAndView("listlx1",model);
}
public ModelAndView listcgs(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=myService.listCgs(request.getParameter("id").trim());
	model.put("cgs",list);
	model.put("size", list.size());
	
	return new ModelAndView("listcgs",model);
}
public ModelAndView listsh(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=new ArrayList();
if(request.getParameter("bh")!=null)
list=myService.listShdm(request.getParameter("id").trim(),request.getParameter("bh").trim());
	model.put("sh",list);
	model.put("size", list.size());
	
	return new ModelAndView("listsh",model);
}
public ModelAndView listshdm(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=new ArrayList();
if(request.getParameter("cgs")!=null)
list=myService.listSh(request.getParameter("id").trim(),request.getParameter("cgs").trim());
	model.put("sh",list);
	model.put("size", list.size());
	
	return new ModelAndView("listshdm",model);
}
public ModelAndView listjs(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=new ArrayList();
if(request.getParameter("id")!=null)
list=myService.listJsByZh(request.getParameter("id").trim());
	model.put("role",list);
	model.put("size", list.size());

	
	return new ModelAndView("listrole",model);
}
public ModelAndView listqx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	List list=new ArrayList();
if(request.getParameter("id")!=null)
list=myService.listQxByZh(request.getParameter("id").trim());
	model.put("role",list);
	model.put("size", list.size());

	
	return new ModelAndView("listqx",model);
}
public ModelAndView chkqr(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date datqrrq=null;
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("plqrrq")&&!request.getParameter("plqrrq").trim().equals(""))
	try{
		datqrrq=dateformat.parse(request.getParameter("plqrrq"));
	}catch(Exception e){
		e.printStackTrace();
	}

	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr")){
			jc.setQrrq(datqrrq);
			if(null==jc.getZdbh()||jc.getZdbh().trim().equals(""))
				jc.setZdbh(myService.getJczt(jc.getCgs()));
				}
				if(request.getParameter("flag").equals("qx")){
					jc.setQrrq(null);
				//	if(null!=jc.getZdbh()||!jc.getZdbh().trim().equals(""))
					//	   jc.setZdbh("");	
				}
	
				myService.editJcxxx(jc);
			}
			
		}
	
	}


	 return new ModelAndView("success",model);
 
}
public ModelAndView chkpl(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date datqrrq=null;
	
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
 
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("plqrrq")&&!request.getParameter("plqrrq").trim().equals(""))
	try{
		datqrrq=dateformat.parse(request.getParameter("plqrrq"));
	}catch(Exception e){
		e.printStackTrace();
	}

	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr")){
			jc.setQrrq(datqrrq);
			if(null==jc.getZdbh()||jc.getZdbh().trim().equals(""))
				jc.setZdbh(myService.getJczt(jc.getCgs()));
				}
				if(request.getParameter("flag").equals("plqrrq")){
					jc.setQrrq(null);
					//if(null!=jc.getZdbh()||!jc.getZdbh().trim().equals(""))
						//   jc.setZdbh("");	
				}
	
				myService.editJcxxx(jc);
			}
			
		}
	
	}


 return new ModelAndView("success",model);
 
}
public ModelAndView chkpldc(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date pldc=null;
	float dcfl=0f;

	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
 
 
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("pldc")&&!request.getParameter("pldc").trim().equals(""))
	try{
		pldc=dateformat.parse(request.getParameter("pldc"));
	}catch(Exception e){
		e.printStackTrace();
	}

	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
	
		
		if(request.getParameter("flag").equals("qr")){
			TFpdc fpdc=new TFpdc();
			fpdc.setZzrq(pldc);
			fpdc.setTJcxxx(jc);
	fpdc.setDcfl(myService.listDcfByJcId(chk[i]));
	myService.addFpdc(fpdc);
		}
		else if(request.getParameter("flag").equals("qx")){
			myService.delFpdc(chk[i]);
		}

			
		}
	
	}

	 return new ModelAndView("success",model);
 
}
public ModelAndView chktdh(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	String pltdh="";
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 

 
 
 
	if(null!=request.getParameter("pltdh")&&!request.getParameter("pltdh").trim().equals(""))
		 pltdh=request.getParameter("pltdh");

	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr"))
			jc.setTdh(pltdh.toUpperCase());
				if(request.getParameter("flag").equals("qx"))
					jc.setTdh("");
	
				myService.editJcxxx(jc);
			}
			

	}
	}

	 return new ModelAndView("success",model);
 
}
public ModelAndView chkbz(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	String plbz="";
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
 chk=request.getParameter("var").split("//");

 
 
 
	if(null!=request.getParameter("plbz")&&!request.getParameter("plbz").trim().equals(""))
	{ 
	 
		plbz=request.getParameter("plbz") ;
 
	}
	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr"))
			jc.setZygr(plbz);
				if(request.getParameter("flag").equals("qx"))
					jc.setZygr("");
	
				myService.editJcxxx(jc);
			}
			
		}
	}
 

	 return new ModelAndView("success",model);
 
}
public ModelAndView chkfs(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date datqrrq=null;
	
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("plfsrq")&&!request.getParameter("plfsrq").trim().equals(""))
	try{
		datqrrq=dateformat.parse(request.getParameter("plfsrq"));
	}catch(Exception e){
		e.printStackTrace();
	}


	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr"))
			{jc.setFsrq(datqrrq);
			 
			}
				if(request.getParameter("flag").equals("qx"))
				jc.setFsrq(null);
	
				myService.editJcxxx(jc);
			}
			
		}
	}
	

	 return new ModelAndView("success",model);
}


public ModelAndView chkedi(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	String edirq=""; 
	Date datqrrq=null;
	
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("pledirq")&&!request.getParameter("pledirq").trim().equals(""))
	try{
		datqrrq=dateformat.parse(request.getParameter("pledirq"));
	}catch(Exception e){
		e.printStackTrace();
	}


	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr"))
			{jc.setEdirq(datqrrq);
			 
			}
				if(request.getParameter("flag").equals("qx"))
				jc.setEdirq(null);
	
				myService.editJcxxx(jc);
			}
			
		}
	}
	

	 return new ModelAndView("success",model);
}



public ModelAndView chkwg(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date datqrrq=null;
	
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("plwgrq")&&!request.getParameter("plwgrq").trim().equals(""))
	try{
		datqrrq=dateformat.parse(request.getParameter("plwgrq"));
	}catch(Exception e){
		e.printStackTrace();
	}


	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr"))
			{jc.setWgrq(datqrrq);
			jc.setJczt("NM");
			}
				if(request.getParameter("flag").equals("qx"))
				jc.setWgrq(null);
	
				myService.editJcxxx(jc);
			}
			
		}
	}
	

	 return new ModelAndView("success",model);
}
public ModelAndView chkcc(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date datqrrq=null;
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("plccrq")&&!request.getParameter("plccrq").trim().equals(""))
	try{
		datqrrq=dateformat.parse(request.getParameter("plccrq"));
	}catch(Exception e){
		e.printStackTrace();
	}


	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr"))
			{jc.setCcrq(datqrrq);
			jc.setDcf(myService.getDcf(chk[i],datqrrq));
			}
				if(request.getParameter("flag").equals("qx"))
				{jc.setCcrq(null);
				jc.setDcf(0);
				}
	
				myService.editJcxxx(jc);
			}
			
		}
	}
	

	 return new ModelAndView("success",model);
}

public ModelAndView chkjz(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date datqrrq=null;
	String[] chk=null;
	 if(request.getParameter("var").equals(""))
	 {
		 List jc= myService.listJc(request.getParameter("sql"));
		 Iterator it=jc.iterator();
		   chk=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    chk[i]=map.get("rcbh").toString();
		   }
	 }
	 else
chk=request.getParameter("var").split("//");
 
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	if(null!=request.getParameter("pljzrq")&&!request.getParameter("pljzrq").trim().equals(""))
	try{
		datqrrq=dateformat.parse(request.getParameter("pljzrq"));
	}catch(Exception e){
		e.printStackTrace();
	}


	for(int i=0;i<chk.length;i++){
		if(!chk[i].equals("0")){
		
			TJcxxx jc=myService.loadTJcxxxBybh(chk[i]);
			if(null!=request.getParameter("flag")){
				 
				if(request.getParameter("flag").equals("qr"))
			jc.setJzrq(datqrrq);
				if(request.getParameter("flag").equals("qx"))
				jc.setJzrq(null);
	
				myService.editJcxxx(jc);
			}
			
		}
	}
	

	 return new ModelAndView("success",model);
 
}
public ModelAndView listbbcx(HttpServletRequest request,HttpServletResponse response){
	Map model=new HashMap();
	String data="";
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
	DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
	String jcrq="";
	String ccrq="";
	String qrrq="";
	String jzrq="";
	String wgrq=""; 
	Date datqrrq=null;
	 
TJcxxx jc=new TJcxxx();
jc.setXh(request.getParameter("xh"));
jc.setRcbh(request.getParameter("rcbh"));
jc.setCc(request.getParameter("cc"));
jc.setXx(request.getParameter("xx"));
jc.setXh(request.getParameter("xh"));
jc.setJczt(request.getParameter("jczt"));
jc.setCgs(request.getParameter("cgs"));
jc.setTdh(request.getParameter("tdh"));
jc.setLczt(request.getParameter("lczt"));
jc.setSfbf(request.getParameter("sfbf"));
jc.setSfqr(request.getParameter("sfqr"));
jc.setSfwg(request.getParameter("sfwg"));
jc.setZygr(request.getParameter("zygr"));
jc.setSfjz(request.getParameter("sfjz"));
jc.setJczt(request.getParameter("jczt"));
Date da=null;
Date da1=null;
Date qrda=null;
Date qrda1=null;
try{
	if(null!=request.getParameter("qsrq")&&!request.getParameter("qsrq").equals(""))
da=fmt.parse(request.getParameter("qsrq"));
	if(null!=request.getParameter("jzrq")&&!request.getParameter("jzrq").equals(""))
da1=fmt.parse(request.getParameter("jzrq"));
	if(null!=request.getParameter("qrqsrq")&&!request.getParameter("qrqsrq").equals(""))
		qrda=fmt.parse(request.getParameter("qrqsrq"));
			if(null!=request.getParameter("qrjzrq")&&!request.getParameter("qrjzrq").equals(""))
		qrda1=fmt.parse(request.getParameter("qrjzrq"));
}catch(Exception e){
	e.printStackTrace();
}

jc.setJcrq(da);
jc.setLlrq(da1);
jc.setWgrq(qrda);
jc.setQrrq(qrda1);
model.put("jc", jc);
List list=myService.listBbcx(jc);
Iterator it=list.iterator();
for(;it.hasNext();){
	Map map=(Map)it.next();
	if(null!=map.get("JCRQ"))
jcrq=map.get("JCRQ").toString().substring(2,16);
	else
		jcrq="";
	if(null!=map.get("CCRQ"))
 ccrq=map.get("CCRQ").toString().substring(2,16);
	else
		ccrq="";
	if(null!=map.get("QRRQ"))
 qrrq=map.get("QRRQ").toString().substring(2,16);
	else
		qrrq="";
	if(null!=map.get("JZRQ"))
 jzrq=map.get("JZRQ").toString().substring(2,16);
	else
		jzrq="";
	if(null!=map.get("WGRQ"))
 wgrq=map.get("WGRQ").toString().substring(2,16);
	else
		wgrq="";
 
	data=data+"['"+map.get("RCBH")+"','"+map.get("CGS")+"','"+map.get("XH")+"','"+map.get("CC")+"','"+map.get("XX")+"','"+jcrq+"','"+qrrq+"','"+wgrq+"','"+map.get("hblx")+"','"+decimalFormat.format(Double.parseDouble(map.get("qdf").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("tyf").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("dcf").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("gsf").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"','"+decimalFormat.format(Double.parseDouble(map.get("hj").toString()))+"'],";
}
if(data.length()>0)
data=data.substring(0,data.length()-1);
 
 String sql=myService.findBbSql(jc);
model.put("data",data);
model.put("sql", sql);
 return new ModelAndView("bbcx",model);
 
}
public ModelAndView checkxx(HttpServletRequest request,HttpServletResponse response){
 String url="failure";

	if(myService.checkXx(request.getParameter("xx")))
	 url="success";

	return new ModelAndView(url);
}
public ModelAndView checkxxl(HttpServletRequest request,HttpServletResponse response){
	 String url="failure";

		if(myService.checkXxl(request.getParameter("xxl")))
		 url="success";

		return new ModelAndView(url);
	}
public ModelAndView checkcgs(HttpServletRequest request,HttpServletResponse response){
	 String url="failure";

		if(myService.checkCgs(request.getParameter("cgs")))
		 url="success";

		return new ModelAndView(url);
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
public ModelAndView add_data(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");
	List list=myService.listvar("select data_id from t_data");
	long se_id=list.size()+1;
			 String data_type_name=request.getParameter("data_name");
			 TData data=new TData();
			 data.setSeId(se_id);
			 data.setDataTypeName(data_type_name);
			 
			try {
				PrintWriter out = response.getWriter();
				if(myService.addData(data)>0)
				out.write("添加成功！");
				else
				out.write("添加失败！");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView edit_data(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");
 	long data_id=Long.parseLong(request.getParameter("data_id"));
			String se_id=request.getParameter("se_id");
			 String data_type_name=request.getParameter("data_name");
			 TData data=myService.loadData(data_id);
			 data.setSeId(Long.parseLong(se_id));
			 data.setDataTypeName(data_type_name);
			 
			try {
				PrintWriter out = response.getWriter();
				if(myService.editData(data))
				out.write("修改成功！");
				else
				out.write("修改失败！");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView del_data(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");
 	long data_id=Long.parseLong(request.getParameter("data_id"));
			 
			try {
				PrintWriter out = response.getWriter();
				if(myService.delData(data_id))
				out.write("删除成功！");
				else
				out.write("删除失败！");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView show_data(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");

		List list=myService.listvar("select data_id,se_id,data_type_name from t_data order by se_id");
		Iterator it=list.iterator();
		Map map=null;
		String s="<select size=\"15\" style=\"width:350px\" id=\"data_sel\" name=\"data_sel\" onChange=\"data_click()\">";
		for(;it.hasNext();){
			map=(Map)it.next();
			s+="<option value=\""+map.get("data_id")+"\">"+map.get("se_id")+"·"+map.get("data_type_name")+"</option>";
		}
		s+="</select>";
			try {
				PrintWriter out = response.getWriter();
				 
				out.write(s);
			 
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView show_detail(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");
    long data_id=Long.parseLong(request.getParameter("data_id"));
		List list=myService.listvar("select data_detail_id,se_id,data_detail_name from t_data_detail where data_id="+data_id+" order by se_id");
		Iterator it=list.iterator();
		Map map=null;
		String s="<select size=\"15\" style=\"width:350px\" id=\"detail_sel\" name=\"detail_sel\" onChange=\"detail_click()\">";
		for(;it.hasNext();){
			map=(Map)it.next();
			s+="<option value=\""+map.get("data_detail_id")+"\">"+map.get("se_id")+"·"+map.get("data_detail_name")+"</option>";
		}
		s+="</select>";
			try {
				PrintWriter out = response.getWriter();
				 
				out.write(s);
			 
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView add_detail(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");
 	
			
			long data_id=Long.parseLong(request.getParameter("data_id"));
			String data_detail_name=request.getParameter("detail_name");
			List list=myService.listvar("select data_detail_id from t_data_detail where data_id="+data_id);
			long se_id=list.size()+1;
			TDataDetail detail=new TDataDetail();
			 detail.setTData(myService.loadData(data_id));
			 detail.setSeId(se_id);
			 detail.setDataDetailName(data_detail_name);
			 long i=myService.addDataDetail(detail);
			 
			try {
				PrintWriter out = response.getWriter();
				if(i>0)
				out.write(String.valueOf(i));
				else
				out.write("0");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView edit_detail(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");
 	long detail_id=Long.parseLong(request.getParameter("detail_id"));
			long se_id=Long.parseLong(request.getParameter("se_id"));
			 String detail_name=request.getParameter("detail_name");
			 TDataDetail detail=myService.loadDetail(detail_id);
			 detail.setSeId(se_id);
			 detail.setDataDetailName(detail_name);
			 
			try {
				PrintWriter out = response.getWriter();
				if(myService.editDataDetail(detail))
				out.write("修改成功！");
				else
				out.write("修改失败！");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView del_detail(HttpServletRequest request,HttpServletResponse response){
 	response.setContentType("text/html;charset=utf-8");
 	long detail_id=Long.parseLong(request.getParameter("detail_id"));
			try {
				PrintWriter out = response.getWriter();
				if(myService.delDataDetail(detail_id))
				out.write("删除成功！");
				else
				out.write("删除失败！");
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}
public ModelAndView getyxy(HttpServletRequest request,HttpServletResponse response){
	response.setContentType("text/html;charset=utf-8");
	List list=myService.listDataType("验箱员");
	String re="";
	Iterator it=list.iterator();
	for(;it.hasNext();){
		Map map=(Map)it.next();
		System.out.println(map);
		re+=",";
	}
return null;
}
public ModelAndView  check_bj(HttpServletRequest request,HttpServletResponse response){
	response.setContentType("text/html;charset=utf-8");
	  
	 String cgs=request.getParameter("cgs");
	 String fllx=request.getParameter("fllx");
	 String sqlSelect="";
	try{	
	 
	
		PrintWriter out = response.getWriter();
		if(null!=fllx&&fllx.equals("1"))
			sqlSelect="select a.id from t_xlfl a left join t_cgsxx b on a.gsid=b.gsid where b.gsdm='"+cgs+"' and a.shdm='0917'";
		else
			sqlSelect="select a.id from xlfl2 a left join t_cgsxx b on a.gsid=b.gsid where b.gsdm='"+cgs+"' and a.bjmc='003'";

		List list=myService.listvar(sqlSelect);
	
if(list.size()>0)
		out.write("{success:true,value:'ok'}");
else
	out.write("{success:true,value:'no'}");
		out.flush();
		out.close();
}catch(Exception e){
	e.printStackTrace();
}
return null;
	}





public ModelAndView printgiri(HttpServletRequest request,HttpServletResponse response){
	response.setContentType("APPLICATION/OCTET-STREAM; charset=utf-8");
	
	
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	 
	
	 String t="";
	 String filename=df.format(new Date())+"集装箱维修估价费";
	try {
		  t=new String(filename.getBytes("GB2312"), "ISO_8859_1");
	} catch (UnsupportedEncodingException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  response.setHeader("Content-Disposition","attachment; filename=\""+t+".xls\"");
  
	  try{
	  OutputStream os = response.getOutputStream();
	    jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(os);
	    jxl.write.WritableSheet ws = wwb.createSheet("集装箱维修估价费", 0);
	
	   // ws.getSettings().setProtected(true);
	  //  ws.getSettings().setPassword("haha");
	//    ws.setPageSetup(PageOrientation.LANDSCAPE.PORTRAIT, PaperSize.A4, 0, 0);
	    WritableFont font1 = new WritableFont(WritableFont.TIMES, 13,
                WritableFont.BOLD);
WritableCellFormat title1 = new WritableCellFormat(font1);
title1.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
	    //小标题的格式
	    WritableFont font2 = new WritableFont(WritableFont.TIMES, 10,
	                                          WritableFont.BOLD);
	    WritableCellFormat title2 = new WritableCellFormat(font2);
	    title2.setAlignment(jxl.format.Alignment.RIGHT); 
	    //次标题的格式
	    WritableFont font3 = new WritableFont(WritableFont.TIMES, 10,
	                                          WritableFont.NO_BOLD);
	    WritableCellFormat title3 = new WritableCellFormat(font3);
	    title3.setAlignment(jxl.format.Alignment.LEFT); //水平对齐
	    //表格栏目的格式
	    WritableFont font4 = new WritableFont(WritableFont.TIMES, 9,
	                                          WritableFont.NO_BOLD);
	    WritableCellFormat title4 = new WritableCellFormat(font4);
	    title4.setAlignment(jxl.format.Alignment.LEFT); //水平对齐
	    title4.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
	    title4.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框
	    title4.setWrap(true);
	    
	    WritableFont font6 = new WritableFont(WritableFont.TIMES, 9,
                WritableFont.BOLD);
WritableCellFormat title6 = new WritableCellFormat(font6);
title6.setAlignment(jxl.format.Alignment.LEFT); 



	    jxl.write.Number labelNF=null;
 jxl.write.NumberFormat nf = new jxl.write.NumberFormat("#0");
 jxl.write.WritableCellFormat wcfN = new jxl.write.WritableCellFormat(nf);
 jxl.write.NumberFormat nf1 = new jxl.write.NumberFormat("#0.0");
 jxl.write.WritableCellFormat wcfN1 = new jxl.write.WritableCellFormat(nf1);
 jxl.write.NumberFormat nf2 = new jxl.write.NumberFormat("#0.00");
 jxl.write.WritableCellFormat wcfN2 = new jxl.write.WritableCellFormat(nf2);
 jxl.write.NumberFormat nf3 = new jxl.write.NumberFormat("#0.000");
 jxl.write.WritableCellFormat wcfN3 = new jxl.write.WritableCellFormat(nf3);
wcfN.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
wcfN1.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
//wcfN2.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
wcfN3.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
WritableFont font5 = new WritableFont(WritableFont.TIMES, 12,WritableFont.NO_BOLD);
WritableCellFormat cell = new WritableCellFormat(font5);
	    cell.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
	    cell.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
	    cell.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框
	    jxl.write.Label labelC =null;

	    DecimalFormat df2 = new DecimalFormat("#0.00");
	    String date_start=request.getParameter("date_start");
		String date_end=request.getParameter("date_end");
		String condition=request.getParameter("condition"); 
		String chk = request.getParameter("ck");
		
	    String sqlplus="";
	    String var="";
	    double hj1=0.00;
	    String[] arr=chk.split(",");
		for(int i=0;i<arr.length;i++){
			if(i==0)
			{
			if(!arr[i].trim().equals(""))
			sqlplus="fff='"+arr[i]+"'";
			}
			else
				sqlplus=sqlplus+" or fff='"+arr[i]+"'";	
		}
		if(sqlplus.length()>0)
			sqlplus=" and ("+sqlplus+")";
		
	    if(null!=request.getParameter("var")&&request.getParameter("var").length()>0)
	    	var=request.getParameter("var");
	    System.out.println(var);
	    String[] brr=var.split(",");
	    ws.mergeCells(0, 0, 4, 0);
	    ws.mergeCells(0, 1, 4, 1);
		labelC = new jxl.write.Label(0, 0, "ESTIMATE DATE:"+df.format(new Date())+"", title3);
		ws.addCell(labelC); 
		labelC = new jxl.write.Label(0, 1, "Zhangjiagang Win Hanverky Container Repair Co.,ltd", title3);
		ws.addCell(labelC); 
		int j=2;
	    for(int k=0;k<brr.length;k++){
	    	
	    	double hj=0.00;
	    	
	    	ws.mergeCells(0, j, 4, j);
	    	labelC = new jxl.write.Label(0, j+1, "CNTR NO", title3);
			ws.addCell(labelC); 
			labelC = new jxl.write.Label(1, j+1, "DESCRIPTION OF JOB", title3);
			ws.addCell(labelC); 
			labelC = new jxl.write.Label(2, j+1, "HOUR", title3);
			ws.addCell(labelC); 
			labelC = new jxl.write.Label(3, j+1, "LABOUR", title3);
			ws.addCell(labelC);
			labelC = new jxl.write.Label(4, j+1, "MATERIAL", title3);
			ws.addCell(labelC);
	    	
			for(int z=0;z<26;z++)
				ws.setColumnView(z, 15);
				ws.setColumnView(0, 12);
				ws.setColumnView(1, 40);
				ws.setColumnView(2, 10);
				ws.setColumnView(3, 10);
				ws.setColumnView(4, 10);
				ws.setColumnView(5, 10);

				String sqlSelect="select a.rcbh,a.cc,a.xx,a.xh,b.xlmx,gs,gsf,clf from t_jcxxx a, zcgjd2 b where a.rcbh=b.rcbh and a.rcbh='"+brr[k]+"' "+sqlplus+"";
//				System.out.println(sqlSelect);
				List list=myService.listvar(sqlSelect);
				Iterator it=list.iterator();
				for(;it.hasNext();){
					Map map=(Map)it.next();
					  labelC = new jxl.write.Label(0, j+2,  map.get("xh").toString(), title3);
					  ws.addCell(labelC); 
					  labelC = new jxl.write.Label(1, j+2,  map.get("xlmx").toString(), title3);
					  ws.addCell(labelC); 
					  labelNF = new jxl.write.Number(2, j+2,new BigDecimal(map.get("gs").toString()).doubleValue(), wcfN2); 
					  ws.addCell(labelNF);
					  labelNF = new jxl.write.Number(3, j+2,new BigDecimal(map.get("gsf").toString()).doubleValue(), wcfN2); 
					  ws.addCell(labelNF);
					  labelNF = new jxl.write.Number(4, j+2,new BigDecimal(map.get("clf").toString()).doubleValue(), wcfN2); 
					  ws.addCell(labelNF);
					  j++;
				}
				
				String sumSelect="select sum(gsf) gsf,sum(clf) clf,a.xx,a.cc from t_jcxxx a, zcgjd2 b where a.rcbh=b.rcbh and a.rcbh='"+brr[k]+"' "+sqlplus+" group by a.rcbh";
				List sumlist=myService.listVar(sumSelect);
				if(sumlist.size()>0){
					Map summap=(Map)sumlist.get(0);
					
					  hj=Arith.add(new BigDecimal(summap.get("gsf").toString()).doubleValue(),new BigDecimal(summap.get("clf").toString()).doubleValue());
					  labelC = new jxl.write.Label(3, j+2, "Total:RMB", title2);
					  ws.addCell(labelC);
					  labelC = new jxl.write.Label(0, j+2,  summap.get("cc").toString()+summap.get("xx").toString(), title3);
					  ws.addCell(labelC); 
//					  labelNF = new jxl.write.Number(4, j+2,hj, wcfN2); 
//					  ws.addCell(labelNF);
					  labelC = new jxl.write.Label(4, j+2, df2.format(hj), title6);
					  ws.addCell(labelC);
					  j++;
				}
				j++;
				j++;
//				System.out.println(j);
	    }
	    
	    
	    
		  labelC = new jxl.write.Label(0, j, "X", title6);
		  ws.addCell(labelC);
		  String sum1Select="select sum(gsf) gsf,sum(clf) clf from zcgjd2  where rcbh in ("+var+") "+sqlplus+"";
		  List sum1list=myService.listVar(sum1Select);
//		  System.out.println(sum1Select);
		  if(sum1list.size()>0)
		  {
			  Map sum1map=(Map)sum1list.get(0);
			  hj1=Arith.add(new BigDecimal(sum1map.get("gsf").toString()).doubleValue(),new BigDecimal(sum1map.get("clf").toString()).doubleValue());
//		  labelNF = new jxl.write.Number(1, j,"TOTAL:RMB"+hj1, wcfN2); 
//		  ws.addCell(labelNF);
		  
		  labelC = new jxl.write.Label(1, j, "TOTAL:RMB"+df2.format(hj1), title6);
		  ws.addCell(labelC);
		  }
		  
		  ws.mergeCells(0, j+1, 4, j+1);
		  ws.mergeCells(0, j+2, 4, j+2);
		  labelC = new jxl.write.Label(0, j+1, "Add:15# Jianghai Road(N),Jin gang Town,Zhangjiagang City,Jiangsu 215633 P.R. China", title6);
		  ws.addCell(labelC);
		  labelC = new jxl.write.Label(0, j+2, "TEL:(86512)58315512   FAX:(86512)58315512", title6);
		  ws.addCell(labelC);
		  

	    wwb.write();
	    
	    wwb.close();
	    
	    os.flush();
	    os.close();
	     

	
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	
	return null;
}



}
