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

import com.cr.service.MyService;

public class Printqtbb extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Printqtbb() {
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
		  response.setHeader("Content-Disposition","attachment; filename=\"qtprint.xls\"");
		  try{
			  ServletContext sc = request.getSession().getServletContext();
	    		WebApplicationContext wc = WebApplicationContextUtils
	            .getWebApplicationContext(sc);
	    MyService myService=(MyService)wc.getBean("myService");
	    OutputStream os = response.getOutputStream();
	    jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(os);
	    jxl.write.WritableSheet ws = wwb.createSheet("其它费用统计报表", 0);
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
	    jxl.write.Label labelC = new jxl.write.Label(0, 0, "其它费用统计报表", title1);
	    ws.addCell(labelC);
	    ws.mergeCells(0, 0, 10, 0);
labelC = new jxl.write.Label(0, 1, "序号", title4);
	    
	    ws.addCell(labelC);
	    ws.setColumnView(0, 10);
	    labelC = new jxl.write.Label(1, 1, "箱号", title4);
	    
	    ws.addCell(labelC);
	    ws.setColumnView(1, 15);
	    labelC = new jxl.write.Label(2, 1, "船公司", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(2, 10);
	    labelC = new jxl.write.Label(3, 1, "尺寸", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(3, 10);
	    labelC = new jxl.write.Label(4, 1, "箱型", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(4, 10);
	    labelC = new jxl.write.Label(5, 1, "进场时间", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(5, 15);
	    
	    labelC = new jxl.write.Label(6, 1, "离场时间", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(6, 15);
	    labelC = new jxl.write.Label(7, 1, "起吊费", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(7, 10);
	 labelC = new jxl.write.Label(8, 1, "拖运费", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(8, 10);
	    labelC = new jxl.write.Label(9, 1, "堆存费", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(9, 10);
	    labelC = new jxl.write.Label(10, 1, "合计", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(10, 10);
	    String var="";
		
	    if(null!=request.getParameter("var")&&request.getParameter("var").length()>0)
	    	var=request.getParameter("var");
	  String sql="";
	  String[] brr=var.split("//");
		for(int i=0;i<brr.length;i++){
			if(i==0)
			{
			if(!brr[i].trim().equals(""))
			sql="'"+brr[i]+"'";
			}
			else
				sql=sql+",'"+brr[i]+"'";	
		}
	 if(sql.length()>0)
		 sql=" where  rcbh in ("+sql+") ";
	    
	    int i = 0;
	 
	  List list=  myService.listvar("select RCBH,XH,CC,XX,CGS,JCRQ,QRRQ,WGRQ,CCRQ,QDF,DCF,TYF,QDF+DCF+TYF hj from t_jcxxx  "+sql+" group by rcbh order by jcrq desc");
	 Iterator it =list.iterator();
	 for(;it.hasNext();){
		 Map map=(Map)it.next();
		 ++i;
		 String jcrq="";
		 if(map.get("JCRQ")!=null)
		jcrq=String.valueOf(map.get("JCRQ")).substring(2,16);
		 
		 String ccrq="";
		 if(map.get("CCRQ")!=null)
		ccrq=String.valueOf(map.get("CCRQ")).substring(2,16);
		 
		 	 labelC = new jxl.write.Label(0, 1 + i, String.valueOf(i), title4);
         ws.addCell(labelC); 
	      labelC = new jxl.write.Label(1, 1 + i, String.valueOf(map.get("XH")), title4);
         ws.addCell(labelC); 
	      labelC = new jxl.write.Label(2, 1 + i, String.valueOf(map.get("CGS")), title4);
         ws.addCell(labelC); 
         labelC = new jxl.write.Label(3, 1 + i, String.valueOf(map.get("CC")), title4);
         ws.addCell(labelC); 
         labelC = new jxl.write.Label(4, 1 + i, String.valueOf(map.get("XX")), title4);
         ws.addCell(labelC); 
         labelC = new jxl.write.Label(5, 1 + i, jcrq, title4);
         ws.addCell(labelC); 
         labelC = new jxl.write.Label(6, 1 + i, ccrq, title4);
         ws.addCell(labelC); 
  
         labelNF = new jxl.write.Number(7, 1 + i, Double.parseDouble(String.valueOf(map.get("QDF"))), wcfN);
         ws.addCell(labelNF);
         labelNF = new jxl.write.Number(8, 1 + i, Double.parseDouble(String.valueOf(map.get("TYF"))), wcfN);
         ws.addCell(labelNF);
         labelNF = new jxl.write.Number(9, 1 + i, Double.parseDouble(String.valueOf(map.get("DCF"))), wcfN);
         ws.addCell(labelNF);
         labelNF = new jxl.write.Number(10, 1 + i, Double.parseDouble(String.valueOf(map.get("hj"))), wcfN);
         ws.addCell(labelNF);
	 }
	i++;

	 list=myService.listvar("select ifnull(sum(qdf+tyf+dcf),0) as hj  from t_jcxxx "+sql);
 
	 it=list.iterator();
	 for(;it.hasNext();){
	Map	 map=(Map)it.next();
		++i;
		  labelC = new jxl.write.Label(9, 1 + i, "合计：", title4);
         ws.addCell(labelC); 
         labelNF = new jxl.write.Number(10, 1 + i, Double.parseDouble(String.valueOf(map.get("hj"))), wcfN);
         ws.addCell(labelNF);
		 
	 }
	 
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
