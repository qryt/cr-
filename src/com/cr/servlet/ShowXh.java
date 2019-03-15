package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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

public class ShowXh extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	public ShowXh() {
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

		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		ServletContext sc = request.getSession().getServletContext();
		WebApplicationContext wc = WebApplicationContextUtils
        .getWebApplicationContext(sc);
MyService myService=(MyService)wc.getBean("myService");

String id=request.getParameter("id");
List list=myService.listXh(id.trim());
Iterator it=list.iterator();
Map map=new HashMap();
		 StringBuffer results=new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
		 results.append("<results>");
		 for(;it.hasNext();){
			 map=(Map)it.next();
		
	        results.append("<result xh=\""+map.get("xh")+"\" cgs=\""+map.get("cgs")+"\" xx=\""+map.get("xx")+"\" cc=\""+map.get("cc")+"\" zzrq=\""+map.get("zzrq")+"\" />");
		 
		 }results.append("</results>");
	          out.write(results.toString().trim());
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
