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

public class ExOoclEDI extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExOoclEDI() {
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
		    
		 DateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmSS");
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
	    DateFormat fmt2 = new SimpleDateFormat("yyyyMMddHHmm");

	    String[] brr=var.split("//");
	    String xh="";
	    String ccxx="";
	    String bjmc="";
	    String fff="";
	    String sqlSelect="";
		String Length="";
		String Width="";
		String sumSelect="";
		String hj="";
		String gsumSelect="";
		String gsumSelect1="";
		String gsumSelect2="";
		String gsumSelect3="";
		String zsumSelect="";
		String C1="C";
		String U1="U";
		int j=0;
		for(int i=0;i<brr.length;i++){
			out.println("UNZ+1+000099'");
			j++;
			out.println("UNB+UNOA:1+GBLONSCLE:ZZ+HKHKGOOCL:ZZ+030321:2027+000100'");
			j++;
			out.println("UNH+GBLONSCLE00001+WESTIM:0+OCLAX4 P932+0'");
			j++;
			TJcxxx jc=myService.loadTJcxxxBybh(brr[i]);
			j++;
			out.println("DTM+ATR+"+fmt1.format(jc.getJcrq())+"'");
			j++;
			out.println("RFF+EST++"+fmt1.format(jc.getJcrq())+"'");
			j++;
			out.println("ACA+CNY+STD'");
			j++;
			out.println("ACA+USD+DPP'");
			j++;
			out.println("LBR+17.00'");
			j++;
			out.println("NAD+LED+OOCL'");
			j++;
			out.println("NAD+DED+ZJG11'");
			j++;
			out.println("NAD+CED+OOCL'");
			j++;
			out.println("CTA+TO+John Smith:PTFI Office Building II Room 247'");
			j++;
			out.println("CTA+FR+Zhangjiagang Win Hanverky Container Repair Co.,ltd'");
			j++;
			out.println("CTA+CC+Ms'");
			j++;
			xh=jc.getXh();
			if(jc.getCc().equals("20’")&&jc.getXx().equals("GP"))
			ccxx="22G1";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("GP"))
			ccxx="42G1";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("HC"))
			ccxx="45G1";
			if(jc.getCc().equals("40’")&&jc.getXx().equals("OT"))
			ccxx="42U1";
			if(jc.getCc().equals("20’")&&jc.getXx().equals("OT"))
			ccxx="22U1";
			out.println("EQF+CON+"+xh.substring(0, 4)+":"+xh.substring(4, xh.length())+"+"+ccxx+":OT2+MGW::KGM'");
			j++;
			out.println("ECI+D'");
			j++;
			out.println("CUI++TRM:"+fmt1.format(jc.getJcrq())+"'");
			j++;
			out.println("CUI++PON:"+fmt1.format(jc.getJcrq())+"'");
			j++;
			
			sqlSelect="select id,rcbh,wzdm,shlx,xlff,xlmx,bjmc,c,k,sl,round(gs,2) gs,round(gsf,2) gsf,round(clf,2) clf,fff,lx,lrr,lrsj from zcgjd2 where RCBH='"+brr[i]+"' "+sqlplus+"";
			List list=myService.listVar(sqlSelect);
			Iterator it=list.iterator();
			for(;it.hasNext();){
				Map map=(Map)it.next();
				
				if(map.get("bjmc").toString().equals("TSR")||map.get("bjmc").toString().equals("BSR")||map.get("bjmc").toString().equals("DHD")||map.get("bjmc").toString().equals("FTR")||map.get("bjmc").toString().equals("FBR")||map.get("bjmc").toString().equals("DSL"))
					bjmc="RLA";
				else if(map.get("bjmc").toString().equals("LHD"))
					bjmc="LBA";
				else if(map.get("bjmc").toString().equals("RCC"))
					bjmc="DRT";
				else if(map.get("bjmc").toString().equals("MPD"))
					bjmc="MPS";
				else if(map.get("bjmc").toString().equals("MPS"))
					bjmc="MPD";
				else if(map.get("bjmc").toString().equals("CDH"))
					bjmc="HGA";
				else if(map.get("bjmc").toString().equals("HBL"))
					bjmc="HGB";
				else if(map.get("bjmc").toString().equals("HPI"))
					bjmc="HGP";
				else if(map.get("bjmc").toString().equals("SCU"))
					bjmc="HWR";
				else if(map.get("bjmc").toString().equals("CMU"))
					bjmc="CMA";
				else if(map.get("bjmc").toString().equals("MOC"))
					bjmc="MSN";
				else if(map.get("bjmc").toString().equals("TNF")||map.get("bjmc").toString().equals("TNT"))
					bjmc="TNA";
				else if(map.get("bjmc").toString().equals("TIF"))
					bjmc="TIC";
				else if(map.get("bjmc").toString().equals("UTP"))
					bjmc="LBF";
				else if(map.get("bjmc").toString().equals("HGH"))
					bjmc="HGB";
				else
					bjmc=map.get("bjmc").toString();
				out.println("DAM+1+"+map.get("wzdm").toString()+"+"+bjmc+"+"+map.get("shlx").toString()+"+SK'");
				j++;
				long c=Long.parseLong(map.get("c").toString());
				if(c>0)
					Length=Long.toString(c);
				else
					Length="0.00";
				long k=Long.parseLong(map.get("k").toString());
				if(k>0)
					Width=Long.toString(k);
				else
					Width="0.00";
				out.println("WOR+"+map.get("xlff").toString()+"+CMT:"+Length+":"+Width+":0.00+"+df3.parse(map.get("sl").toString())+"'");
				j++;
				

				 if(map.get("fff").toString().equals("C")||map.get("fff").toString().equals("U"))
					 fff="T";
				 else
					 fff=map.get("fff").toString();
				out.println("COS+00+"+df2.format(new BigDecimal(map.get("gs").toString()).doubleValue())+"+"+df2.format(new BigDecimal(map.get("clf").toString()).doubleValue())+"+"+fff+"++N'");
				j++;			
			}
			
			sumSelect="select sum(gsf) gsf,sum(clf) clf  from zcgjd2 where RCBH='"+brr[i]+"' "+sqlplus+" ";
			List sumlist=myService.listVar(sumSelect);
			if(sumlist.size()>0){
				Map summap=(Map)sumlist.get(0);
				double gsf=new BigDecimal(summap.get("gsf").toString()).doubleValue();
				double clf=new BigDecimal(summap.get("clf").toString()).doubleValue();
				double hjgc=Arith.add(new BigDecimal(summap.get("gsf").toString()).doubleValue(),new BigDecimal(summap.get("clf").toString()).doubleValue());
				out.println("CTO+X+"+df2.format(gsf)+"+"+df2.format(clf)+"+++"+df2.format(hjgc)+"'");
				j++;
			}
				
			
			double ghj=0.00;
			double ghj1=0.00;
			double ghj2=0.00;
			double ghj3=0.00;
			String ffft="T";
			
			
			gsumSelect2="select sum(gsf) gsf,sum(clf) clf,fff from zcgjd2 where RCBH='"+brr[i]+"' "+sqlplus+" and (fff!='"+C1+"' and fff!='"+U1+"' ) group by fff ";	
			List gsumlist2=myService.listVar(gsumSelect2);
			Iterator gsumit2=gsumlist2.iterator();
			for(;gsumit2.hasNext();){
				Map gsummap2=(Map)gsumit2.next();
				ghj3=Arith.add(new BigDecimal(gsummap2.get("gsf").toString()).doubleValue(),new BigDecimal(gsummap2.get("clf").toString()).doubleValue());
				out.println("CTO+"+gsummap2.get("fff").toString()+"+++++"+df2.format(ghj3)+"'");
				j++;
				}
			
			
			gsumSelect="select sum(gsf) gsf,sum(clf) clf,fff from zcgjd2 where RCBH='"+brr[i]+"' "+sqlplus+" group by fff ";
			List gsumlist=myService.listVar(gsumSelect);
			Iterator gsumit=gsumlist.iterator();
			for(;gsumit.hasNext();){
				Map gsummap=(Map)gsumit.next();

				if(gsummap.get("fff").toString().equals("C"))
					{ffft="T";
					gsumSelect1="select sum(gsf) gsf,sum(clf) clf from zcgjd2 where RCBH='"+brr[i]+"' "+sqlplus+" and fff='"+C1+"' ";
					List gsumlist1=myService.listVar(gsumSelect1);
					Iterator gsumit1=gsumlist1.iterator();
					for(;gsumit1.hasNext();){
						Map gsummap1=(Map)gsumit1.next();
				    ghj=Arith.add(new BigDecimal(gsummap1.get("gsf").toString()).doubleValue(),new BigDecimal(gsummap1.get("clf").toString()).doubleValue());
					}}
				
				if(gsummap.get("fff").toString().equals("U"))
				{ffft="T";
				gsumSelect3="select sum(gsf) gsf,sum(clf) clf from zcgjd2 where RCBH='"+brr[i]+"' "+sqlplus+" and fff='"+U1+"' ";
				List gsumlist3=myService.listVar(gsumSelect3);
				Iterator gsumit3=gsumlist3.iterator();
				for(;gsumit3.hasNext();){
					Map gsummap3=(Map)gsumit3.next();
			    ghj1=Arith.add(new BigDecimal(gsummap3.get("gsf").toString()).doubleValue(),new BigDecimal(gsummap3.get("clf").toString()).doubleValue());
				}}
				ghj2=Arith.add(ghj,ghj1);	
               } 
		    out.println("CTO+"+ffft+"+++++"+df2.format(ghj2)+"'");
			j++;
			
			
			zsumSelect="select sum(gsf) gsf,sum(clf) clf  from zcgjd2 where RCBH='"+brr[i]+"' "+sqlplus+"";
			List zsumlist=myService.listVar(zsumSelect);
			if(zsumlist.size()>0){
				Map zsummap=(Map)zsumlist.get(0);
				double zhjgc=Arith.add(new BigDecimal(zsummap.get("gsf").toString()).doubleValue(),new BigDecimal(zsummap.get("clf").toString()).doubleValue());
				out.println("TMA+"+df2.format(zhjgc)+"'");
				j++;
			}

			out.println("TXT+CDX+Damage Notification'");
			j++;
			out.println("TXT+CDX+TVT3'");
			j++;
			out.println("UNT+"+(j-1)+"+GBLONSCLE00100'");
			j++;
		}
		
		out.println("UNZ+"+(j-1)+"+GATE'");
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
