package com.cr.servlet;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.sf.jasperreports.engine.JasperPrint;

import com.cr.service.MyService;

public class Printgjd extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Printgjd() {
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

		try {   
            //获取一个sql参数   
            String rcbh = request.getParameter("bh");   
            String chk = request.getParameter("chk");  
             
            ServletContext sc = request.getSession().getServletContext();
    		WebApplicationContext wc = WebApplicationContextUtils
            .getWebApplicationContext(sc);
    MyService myService=(MyService)wc.getBean("myService");
            //获取JasperPrint对象   
            JasperPrint jasperPrint = myService.getGjdJasper(request.getRealPath("/"), rcbh,chk);
            //将JasperPrint转化为ObjectOutputStream数据流输出   
            response.setContentType("application/octet-stream");   
            ServletOutputStream out = response.getOutputStream();   
            ObjectOutputStream os = new ObjectOutputStream(out);   
            os.writeObject(jasperPrint);   
            os.flush();   
            os.close();   
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
