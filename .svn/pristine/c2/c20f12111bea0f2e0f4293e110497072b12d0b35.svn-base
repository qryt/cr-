package com.cr.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.domain.TUser;
import com.cr.service.MyService;

public class Showpl extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Showpl() {
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
		  Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
		   Object   principal   =   auth.getPrincipal(); 
		   String   userId   =   null; 
		   if(principal   instanceof   UserDetails){ 
		   userId   =   ((UserDetails)principal).getUsername(); 
		   }
		try {   
            //获取一个sql参数   
            String var = request.getParameter("var");   
            String ck = request.getParameter("ck"); 
            String sql=request.getParameter("condition");
            ServletContext sc = request.getSession().getServletContext();
    		WebApplicationContext wc = WebApplicationContextUtils
            .getWebApplicationContext(sc);
    MyService myService=(MyService)wc.getBean("myService");
    TUser user=myService.loadUserById(userId);
    String[] bh=var.split("//");
    String str="";
    if(user.getJsmc().indexOf("高级用户")==-1)
    	str= " and cgs='"+user.getZh().toUpperCase()+"'";	
if(sql.length()>0)
	sql=sql+str;
else
	sql=" cgs='"+user.getZh().toUpperCase()+"'";	
   
   if(var.trim().equals("")){
    List jc= myService.listJc(sql);
 
   Iterator it=jc.iterator();
   bh=new String[jc.size()];
   for(int i=0;i<jc.size();i++){
	   Map map =(Map)it.next();
    bh[i]=map.get("rcbh").toString();
   }
 
   
   }
   List list=new ArrayList();
   ServletOutputStream  os = response.getOutputStream();   


JRPdfExporter exporter = new JRPdfExporter();
  // JRRtfExporter rtfExporter = new JRRtfExporter();

    for(int i=0;i<bh.length;i++)
    {
 
    
    	 if(null!=myService.getLx(bh[i])){
    	JasperPrint jasperPrint=new JasperPrint();

    	if(myService.getLx(bh[i]).equals("2"))
	 jasperPrint = myService.getGjdJaspers(request.getRealPath("/"), bh[i].toString(),ck);
 else
    	jasperPrint = myService.getGjdJasper(request.getRealPath("/"), bh[i].toString(),ck);
    list.add(jasperPrint);}
    }
    
 exporter.setParameter(JRExporterParameter.JASPER_PRINT_LIST, list);
exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,os);
exporter.exportReport();

  //  rtfExporter.setParameter(JRExporterParameter.JASPER_PRINT_LIST, list);
// rtfExporter.exportReport();

	os.close();
       
      
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
