package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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

public class Showxlfl extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Showxlfl() {
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

String sort=request.getParameter("sort");
String dir=request.getParameter("dir");
int index = Integer.parseInt(start); 
int pageSize = Integer.parseInt(limit); 
String sql="";
if(null!=request.getParameter("sql")&&!request.getParameter("sql").trim().equals(""))
 sql=request.getParameter("sql");;

List list=myService.listXlfl(Long.parseLong(request.getParameter("bh")),index,pageSize,sort,dir,sql);
long sl=myService.sumxlfl(Long.parseLong(request.getParameter("bh")),sql);
String data = "{totalProperty:"+sl+",root:["; 
DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
Iterator it=list.iterator();
for(;it.hasNext();){
	Map map=(Map)it.next();
	data+="{cz:'<img src=images/pen.gif alt=\"修改\" onclick=winopen2(\"editxlfl.htm?bh="+map.get("id")+"&operation=r&op=n\") style=\"cursor:hand\">&nbsp;&nbsp;<img src=images/delete.gif alt=\"删除\" onclick=delxlfl(\""+map.get("id")+"\",\"r\")  style=\"cursor:hand\">',shdm:'"+map.get("shdm")+"',shmx:'"+map.get("shmx") +"',gs:"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+",clf:"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"},";
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
