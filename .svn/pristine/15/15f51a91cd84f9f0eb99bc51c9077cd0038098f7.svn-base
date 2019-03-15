package com.cr.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.format.PageOrientation;
import jxl.format.PaperSize;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.domain.TCgsxx;
import com.cr.service.MyService;

public class PrintXlfl2 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public PrintXlfl2() {
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

		  response.setContentType("APPLICATION/OCTET-STREAM; charset=iso-8859-1");
		  response.setHeader("Content-Disposition","attachment; filename=\"print.xls\"");
		 long gsid=0;
		 if(null!=request.getParameter("bh")&&request.getParameter("bh").trim().length()>0)
			 gsid=Long.parseLong(request.getParameter("bh"));
		  if(gsid>0) 
		 try{
			  ServletContext sc = request.getSession().getServletContext();
	    		WebApplicationContext wc = WebApplicationContextUtils
	            .getWebApplicationContext(sc);
	    MyService myService=(MyService)wc.getBean("myService");
	 
	   TCgsxx cgs= myService.loadCgsxxById(gsid);
	    
	    OutputStream os = response.getOutputStream();
	    jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(os);
	    jxl.write.WritableSheet ws = wwb.createSheet("修理费率报表", 0);
	    ws.setColumnView(0, 6);
	    ws.setColumnView(1, 24);
	    ws.setColumnView(2, 24);
	    ws.setColumnView(3, 24);
	    ws.setColumnView(4, 24);
	    ws.setColumnView(5, 24);

	    //设置行高
	    ws.setRowView(0, 600);
	    ws.setRowView(1, 400);
	    ws.setRowView(2, 300);
	    ws.setRowView(4, 300);
	    ws.setRowView(5, 300);
	    ws.setRowView(6, 300);
	    ws.setPageSetup(PageOrientation.LANDSCAPE.LANDSCAPE, PaperSize.A4, 0, 0);
	    WritableFont font1 = new WritableFont(WritableFont.TIMES, 16,
	                                          WritableFont.BOLD);
	    WritableCellFormat title1 = new WritableCellFormat(font1);
	    title1.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
	    //小标题的格式
	    WritableFont font2 = new WritableFont(WritableFont.TIMES, 12,
	                                          WritableFont.NO_BOLD);
	    WritableCellFormat title2 = new WritableCellFormat(font2);
	    title2.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
	    //次标题的格式
	    WritableFont font3 = new WritableFont(WritableFont.TIMES, 10,
	                                          WritableFont.NO_BOLD);
	    WritableCellFormat title3 = new WritableCellFormat(font3);
	    title3.setAlignment(jxl.format.Alignment.LEFT); //水平对齐
	    //表格栏目的格式
	    WritableFont font4 = new WritableFont(WritableFont.TIMES, 10,
	                                          WritableFont.NO_BOLD);
	    WritableCellFormat title4 = new WritableCellFormat(font4);
	    title4.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
	    title4.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
	    title4.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框
	    //设置数据类的格式
	    WritableFont font5 = new WritableFont(WritableFont.TIMES, 12,
	                                          WritableFont.NO_BOLD);
	    jxl.write.Number labelNF=null;
     jxl.write.NumberFormat nf = new jxl.write.NumberFormat("#.00");
     jxl.write.WritableCellFormat wcfN = new jxl.write.WritableCellFormat(nf);
wcfN.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
	    WritableCellFormat cell = new WritableCellFormat(font5);
	    cell.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
	    cell.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
	    cell.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框
	    jxl.write.Label labelC = new jxl.write.Label(0, 0, cgs.getGsmc()+"修理费率报表", title1);
	    ws.addCell(labelC);
	    ws.mergeCells(0, 0, 8, 0);
labelC = new jxl.write.Label(0, 1, "序号", title4);
	    
	    ws.addCell(labelC);
	    ws.setColumnView(0, 10);
	    labelC = new jxl.write.Label(1, 1, "类型", title4);
	    
	    ws.addCell(labelC);
	    ws.setColumnView(1, 15);
	    labelC = new jxl.write.Label(2, 1, "部件名称", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(2, 10);
	    labelC = new jxl.write.Label(3, 1, "修理方法", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(3, 10);
	    labelC = new jxl.write.Label(4, 1, "长", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(4, 10);
	    labelC = new jxl.write.Label(5, 1, "宽", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(5, 10);
	    labelC = new jxl.write.Label(6, 1, "修理描叙", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(6, 30);
	    labelC = new jxl.write.Label(7, 1, "工时", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(7, 10);
	    labelC = new jxl.write.Label(8, 1, "材料费", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(8, 10);
	    
	     
	  
	 
	    
	    int i = 0;
	 
	  List list=  myService.listXlfl2ByGsid(gsid);
	 Iterator it =list.iterator();
	 for(;it.hasNext();){
		 Map map=(Map)it.next();
		 ++i;
		 
		 
		 	 labelC = new jxl.write.Label(0, 1 + i, String.valueOf(i), title4);
       ws.addCell(labelC); 
	      labelC = new jxl.write.Label(1, 1 + i, String.valueOf(map.get("lx")), title4);
       ws.addCell(labelC); 
	      labelC = new jxl.write.Label(2, 1 + i, String.valueOf(map.get("bjmc")), title4);
       ws.addCell(labelC); 
       labelC = new jxl.write.Label(3, 1 + i, String.valueOf(map.get("xlff")), title4);
       ws.addCell(labelC); 
       labelC = new jxl.write.Label(4, 1 + i, String.valueOf(map.get("c")), title4);
       ws.addCell(labelC); 
       labelC = new jxl.write.Label(5, 1 + i, String.valueOf(map.get("k")), title4);
       ws.addCell(labelC); 
       labelC = new jxl.write.Label(6, 1 + i, String.valueOf(map.get("xlmx")), title4);
       ws.addCell(labelC); 
       labelNF = new jxl.write.Number(7, 1 + i, Double.parseDouble(String.valueOf(map.get("gs"))), wcfN);
       ws.addCell(labelNF);
       labelNF = new jxl.write.Number(8, 1 + i, Double.parseDouble(String.valueOf(map.get("clf"))), wcfN);
       ws.addCell(labelNF);
       
       
 
	 }
	 ++i;
	 ++i;
	 labelC = new jxl.write.Label(7, 1 + i,  "货币类型：", title4);
    ws.addCell(labelC); 
    labelC = new jxl.write.Label(8, 1 + i,  cgs.getHblx(), title4);
    ws.addCell(labelC); 
    ++i;
    labelC = new jxl.write.Label(7, 1 + i, "修理费率：", title4);
    ws.addCell(labelC); 
    labelNF = new jxl.write.Number(8, 1 + i, cgs.getGsfl(), wcfN);
    ws.addCell(labelNF);
	 wwb.write();
	    wwb.close();
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
