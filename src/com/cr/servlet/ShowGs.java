package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.domain.TCgsxx;
import com.cr.service.MyService;

public class ShowGs extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowGs() {
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

		response.setContentType("text/xml; charset=UTF-8");
		 PrintWriter out = response.getWriter();
	        StringBuffer results=new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
	        try{
				  
				  ServletContext sc = request.getSession().getServletContext();
		    		WebApplicationContext wc = WebApplicationContextUtils
		            .getWebApplicationContext(sc);
		    MyService myService=(MyService)wc.getBean("myService");
	     List list=  myService.listAllCgs();
	     if(list.size()>0){
	    	 results.append("<root>");
	    	 
	     Iterator it=list.iterator();
	     for(;it.hasNext();){
	    	 results.append("<cgs>");
	    	 TCgsxx cgs=(TCgsxx)it.next();
	    	 results.append("<gsid>");
	    	 results.append(cgs.getGsid());
	    	 results.append("</gsid>");
	    	 results.append("<gsdm>");
	    	 results.append(cgs.getGsdm());
	    	 results.append("</gsdm>");
	    	 results.append("<fllx>");
	    	 results.append(cgs.getFllx());
	    	 results.append("</fllx>");
	    	   results.append("</cgs>");
	     }
	     results.append("</root>");
	     out.write(results.toString().trim());
	     }
	   out.close();
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
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
