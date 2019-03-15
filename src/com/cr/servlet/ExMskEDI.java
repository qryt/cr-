package com.cr.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.domain.TCgsxx;
import com.cr.domain.TJcxxx;
import com.cr.service.MyService;

public class ExMskEDI extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExMskEDI() {
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
		 DateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmSS");
		 String title="MSK"+fmt.format(new Date());

		  response.setHeader("Content-Disposition","attachment; filename=\""+title+".txt\"");
		  SimpleDateFormat   formatter   =   new   SimpleDateFormat("ddMMyyyy");   
		  try{
			  ServletContext sc = request.getSession().getServletContext();
	    		WebApplicationContext wc = WebApplicationContextUtils
	            .getWebApplicationContext(sc);
	    MyService myService=(MyService)wc.getBean("myService");
	    PrintWriter out = response.getWriter();
String var="";
		
	    if(null!=request.getParameter("var")&&request.getParameter("var").length()>0)
	    	var=request.getParameter("var");

	  TCgsxx cgs=myService.loadCgs("MSK");
	  String bsm=myService.getBsm();
		out.println("CTL"+cgs.getLgsdm()+bsm+"                                                               ");
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
		
		 myService.addBsm();
		 
		 String lrrq=formatter.format(jc.getLlrq());
		 String xh=jc.getXh();
		 String xxl=jc.getXxl();
		 System.out.println(xxl);
		 String pxyy=jc.getPxyy();
		 if(pxyy.trim().equals("3"))
			 pxyy="3JJG";
		 else if(pxyy.trim().equals("4"))
			 pxyy="4JJG";
		 else
			 pxyy=pxyy+"   ";
		 String bz="";
		 String tmp="";
		 int size=0;
		 if(null!=jc.getBz()){
		  bz=jc.getBz();
		 
		 size=76-bz.length();}
		 else
			 size=76;
		 for(int j=0;j<size;j++)
			 tmp=tmp+" ";
		 bz=bz+tmp;
		 
		 String zdbh="80"+jc.getZdbh();
		 String zgs=String.format("%04d", 0);
		 String zhj=String.format("%024d", 0);
	 List list= myService.listvar("select ifnull(sum(gs),0) as gs,ifnull(sum(hj),0) as hj from (select sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf+clf) hj from t_zcgjd  where rcbh='"+brr[i]+"'"+sqlplus+" union all select sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf+clf) hj from zcgjd2 where rcbh='"+brr[i]+"'"+sqlplus+") a");
	Iterator it=list.iterator();
		if(it.hasNext()){
			Map map=(Map)it.next();
			zgs=String.format("%04d",new BigDecimal(map.get("gs").toString()).multiply(new BigDecimal("100")).longValue());
			zhj=String.format("%024d",new BigDecimal(map.get("hj").toString()).multiply(new BigDecimal("100")).longValue());

		}
	out.println("HD1MAER"+cgs.getLgsdm()+lrrq+xh+xxl+pxyy+"W                                            ");
		out.println("HD2                          "+zdbh+zgs+zhj+"             ");
	out.println("RMK "+bz);
			list=	myService.listvar("select id,shlx,shwz,shdm,shmx,sl,xs,gsf,clf,fff,lrr,lrsj from t_zcgjd where rcbh = '"+brr[i]+"'"+sqlplus+"  order by id");

		//	list=myService.listGjd(brr[i]);
		it=list.iterator();
		for(;it.hasNext();){
		Map map=(Map)it.next();
		String shlx=map.get("shlx").toString();
		String shdm=map.get("shdm").toString();
		String shwz=map.get("shwz").toString();
		String pic=String.format("%03d", new BigDecimal(map.get("sl").toString()).longValue());
		String clf=String.format("%012d", new BigDecimal(map.get("clf").toString()).multiply(new BigDecimal("100")).divide(new BigDecimal(map.get("sl").toString())).longValue());
		String gs=String.format("%04d", new BigDecimal(map.get("xs").toString()).multiply(new BigDecimal("100")).divide(new BigDecimal(map.get("sl").toString())).longValue());
	String fff=map.get("fff").toString();
		if(fff.equals("U"))
			fff="T";
		out.println("RPR"+shlx+"  "+shdm+shwz+pic+clf+gs+fff+"                                             ");
		}
		}
		
			
	 
	    
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
