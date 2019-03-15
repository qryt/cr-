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

public class ExCosEDI extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExCosEDI() {
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
	    DateFormat fmt2 = new SimpleDateFormat("yyMMddHHmm");
	    DateFormat fmt3 = new SimpleDateFormat("HHmm");

	    String[] brr=var.split("//");
	    String ccxx="";
	    String sqlSelect="";
	    String sumSelect="";
	    double gsf=0.00;
	    double clf=0.00;
	    double gsf1=0.00;
	    double clf1=0.00;
	    double hjgc=0.00;
	    double hjgc1=0.00;
	    
	    String bjmc="";

	    int k=1;  
		Date date = new Date();

		out.println("UNB+UNOA:1+CNZJGYJA+COSCO+"+fmt1.format(date.getTime())+":"+fmt3.format(date.getTime())+"+R"+fmt2.format(date.getTime())+"'");
		
		for(int i=0;i<brr.length;i++){
			
			int j=0;
			TJcxxx jc=myService.loadTJcxxxBybh(brr[i]);
			
			out.println("UNH+YJ"+jc.getRcbh()+"+WESTIM:0'");
			j++;
			out.println("DTM+ATR+"+fmt1.format(jc.getJcrq())+"+"+fmt3.format(jc.getJcrq())+"'");
			j++;
			out.println("RFF+ADV+1'");
			j++;
			
			sumSelect="select sum(gsf) gsf,sum(clf) clf  from zcgjd2 where bjmc!='003' and RCBH='"+brr[i]+"' "+sqlplus+" ";
			List sumlist=myService.listVar(sumSelect);
			if(sumlist.size()>0){
				Map summap=(Map)sumlist.get(0);
				hjgc=Arith.add(new BigDecimal(summap.get("gsf").toString()).doubleValue(),new BigDecimal(summap.get("clf").toString()).doubleValue());
				out.println("ACA+CNY+STD:"+df2.format(hjgc)+"'");
				j++;
			}
			out.println("ACA+CNY+DPP:0.00'");
			j++;
			out.println("LBR+11.97'");
			j++;
			out.println("NAD+CED+COS'");
			j++;
			out.println("NAD+DED+CNZJGYJA'");
			j++;
			
			if(jc.getCc().equals("20’")&&jc.getXx().equals("GP"))
				ccxx="22G1";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("FC"))
				ccxx="20FC";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("HC"))
				ccxx="20HC";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("HG"))
				ccxx="20HG";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("HR"))
				ccxx="20HR";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("OT"))
				ccxx="20OT";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("RF"))
				ccxx="20RF";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("TK"))
				ccxx="20TK";
			
			if(jc.getCc().equals("40’")&&jc.getXx().equals("GP"))
				ccxx="42G1";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("FC"))
				ccxx="40FC";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("HC"))
				ccxx="45G1";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("HG"))
				ccxx="40HG";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("HR"))
				ccxx="40HR";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("OT"))
				ccxx="40OT";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("RF"))
				ccxx="40RF";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("TK"))
				ccxx="40TK";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("GP"))
				ccxx="45GP";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("FC"))
				ccxx="45FC";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("HC"))
				ccxx="45HC";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("HG"))
				ccxx="45HG";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("HR"))
				ccxx="45HR";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("OT"))
				ccxx="45OT";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("RF"))
				ccxx="45RF";
			if(jc.getCc().equals("45’")&&jc.getXx().equals("TK"))
				ccxx="45TK";
			
			out.println("EQF+CON+"+jc.getXh().substring(0, 4)+":"+jc.getXh().substring(4, jc.getXh().length())+"+"+ccxx+"+MGW:0:KGM'");
			j++;
			out.println("ERI++MAN:"+fmt1.format(jc.getJcrq())+"+ACEP'");
			j++;
			out.println("ECI+D'");
			j++;
			out.println("CUI+TRM:CNZJGYJA+TRM:"+fmt1.format(jc.getJcrq())+":0000'");
			j++;
			
			int m=1;
			sqlSelect="select id,rcbh,wzdm,shlx,xlff,xlmx,bjmc,c,k,sl,round(gs,2) gs,round(gsf,2) gsf,round(clf,2) clf,fff,lx,lrr,lrsj from zcgjd2 where   RCBH='"+brr[i]+"' "+sqlplus+"";
			List list=myService.listVar(sqlSelect);
			Iterator it=list.iterator();
			for(;it.hasNext();){
				Map map=(Map)it.next();
				String fff="";
				if(map.get("bjmc").toString().equals("TSR")||map.get("bjmc").toString().equals("BSR")||map.get("bjmc").toString().equals("DHD")||map.get("bjmc").toString().equals("FTR")||map.get("bjmc").toString().equals("FBR")||map.get("bjmc").toString().equals("DSL"))
					bjmc="RAL";
				else
					bjmc=map.get("bjmc").toString();
				
				out.println("DAM+"+m+"+"+map.get("wzdm").toString()+"+"+bjmc+"+"+map.get("shlx").toString()+"+ZZ'");
				j++;
				out.println("WOR+"+map.get("xlff").toString()+"+CMT:"+Long.parseLong(map.get("c").toString())+":"+Long.parseLong(map.get("k").toString())+":0+"+df3.parse(map.get("sl").toString())+"'");	
				j++;
				
				if(map.get("fff").toString().equals("C"))
					fff="O";
				else
					fff=map.get("fff").toString();
				
				out.println("COS+00+"+df2.format(new BigDecimal(map.get("gs").toString()).doubleValue())+"+"+df2.format(new BigDecimal(map.get("clf").toString()).doubleValue())+"+"+fff+"+11.97'");
				j++;
				m++;	
			}
			
			
		    String	sumSelect1="select sum(gsf) gsf,sum(clf) clf  from zcgjd2 where bjmc!='003' and RCBH='"+brr[i]+"' "+sqlplus+" ";
			List sumlist1=myService.listVar(sumSelect1);
			if(sumlist1.size()>0){
				Map summap1=(Map)sumlist1.get(0);
				 gsf1=new BigDecimal(summap1.get("gsf").toString()).doubleValue();
				 clf1=new BigDecimal(summap1.get("clf").toString()).doubleValue();
				 hjgc1=Arith.add(new BigDecimal(summap1.get("gsf").toString()).doubleValue(),new BigDecimal(summap1.get("clf").toString()).doubleValue());
				out.println("CTO+O+"+df2.format(gsf1)+"+"+df2.format(clf1)+"+0.00+0.00+"+df2.format(hjgc1)+"'");
				j++;
			}
			k++;
			
			out.println("TMA+"+df2.format(hjgc1)+"'");
			j++;
			out.println("UNT+"+(j+1)+"+YJ"+jc.getRcbh()+"'");
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
