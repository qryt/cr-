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

public class ExSunEDI extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExSunEDI() {
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
		 String title="SUNTIM"+fmt.format(new Date());

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
		Date date = new Date();
		for(int i=0;i<brr.length;i++){
			int j=1;
			TJcxxx jc=myService.loadTJcxxxBybh(brr[i]);
			String sqlSelect="select id,rcbh,wzdm,shlx,xlff,xlmx,bjmc,c,k,sl,round(gs,2) gs,round(gsf,2) gsf,round(clf,2) clf,fff,lx,lrr,lrsj from zcgjd2 where  RCBH='"+brr[i]+"' "+sqlplus+"";
			List list=myService.listvar(sqlSelect);
            Iterator it=list.iterator();
            for(;it.hasNext();){
            	Map map=(Map)it.next();
            	String bjmc="";
				if(map.get("bjmc").toString().equals("TSR")||map.get("bjmc").toString().equals("BSR")||map.get("bjmc").toString().equals("FTR")||map.get("bjmc").toString().equals("FBR"))
					bjmc="RLA";
				else if(map.get("bjmc").toString().equals("CMU"))
					bjmc="CMA";
				else if(map.get("bjmc").toString().equals("HGH"))
					bjmc="HGB";
				else
					bjmc=map.get("bjmc").toString();
				
            	out.println( j+";"+jc.getRcbh()+";"+jc.getXh()+";"+jc.getCc().substring(0, 2)+jc.getXx()+";"+formatter.format(jc.getJcrq())+";"+map.get("xlmx").toString()+";"+bjmc+";"+map.get("xlff").toString()+";"+map.get("shlx").toString()+";"+map.get("wzdm").toString()+";"+df3.format(new BigDecimal(map.get("sl").toString()).doubleValue())+";"+ df3.format(new BigDecimal(map.get("c").toString()).doubleValue())+";"+df3.format(new BigDecimal(map.get("k").toString()).doubleValue())+";"+df2.format(new BigDecimal(map.get("gs").toString()).doubleValue())+";"+ df2.format(new BigDecimal(map.get("gsf").toString()).doubleValue()) +";"+df2.format(new BigDecimal(map.get("clf").toString()).doubleValue())+";"+df2.format(Arith.add(new BigDecimal(map.get("gsf").toString()).doubleValue(),new BigDecimal(map.get("clf").toString()).doubleValue()))  );
            	j++;
            }
		}
		
		
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
