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
import com.cr.util.Arith;

public class ExCmaEDI extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExCmaEDI() {
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
		    
		 DateFormat fmt = new SimpleDateFormat("yyMMddHHmm");
		 String title="WESTIM"+fmt.format(new Date());

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

	    if(null!=request.getParameter("var")&&request.getParameter("var").length()>0)
	    	var=request.getParameter("var");
	    DateFormat fmt1 = new SimpleDateFormat("yyMMdd");
	    DecimalFormat df1 = new DecimalFormat("000");
	    DecimalFormat df2 = new DecimalFormat("#0.00");
	    DecimalFormat df3 = new DecimalFormat("#0");
	    DateFormat fmt2 = new SimpleDateFormat("yyMMddHHmmss");
	    DateFormat fmt3 = new SimpleDateFormat("HHmm");

	    String[] brr=var.split("//");
	    String ccxx="";
	    String sqlSelect="";
	    String sumSelect="";
	    double gsf=0.00;
	    double clf=0.00;
	    double hjgc=0.00;
	    String fff="";
	    String bjmc="";

	    
	    
		
		int k=1;
		
		Date date = new Date();

		out.println("UNB+UNOA:1+ZJGYJ+CMA+"+fmt1.format(date.getTime())+":"+fmt3.format(date.getTime())+"+R"+fmt2.format(date.getTime())+"'");
		
		for(int i=0;i<brr.length;i++){
			int j=0;
			out.println("UNH+"+k+"+WESTIM:0++1'");
			j++;
			TJcxxx jc=myService.loadTJcxxxBybh(brr[i]);
			
			out.println("DTM+ATR+"+fmt1.format(jc.getJcrq())+"+"+fmt3.format(jc.getJcrq())+"'");
			j++;
			out.println("RFF+EST+"+"ZJGYJ"+jc.getRcbh()+"+"+fmt1.format(jc.getJcrq())+"'");
			j++;
			out.println("RFF+ADV+1'");
			j++;
			out.println("ACA+CNY+STD:0.00'");
			j++;
			out.println("ACA+CNY+DPP:0.00'");
			j++;
			out.println("LBR+22.00'");
			j++;
			out.println("NAD+CED+CMA'");
			j++;
			out.println("NAD+DED+ZJGYJ'");
			j++;
			if(jc.getCc().equals("20’")&&jc.getXx().equals("GP"))
				ccxx="22G1";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("GP"))
				ccxx="42G1";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("HC"))
				ccxx="45G1";
			out.println("EQF+CON+"+jc.getXh().substring(0, 4)+":"+jc.getXh().substring(4, jc.getXh().length())+"+"+ccxx+"+MGW:0:KGM'");
			j++;
			out.println("ERI++MAN:"+fmt1.format(jc.getJcrq())+"+ACEP'");
			j++;
			out.println("ECI+D'");
			j++;
			out.println("CUI+TRM:ZJGYJ+TRM:"+fmt1.format(jc.getJcrq())+":0000'");
			j++;
			
			int m=1;
			sqlSelect="select id,rcbh,wzdm,shlx,xlff,xlmx,bjmc,c,k,sl,round(gs,2) gs,round(gsf,2) gsf,round(clf,2) clf,fff,lx,lrr,lrsj from zcgjd2 where  bjmc!='003' and RCBH='"+brr[i]+"' "+sqlplus+"";
			List list=myService.listVar(sqlSelect);
			Iterator it=list.iterator();
			for(;it.hasNext();){
				Map map=(Map)it.next();
				
				
				if(map.get("bjmc").toString().equals("TSR")||map.get("bjmc").toString().equals("BSR")||map.get("bjmc").toString().equals("DHD")||map.get("bjmc").toString().equals("FTR")||map.get("bjmc").toString().equals("FBR")||map.get("bjmc").toString().equals("DSL"))
					bjmc="RLA";
				
				else if(map.get("bjmc").toString().equals("DLA"))
					bjmc="LBA";
				else if(map.get("bjmc").toString().equals("RCC"))
					bjmc="DRT";
				else if(map.get("bjmc").toString().equals("HPI"))
					bjmc="HGP";
				else if(map.get("bjmc").toString().equals("CMU"))
					bjmc="CMA";
				else if(map.get("bjmc").toString().equals("HGH"))
					bjmc="HGB";
				else if(map.get("bjmc").toString().equals("CPS"))
					bjmc="CPA";
				else if(map.get("bjmc").toString().equals("CDH"))
					bjmc="HGB";
				else if(map.get("bjmc").toString().equals("FLT"))
					bjmc="FLW";
				else if(map.get("bjmc").toString().equals("MOC"))
					bjmc="MSD";
				else if(map.get("bjmc").toString().equals("PAT")||map.get("bjmc").toString().equals("PAS")||map.get("bjmc").toString().equals("PAF")||map.get("bjmc").toString().equals("PAD"))
					bjmc="PSC";
				else if(map.get("bjmc").toString().equals("SCU"))
					bjmc="FWA";
				else if(map.get("bjmc").toString().equals("TNF")||map.get("bjmc").toString().equals("TNT"))
					bjmc="TNA";
				else if(map.get("bjmc").toString().equals("TIF"))
					bjmc="TIC";
				else
					bjmc=map.get("bjmc").toString();
				
				
				
				
				
				out.println("DAM+"+m+"+"+map.get("wzdm").toString()+"+"+bjmc+"+"+map.get("shlx").toString()+"+SK'");
				j++;
				
				boolean result=map.get("lx").toString().matches("[0-9]+");
				//判断字符串是纯数字
				if (result == true)
				out.println("WOR+"+map.get("xlff").toString()+"+CMT:"+Long.parseLong(map.get("c").toString())+":"+Long.parseLong(map.get("k").toString())+":0+"+df3.parse(map.get("lx").toString())+"'");
				else
				out.println("WOR+"+map.get("xlff").toString()+"+CMT:"+Long.parseLong(map.get("c").toString())+":"+Long.parseLong(map.get("k").toString())+":0+"+df3.parse(map.get("sl").toString())+"'");	
				j++;
				
				if(map.get("fff").toString().equals("U")||map.get("fff").toString().equals("C")||map.get("fff").toString().equals("T"))
					fff="T";
				else
					fff=map.get("fff").toString();
				
				out.println("COS+00+"+df2.format(new BigDecimal(map.get("gs").toString()).doubleValue())+"+"+df2.format(new BigDecimal(map.get("clf").toString()).doubleValue())+"+"+fff+"+20.00'");
				j++;
				m++;
				
			}
			
			sumSelect="select sum(gsf) gsf,sum(clf) clf  from zcgjd2 where bjmc!='003' and RCBH='"+brr[i]+"' "+sqlplus+" ";
			List sumlist=myService.listVar(sumSelect);
			if(sumlist.size()>0){
				Map summap=(Map)sumlist.get(0);
				 gsf=new BigDecimal(summap.get("gsf").toString()).doubleValue();
				 clf=new BigDecimal(summap.get("clf").toString()).doubleValue();
				 hjgc=Arith.add(new BigDecimal(summap.get("gsf").toString()).doubleValue(),new BigDecimal(summap.get("clf").toString()).doubleValue());
				out.println("CTO+O+"+df2.format(gsf)+"+"+df2.format(clf)+"+0.00+0.00+"+df2.format(hjgc)+"'");
				j++;
			}
			k++;
			
			out.println("TMA+"+df2.format(hjgc)+"'");
			j++;
			out.println("UNT+"+(j+1)+"+"+(k-1)+"'");
			
		}
		
		out.println("UNZ+"+(k-1)+"+"+"R"+fmt2.format(date.getTime())+"'");
		
		
		
		out.flush();
	    out.close();
		   }catch(Exception e){
			  e.printStackTrace();
		  }
	
	}

		  public void init() throws ServletException {
				// Put your code here
			}

		}
