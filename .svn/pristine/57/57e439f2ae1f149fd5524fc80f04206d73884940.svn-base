package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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

import com.cr.service.MyService;

public class ShowGjd extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowGjd() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext sc = request.getSession().getServletContext();
		WebApplicationContext wc = WebApplicationContextUtils
        .getWebApplicationContext(sc);
MyService myService=(MyService)wc.getBean("myService");
String start = request.getParameter("start"); 
String limit = request.getParameter("limit");
DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
String jcrq="";
String ccrq="";
String qrrq="";
String jzrq="";
String wgrq=""; 
String lrrq="";
String re="";
String sort=request.getParameter("sort");
String dir=request.getParameter("dir");
int index = Integer.parseInt(start); 
int pageSize = Integer.parseInt(limit); 
String sql="";
if(null!=request.getParameter("sql")&&!request.getParameter("sql").trim().equals(""))
 sql=request.getParameter("sql");;
List list=myService.listJc(index,pageSize,sort,dir,sql);
long sl=myService.sumJc(sql);
String data = "{totalProperty:"+sl+",root:["; 
DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
Iterator it=list.iterator();
for(;it.hasNext();){
	Map map=(Map)it.next();
	if(null!=map.get("jcrq"))
		jcrq=map.get("jcrq").toString().substring(2,16);
			else
			jcrq="";
			if(null!=map.get("ccrq"))
		 ccrq=map.get("ccrq").toString().substring(2,16);
			else
				ccrq="";
			if(null!=map.get("qrrq"))
		 qrrq=map.get("qrrq").toString().substring(2,16);
			else
				qrrq="";
			if(null!=map.get("jzrq"))
		 jzrq=map.get("jzrq").toString().substring(2,16);
			else
				jzrq="";
			if(null!=map.get("wgrq"))
		 wgrq=map.get("wgrq").toString().substring(2,16);
			else
				wgrq="";
			if(null!=map.get("llrq"))
				 lrrq=map.get("llrq").toString().substring(2,16);
					else
						lrrq="";
			list=myService.listFpdcByRcbh(map.get("rcbh").toString());
			Iterator it1=list.iterator();
			re="";
			for(;it1.hasNext();){
				Map map1=(Map)it1.next();
			re=re+map1.get("zzrq").toString().substring(2,16)+","+decimalFormat.format(map1.get("dcfl"))+";";
			}
	if(null!=map.get("fllx")&&map.get("fllx").toString().equals("2"))
		data+="{cz:'<img src=images/pen.gif alt=\"编辑\" onclick=winopen(\"editjcdj2.htm?bh="+map.get("rcbh")+"&operation=s&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deljcdj(\""+map.get("rcbh")+"\",\"s\")  style=\"cursor:hand\">',fllx : '"+map.get("fllx")+"', rcbh : '"+map.get("rcbh")+"',cgs : '"+map.get("cgs")+"',xz : '"+map.get("xz")+"' , xh : '"+map.get("xh")+"' , cc : '"+map.get("cc")+"', xx: '"+map.get("xx")+"', xxl: '"+map.get("xxl")+"', jczt: '"+map.get("jczt")+"', tdh: '"+map.get("tdh")+"', zzrq : '"+map.get("zzrq")+"',  jctc : '"+map.get("jctc")+"', lxd : '"+map.get("lxd")+"', jcwz : '"+map.get("jcwz")+"', wzmx : '"+map.get("wzmx")+"', eirlsh : '"+map.get("eirlsh")+"', zgd : '"+map.get("zgd")+"', sfbf : '"+map.get("sfbf")+"', zygr : '"+map.get("zygr")+"', zdbh : '"+map.get("zdbh")+"', jcrq : '"+jcrq+"', qrrq : '"+qrrq+"', wgrq : '"+wgrq+"', ccrq : '"+ccrq+"', jzrq : '"+jzrq+"', qdf : '"+decimalFormat.format(Double.parseDouble(map.get("qdf").toString()))+"', tyf : '"+decimalFormat.format(Double.parseDouble(map.get("tyf").toString()))+"', dcf : '"+decimalFormat.format(Double.parseDouble(map.get("dcf").toString()))+"', gs : '"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+"', gsf : '"+decimalFormat.format(Double.parseDouble(map.get("gsf").toString()))+"', clf : '"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"', hj : '"+decimalFormat.format(Double.parseDouble(map.get("hj").toString()))+"', hblx : '"+map.get("hblx")+"', llr : '"+map.get("llr")+"', llrq : '"+lrrq+"', re : '"+re+"'},";

		else
			data+="{cz:'<img src=images/pen.gif alt=\"编辑\" onclick=winopen(\"editjcdj.htm?bh="+map.get("rcbh")+"&operation=s&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=deljcdj(\""+map.get("rcbh")+"\",\"s\")  style=\"cursor:hand\">',fllx : '"+map.get("fllx")+"', rcbh : '"+map.get("rcbh")+"',cgs : '"+map.get("cgs")+"',xz : '"+map.get("xz")+"' , xh : '"+map.get("xh")+"' , cc : '"+map.get("cc")+"', xx: '"+map.get("xx")+"', xxl: '"+map.get("xxl")+"', jczt: '"+map.get("jczt")+"', tdh: '"+map.get("tdh")+"', zzrq : '"+map.get("zzrq")+"',  jctc : '"+map.get("jctc")+"', lxd : '"+map.get("lxd")+"', jcwz : '"+map.get("jcwz")+"', wzmx : '"+map.get("wzmx")+"', eirlsh : '"+map.get("eirlsh")+"', zgd : '"+map.get("zgd")+"', sfbf : '"+map.get("sfbf")+"', zygr : '"+map.get("zygr")+"', zdbh : '"+map.get("zdbh")+"', jcrq : '"+jcrq+"', qrrq : '"+qrrq+"', wgrq : '"+wgrq+"', ccrq : '"+ccrq+"', jzrq : '"+jzrq+"', qdf : '"+decimalFormat.format(Double.parseDouble(map.get("qdf").toString()))+"', tyf : '"+decimalFormat.format(Double.parseDouble(map.get("tyf").toString()))+"', dcf : '"+decimalFormat.format(Double.parseDouble(map.get("dcf").toString()))+"', gs : '"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+"', gsf : '"+decimalFormat.format(Double.parseDouble(map.get("gsf").toString()))+"', clf : '"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"', hj : '"+decimalFormat.format(Double.parseDouble(map.get("hj").toString()))+"', hblx : '"+map.get("hblx")+"', llr : '"+map.get("llr")+"', llrq : '"+lrrq+"', re : '"+re+"'},";
}
 
if(data.length()>23)
	data=data.substring(0,data.length()-1);
data+="]}";
		out.println(data);
		out.flush();
		out.close();
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

		doGet(request, response);
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
