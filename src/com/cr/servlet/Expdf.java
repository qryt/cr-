package com.cr.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperRunManager;
 

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.service.MyService;

public class Expdf extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Expdf() {
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

	 
		 response.setContentType("application/pdf; charset=UTF-8");
		 response.setHeader("Content-Disposition","attachment; filename=\"gjd.pdf\"");
		 
		 String rcbh = request.getParameter("bh"); 
		 String chk = request.getParameter("chk"); 
		 ServletContext sc = request.getSession().getServletContext();
 		WebApplicationContext wc = WebApplicationContextUtils
         .getWebApplicationContext(sc);
MyService myService=(MyService)wc.getBean("myService");
 JasperPrint jasperPrint = myService.getGjdJasper(request.getRealPath("/"), rcbh,chk);
 
 Map parameters=null;
 
 try {  
	 byte[]   bytes=JasperExportManager.exportReportToPdf(jasperPrint);  
//bytes=JasperRunManager.runReportToPdf(jasperPrint, new HashMap());
response.setContentLength(bytes.length);
ServletOutputStream servletOutputStream = response.getOutputStream();
 servletOutputStream.write(bytes,0,bytes.length);
 servletOutputStream.flush();
 servletOutputStream.close(); 
		} catch (Exception e) {   
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
