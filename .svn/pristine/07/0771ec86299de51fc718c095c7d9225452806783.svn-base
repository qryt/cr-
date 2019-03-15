package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.domain.TCgsxx;
import com.cr.domain.TJcxxx;
import com.cr.service.MyService;

public class ExSitcEDI extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExSitcEDI() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response); 
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.reset();
		  response.setContentType("APPLICATION/OCTET-STREAM; charset=UTF-8");
		    String chk = request.getParameter("ck");
		    String sqlplus="";
		    String[] arr=chk.split(",");
		    String sql=request.getParameter("condition");
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
		 DateFormat fmt = new SimpleDateFormat("yyMMddHHmmss");
		 String title="YJZ-EDI"+fmt.format(new Date());

		  response.setHeader("Content-Disposition","attachment; filename=\""+title+".txt\"");
		  SimpleDateFormat   formatter   =   new   SimpleDateFormat("yyyy-MM-dd");   
		  SimpleDateFormat   formatter1   =   new   SimpleDateFormat("yyyy-MM-dd HH:mm:SS");   
		  try{
			  ServletContext sc = request.getSession().getServletContext();
	    		WebApplicationContext wc = WebApplicationContextUtils
	            .getWebApplicationContext(sc);
	    MyService myService=(MyService)wc.getBean("myService");
	    PrintWriter out = response.getWriter();
String var="";
		int count=0;
	    if(null!=request.getParameter("var")&&request.getParameter("var").length()>0)
	    	var=request.getParameter("var");
	    DateFormat fmt1 = new SimpleDateFormat("yyyyMMddHHmm");
	    DecimalFormat df1 = new DecimalFormat("000");
	    DecimalFormat df2 = new DecimalFormat("#0.00");
	    DateFormat fmt2 = new SimpleDateFormat("yyMMdd");
		out.println("00:REPAIR::RP063:ZHANGJIGANG YONGJIA:SITC::"+fmt1.format(new Date())+"'");
	  count++;
	  String[] brr=var.split("//");
	  if(var.trim().equals("")){
			
		    List jc= myService.listJc(sql);

		   Iterator it=jc.iterator();
		   brr=new String[jc.size()];
		   for(int i=0;i<jc.size();i++){
			   Map map =(Map)it.next();
		    brr[i]=map.get("rcbh").toString();
		   }
		 
		   
		   }
		for(int i=0;i<brr.length;i++){
			TJcxxx jc=myService.loadTJcxxxBybh(brr[i]);
		
	
		 
		 String lrrq=formatter.format(jc.getLlrq());
		 long sl=myService.listvar("select rcbh from t_jcxxx where cgs='SITC' and llrq<'"+formatter1.format(jc.getLlrq())+"' and llrq>='"+lrrq+"'").size();
			 String xzt="DE";
		String wxlx="N";
		if(jc.getLxd().equals("随船空箱"))
			xzt="IE";
		if(jc.getSfbf().equals("退租修箱"))
			wxlx="O";
		 out.println("50:RP063"+fmt2.format(jc.getLlrq())+df1.format(sl+1)+":"+jc.getXh()+":"+jc.getCc().substring(0,2)+jc.getXx()+":YJZ:SITNKG:"+xzt+":"+wxlx+":::20.00:CNY:"+fmt1.format(jc.getJcrq())+":"+jc.getBz()+"'");
		
		 
		

	List		list=	myService.listvar("select id,wzdm,shlx,xlff,xlmx,bjmc,c,k,sl,gs,gsf,clf,fff,lrr,lrsj from zcgjd2 where rcbh = '"+brr[i]+"'"+sqlplus+"  order by id");

		//	list=myService.listGjd(brr[i]);
	Iterator	it=list.iterator();
		for(;it.hasNext();){
		Map map=(Map)it.next();
		
		String bjmc=map.get("bjmc").toString();
		if(bjmc.equals("TSR")||bjmc.equals("BSR")||bjmc.equals("DHD")||bjmc.equals("FTR")||bjmc.equals("FBR"))
			bjmc="RLA";
		else if(bjmc.equals("LHD"))
			bjmc="LBA";
		else if(bjmc.equals("RCC"))
			bjmc="DRT";
		else if(bjmc.equals("MPD"))
			bjmc="MPS";
		else if(bjmc.equals("MPS"))
			bjmc="MPD";
		else	if(bjmc.equals("CDH"))
			bjmc="HGA";
		else	if(bjmc.equals("HBL"))
			bjmc="HGB";
		else if(bjmc.equals("HPI"))
			bjmc="HGP";
		else if(bjmc.equals("SCU"))
			bjmc="HWR";
		else if(bjmc.equals("CMU"))
			bjmc="CMA";
		else if(bjmc.equals("MOC"))
			bjmc="MSN";
		else if(bjmc.equals("TNF"))
			bjmc="TNA";
		else if(bjmc.equals("TNT"))
			bjmc="TNA";
		else if(bjmc.equals("TIF"))
			bjmc="TIC";
		else if(bjmc.equals("HGH"))
			bjmc="HGB";
		String wzdm=map.get("wzdm").toString();
		String shlx=map.get("shlx").toString();
		String xlff=map.get("xlff").toString();
		String cldm="";
		if(wzdm.equals("BXXX")||wzdm.equals("IXXX"))
			cldm="ZZ";
		
		String pic=String.format("%d", new BigDecimal(map.get("sl").toString()).longValue());
		 
		String clf=df2.format(Float.parseFloat(map.get("clf").toString()));
		String clfl="0.00";
		if(new BigDecimal(Float.parseFloat(map.get("sl").toString())).longValue()>0)
	 clfl=df2.format(new BigDecimal(Float.parseFloat(map.get("clf").toString())).divide(new BigDecimal(Float.parseFloat(map.get("sl").toString())),2, BigDecimal.ROUND_HALF_EVEN).doubleValue());
		String gsf=df2.format(Float.parseFloat(map.get("gsf").toString()));
		String gs=df2.format(new BigDecimal(Float.parseFloat(map.get("gs").toString())).divide(new BigDecimal(Float.parseFloat(map.get("sl").toString())),2, BigDecimal.ROUND_HALF_EVEN).doubleValue());
	String fff=map.get("fff").toString();
	
	if(fff.equals("U"))
			fff="T";
	 long c=Long.parseLong(map.get("c").toString());
		if(c<15)
			c=0;
		 long k=Long.parseLong(map.get("k").toString());
			if(k<15)
				k=0;
		out.println("51:"+bjmc+":"+wzdm+":"+shlx+":"+xlff+":"+cldm+"::"+c+":"+k+":"+pic+":"+gs+":"+gsf+":"+clfl+":"+clf+"'");
		count++;
		}
		count++;
		}
		count++;
		out.println("99:"+count+"'");
			
	 
	    
	    out.flush();
	    out.close();
		  }catch(Exception e){
			  e.printStackTrace();
		  }

	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
