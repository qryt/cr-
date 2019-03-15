package com.cr.servlet;

import java.io.IOException;
import java.io.OutputStream;
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

import jxl.Workbook;
import jxl.format.PageOrientation;
import jxl.format.PaperSize;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.domain.TJcxxx;
import com.cr.domain.TUser;
import com.cr.service.MyService;

public class ExCscoEDI extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ExCscoEDI () {
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
  DateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmSS");
  String CSCL_CNZJG_WHC_="CSCL_CNZJG_WHC_"+fmt.format(new Date());
  response.setContentType("APPLICATION/OCTET-STREAM; charset=utf-8");
  response.setHeader("Content-Disposition","attachment; filename=\""+CSCL_CNZJG_WHC_+".xls\"");     
  Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
   Object   principal   =   auth.getPrincipal(); 
   String   userId   =   null; 
   if(principal   instanceof   UserDetails){ 
   userId   =   ((UserDetails)principal).getUsername(); 
   }
  try{
	  
	  ServletContext sc = request.getSession().getServletContext();
		WebApplicationContext wc = WebApplicationContextUtils
        .getWebApplicationContext(sc);
MyService myService=(MyService)wc.getBean("myService");
TUser user=myService.loadUserById(userId);
OutputStream os = response.getOutputStream();
jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(os);
jxl.write.WritableSheet ws = wwb.createSheet("EDI报表导出", 0);

ws.setPageSetup(PageOrientation.LANDSCAPE.LANDSCAPE, PaperSize.A4, 0, 0);
WritableFont font1 = new WritableFont(WritableFont.TIMES, 16,
                                      WritableFont.BOLD);
WritableCellFormat title1 = new WritableCellFormat(font1);
title1.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
//小标题的格式
WritableFont font2 = new WritableFont(WritableFont.TIMES, 10,
                                      WritableFont.NO_BOLD);
WritableCellFormat title2 = new WritableCellFormat(font2);
title2.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
title2.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
title2.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框
//次标题的格式
WritableFont font3 = new WritableFont(WritableFont.TIMES, 10,
                                      WritableFont.NO_BOLD);
WritableCellFormat title3 = new WritableCellFormat(font3);
title3.setAlignment(jxl.format.Alignment.LEFT); //水平对齐
title3.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
title3.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框
//表格栏目的格式
WritableFont font4 = new WritableFont(WritableFont.TIMES, 11,
       WritableFont.NO_BOLD);
WritableCellFormat title4 = new WritableCellFormat(font4);
title4.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
title4.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
title4.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框  
title4.setBackground(jxl.format.Colour.GREY_40_PERCENT); //设置颜色
//设置数据类的格式
WritableFont font5 = new WritableFont(WritableFont.TIMES, 12,
                                      WritableFont.NO_BOLD);
WritableFont font6 = new WritableFont(WritableFont.TIMES, 10,
        WritableFont.NO_BOLD);
WritableCellFormat title6 = new WritableCellFormat(font6);
title6.setAlignment(jxl.format.Alignment.RIGHT); //水平对齐
title6.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
title6.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框

jxl.write.Number labelNF=null;
jxl.write.NumberFormat nf = new jxl.write.NumberFormat("0");
jxl.write.WritableCellFormat wcfN = new jxl.write.WritableCellFormat(nf);
jxl.write.NumberFormat nf2 = new jxl.write.NumberFormat("#0.00");
jxl.write.WritableCellFormat wcfN2 = new jxl.write.WritableCellFormat(nf2);
wcfN.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
wcfN2.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
WritableCellFormat cell = new WritableCellFormat(font5);
cell.setAlignment(jxl.format.Alignment.CENTRE); //水平对齐
cell.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE); //垂直对齐
cell.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN); //设置边框


ws.mergeCells(0, 0, 0, 0);
ws.mergeCells(1, 0, 1, 0);
ws.mergeCells(2, 0, 2, 0);
ws.mergeCells(3, 0, 3, 0);
ws.mergeCells(4, 0, 4, 0);
ws.mergeCells(5, 0, 5, 0);
ws.mergeCells(6, 0, 6, 0);
ws.mergeCells(7, 0, 7, 0);
ws.mergeCells(8, 0, 8, 0);
ws.mergeCells(9, 0, 9, 0);
ws.mergeCells(10, 0, 10, 0);
ws.mergeCells(11, 0, 11, 0);
ws.mergeCells(12, 0, 12, 0);
ws.mergeCells(13, 0, 13, 0);
ws.mergeCells(14, 0, 14, 0);
ws.mergeCells(15, 0, 15, 0);
ws.mergeCells(16, 0, 16, 0);
ws.mergeCells(17, 0, 17, 0);
ws.mergeCells(18, 0, 18, 0);
ws.mergeCells(19, 0, 19, 0);
ws.mergeCells(20, 0, 20, 0);
ws.mergeCells(21, 0, 21, 0);
ws.mergeCells(22, 0, 22, 0);
ws.mergeCells(23, 0, 23, 0);
ws.mergeCells(24, 0, 24, 0);
ws.mergeCells(25, 0, 25, 0);
ws.mergeCells(26, 0, 26, 0);
ws.mergeCells(27, 0, 27, 0);
ws.mergeCells(28, 0, 28, 0);
ws.mergeCells(29, 0, 29, 0);
ws.mergeCells(30, 0, 30, 0);
ws.mergeCells(31, 0, 31, 0);
ws.mergeCells(32, 0, 32, 0);
ws.mergeCells(33, 0, 33, 0);
ws.mergeCells(34, 0, 34, 0);
ws.mergeCells(35, 0, 35, 0);
ws.mergeCells(36, 0, 36, 0);
ws.mergeCells(37, 0, 37, 0);

//设置行高
ws.setRowView(0, 400);
ws.setRowView(1, 400);
ws.setRowView(2, 400);
ws.setRowView(3, 400);
ws.setRowView(4, 400);
ws.setRowView(5, 400);
ws.setRowView(6, 400);
ws.setRowView(7, 400);
ws.setRowView(8, 400);
ws.setRowView(9, 400);
ws.setRowView(10, 400);
ws.setRowView(11, 400);
ws.setRowView(12, 400);
ws.setRowView(13, 400);
ws.setRowView(14, 400);
ws.setRowView(15, 400);
ws.setRowView(16, 400);
ws.setRowView(17, 400);
ws.setRowView(18, 400);
ws.setRowView(19, 400);
ws.setRowView(20, 400);
ws.setRowView(21, 400);
ws.setRowView(22, 400);
ws.setRowView(23, 400);
ws.setRowView(24, 400);
ws.setRowView(25, 400);
ws.setRowView(26, 400);
ws.setRowView(27, 400);
ws.setRowView(28, 400);
ws.setRowView(29, 400);
ws.setRowView(30, 400);
ws.setRowView(31, 400);
ws.setRowView(32, 400);
ws.setRowView(33, 400);
ws.setRowView(34, 400);
ws.setRowView(35, 400);
ws.setRowView(36, 400);
ws.setRowView(37, 400);

jxl.write.Label labelC = new jxl.write.Label(0, 0, "EDI Type", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(1, 0, "Company", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(2, 0, "Unit Prefix", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(3, 0, "Unit No", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(4, 0, "Repair Number", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(5, 0, "Client Repair ID", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(6, 0, "Input Date", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(7, 0, "Finish Date", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(8, 0, "Update Level", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(9, 0, "E/F", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(10, 0, "Equipment No", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(11, 0, "Port", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(12, 0, "Depot", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(13, 0, "Equipment Type", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(14, 0, "Purpose", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(15, 0, "Estimated Date", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(16, 0, "Currency", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(17, 0, "CTN TYPE", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(18, 0, "Bl No", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(19, 0, "Remark", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(20, 0, "Damage Part", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(21, 0, "Damage Code", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(22, 0, "Damage Description", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(23, 0, "Repair Code", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(24, 0, "Repair Description", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(25, 0, "Component Type", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(26, 0, "Component Code", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(27, 0, "Component Description", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(28,0, "Length", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(29, 0, "Width", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(30, 0, "Num", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(31, 0, "Man hour O", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(32, 0, "Man Rate O", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(33, 0, "Man Cost O", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(34, 0, "Material Cost O", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(35, 0, "Actual Sum O", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(36, 0, "Payer", title4);
ws.addCell(labelC);

labelC = new jxl.write.Label(37, 0, "Remark", title4);
ws.addCell(labelC);

String xh="";
String var = "";
String SHMX="";
String XLMX="";
if(null!=request.getParameter("var")&&request.getParameter("var").length()>0)
	var=request.getParameter("var");
String[] arr=var.split("//");
int hang=0;
for(int j=0;j<arr.length;j++){
String sqlSelect="select a.xh,a.cc,a.xx,a.bz,date_format(a.jcrq,'%Y-%m-%d') jcrq,a.zgd,b.WZDM,b.SHLX,b.XLFF,b.BJMC,b.C,b.K,b.gs,b.SL,b.GSF,b.CLF,b.FFF from t_jcxxx a,zcgjd2 b where a.RCBH=b.RCBH and a.RCBH='"+arr[j]+"'";
List list= myService.listvar(sqlSelect);
Iterator it=list.iterator();
for(;it.hasNext();){
Map map=(Map)it.next();
hang=hang+1;
labelC = new jxl.write.Label(0, hang, "ES", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(1, hang, "HCNSHACNZJGYJA", title3);
ws.addCell(labelC);
xh=map.get("xh").toString();
labelC = new jxl.write.Label(2, hang,xh.substring(0, 4).toString(), title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(3, hang,xh.substring(4, xh.length()).toString(), title6);
ws.addCell(labelC);
labelC = new jxl.write.Label(4, hang,"", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(5, hang,"", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(6, hang,"", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(7, hang,"", title3);
ws.addCell(labelC);
String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
S =map.get("zgd").toString();
labelC = new jxl.write.Label(8, hang,S.toUpperCase(), title3);
ws.addCell(labelC);              
labelC = new jxl.write.Label(9, hang,"", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(10,hang,"", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(11, hang, "CNZJG", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(12, hang, "WHC", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(13, hang, "U", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(14, hang, "REPAIR", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(15, hang, map.get("jcrq").toString(), title2);
ws.addCell(labelC);
labelC = new jxl.write.Label(16, hang, "USD", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(17, hang, map.get("cc").toString().replace("20’", "20").replace("40’", "40")+map.get("xx").toString(), title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(18, hang,"", title2);
ws.addCell(labelC);
labelC = new jxl.write.Label(19, hang, map.get("bz").toString(), title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(20,hang, map.get("WZDM").toString(), title3);
ws.addCell(labelC);

if(map.get("SHLX").toString().equals("BR"))
	SHMX="BROKEN/SPLIT";
else if(map.get("SHLX").toString().equals("BT"))
	SHMX="BENT";
else if(map.get("SHLX").toString().equals("BW"))
	SHMX="BOWED";
else if(map.get("SHLX").toString().equals("BN"))
	SHMX="BURNED";
else if(map.get("SHLX").toString().equals("CT"))
	SHMX="CONTAMINATED";
else if(map.get("SHLX").toString().equals("CO"))
	SHMX="CORRODED/RUSTED";
else if(map.get("SHLX").toString().equals("CK"))
	SHMX="CRACKED";
else if(map.get("SHLX").toString().equals("CU"))
	SHMX="CUT";
else if(map.get("SHLX").toString().equals("DB"))
	SHMX="DEBRIS/DUNAGE";
else if(map.get("SHLX").toString().equals("DL"))
	SHMX="DELAMINATED";
else if(map.get("SHLX").toString().equals("DT"))
	SHMX="DENT";
else if(map.get("SHLX").toString().equals("DY"))
	SHMX="DIRTY";
else if(map.get("SHLX").toString().equals("ML"))
	SHMX="FOREIGN MARKING(S)";
else if(map.get("SHLX").toString().equals("GD"))
	SHMX="GOUGED";
else if(map.get("SHLX").toString().equals("HO"))
	SHMX="HOLED";
else if(map.get("SHLX").toString().equals("IR"))
	SHMX="IMPROPER";
else if(map.get("SHLX").toString().equals("LO"))
	SHMX="LOOSE COMPONENT";
else if(map.get("SHLX").toString().equals("MS"))
	SHMX="MISSING/LOST COMPONENT";
else if(map.get("SHLX").toString().equals("NL"))
	SHMX="NAILS IN FLOOR";
else if(map.get("SHLX").toString().equals("OD"))
	SHMX="OUT OF INSPECTION DATE";
else if(map.get("SHLX").toString().equals("PF"))
	SHMX="PAINT FAILURE";
else if(map.get("SHLX").toString().equals("GT"))
	SHMX="REMOVE GLUE & TAPE";
else if(map.get("SHLX").toString().equals("RO"))
	SHMX="ROTTED";
else if(map.get("SHLX").toString().equals("SA"))
	SHMX="SCRATCHED/ABRADED";
else if(map.get("SHLX").toString().equals("FZ"))
	SHMX="SEIZED,FROZED";
else if(map.get("SHLX").toString().equals("WT"))
	SHMX="WEAR AND TEAR";
else if(map.get("SHLX").toString().equals("WM"))
	SHMX="WRONG MATERIAL";
else if(map.get("SHLX").toString().equals("OO"))
	SHMX="OVERHEAD OBSTRUCTION";
else if(map.get("SHLX").toString().equals("OU"))
	SHMX="OTHER UNACCEPTABLE REPAIRS";
else if(map.get("SHLX").toString().equals("PD"))
	SHMX="PUSHED DOWN";
else if(map.get("SHLX").toString().equals("OR"))
	SHMX="ODOR";
else if(map.get("SHLX").toString().equals("OL"))
	SHMX="OIL-SATURATED";
else if(map.get("SHLX").toString().equals("ZZ"))
	SHMX="NO DAMAGE CODE";
else if(map.get("SHLX").toString().equals("OS"))
	SHMX="OIL-STAINS";
else if(map.get("SHLX").toString().equals("BK"))
	SHMX="BLOCKED";
else if(map.get("SHLX").toString().equals("BL"))
	SHMX="BLOWOUT";
else if(map.get("SHLX").toString().equals("BO"))
	SHMX="BURNED OUT";
else if(map.get("SHLX").toString().equals("BU"))
	SHMX="BULGED";
else if(map.get("SHLX").toString().equals("CD"))
	SHMX="CONSEQUENTIAL DAMAGE";
else if(map.get("SHLX").toString().equals("CH"))
	SHMX="CORRODED/HOLED";
else if(map.get("SHLX").toString().equals("CW"))
	SHMX="CRACKED WELD";
else if(map.get("SHLX").toString().equals("DH"))
	SHMX="DENTED AND HOLED";
else if(map.get("SHLX").toString().equals("GO"))
	SHMX="GRP SURFACE CRACK";
else if(map.get("SHLX").toString().equals("GP"))
	SHMX="GRP SURFACE AND PLYWOOD CRACK";
else if(map.get("SHLX").toString().equals("PH"))
	SHMX="PAINT FAILURE";
else if(map.get("SHLX").toString().equals("PI"))
	SHMX="PIN HOLES";
else if(map.get("SHLX").toString().equals("PM"))
	SHMX="PREVENTATIVE MAINTENANCE";
else if(map.get("SHLX").toString().equals("RA"))
	SHMX="REMOVE FOR ACCESS";
else if(map.get("SHLX").toString().equals("RC"))
	SHMX="CONVERSION REQUIRED";
else if(map.get("SHLX").toString().equals("RD"))
	SHMX="ROLLOVER DAMAGE";
else if(map.get("SHLX").toString().equals("RF"))
	SHMX="RUN FLAT";
else if(map.get("SHLX").toString().equals("RP"))
	SHMX="REFURBISHMENT PROGRAM";
else if(map.get("SHLX").toString().equals("SH"))
	SHMX="SHORT/OPEN CIRCUIT";
else if(map.get("SHLX").toString().equals("SP"))
	SHMX="SEPARATED";
else if(map.get("SHLX").toString().equals("SR"))
	SHMX="SHRUNK";
else if(map.get("SHLX").toString().equals("ST"))
	SHMX="SATURATED/WET";
else if(map.get("SHLX").toString().equals("SW"))
	SHMX="SWITCHED";
else if(map.get("SHLX").toString().equals("TR"))
	SHMX="TEST REQUIRED";
else if(map.get("SHLX").toString().equals("TS"))
	SHMX="CASING/TREAD";
else if(map.get("SHLX").toString().equals("TU"))
	SHMX="UNEVEN TREAD";
else if(map.get("SHLX").toString().equals("UI"))
	SHMX="UNDER-INFLATED";
else if(map.get("SHLX").toString().equals("WA"))
	SHMX="WARPED";
else if(map.get("SHLX").toString().equals("WB"))
	SHMX="BALD";
else if(map.get("SHLX").toString().equals("WH"))
	SHMX="WET HIDES";
else if(map.get("SHLX").toString().equals("WN"))
	SHMX="WORN";
else if(map.get("SHLX").toString().equals("WV"))
	SHMX="WEATHERED AND UNUSABLE";
else if(map.get("SHLX").toString().equals("IE"))
	SHMX="INADEQUATE ELECTRICAL RESISTANCE";
else if(map.get("SHLX").toString().equals("IC"))
	SHMX="IMPROPER CLEANING";
else if(map.get("SHLX").toString().equals("IN"))
	SHMX="NEW IMPROPER REPAIR";
else if(map.get("SHLX").toString().equals("IO"))
	SHMX="OLD IMPROPER REPAIR";
else if(map.get("SHLX").toString().equals("IP"))
	SHMX="IMPLODED";
else if(map.get("SHLX").toString().equals("LF"))
	SHMX="LOW FLUID LEVEL";
else if(map.get("SHLX").toString().equals("LK"))
	SHMX="LEAK";
else if(map.get("SHLX").toString().equals("MA"))
	SHMX="MISALIGNED";
else if(map.get("SHLX").toString().equals("ME"))
	SHMX="EXISTING MANUFACTURING DEFECT";
else if(map.get("SHLX").toString().equals("MF"))
	SHMX="MOTOR FAILURE";
else if(map.get("SHLX").toString().equals("MM"))
	SHMX="MISMATCH";
else if(map.get("SHLX").toString().equals("MN"))
	SHMX="NEW MANUFACTURING DEFECT";
else if(map.get("SHLX").toString().equals("NI"))
	SHMX="NOT WITHIN ISO DIMENSIONS";
else if(map.get("SHLX").toString().equals("NO"))
	SHMX="NOT AS REQUIRED BY OWNER";
else if(map.get("SHLX").toString().equals("NP"))
	SHMX="NOT IN PLACE";
else if(map.get("SHLX").toString().equals("NT"))
	SHMX="NOT TO TIR REQUIREMENTS";
else if(map.get("SHLX").toString().equals("OC"))
	SHMX="OUT OF CALIBRATION";
else if(map.get("SHLX").toString().equals("OH"))
	SHMX="OVERHEATING";
else if(map.get("SHLX").toString().equals("OI"))
	SHMX="OVER-INFLATED";
else if(map.get("SHLX").toString().equals("FL"))
	SHMX="FLOOR REFURBISHMENT PROGRAM";
else if(map.get("SHLX").toString().equals("IS"))
	SHMX="INSERT(PATCH) WITH STRAIGHTEN ADJACENT PANELS";

labelC = new jxl.write.Label(21, hang, map.get("SHLX").toString(), title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(22, hang,SHMX, title2);
ws.addCell(labelC);

 if(map.get("XLFF").toString().equals("FR"))
	XLMX="FREE SEIZED COMPONENT(S)";
else if(map.get("XLFF").toString().equals("DO"))
	XLMX="DEODORIZE";
else if(map.get("XLFF").toString().equals("XW"))
	XLMX="GRIND AND WELD";
else if(map.get("XLFF").toString().equals("IT"))
	XLMX="INSERT";
else if(map.get("XLFF").toString().equals("IN"))
	XLMX="INSTALL";
else if(map.get("XLFF").toString().equals("LC"))
	XLMX="LUBRICATE";
else if(map.get("XLFF").toString().equals("PA"))
	XLMX="PAINT";
else if(map.get("XLFF").toString().equals("PR"))
	XLMX="PARTIAL REFURBISHMENT";
else if(map.get("XLFF").toString().equals("PT"))
	XLMX="PATCH";
else if(map.get("XLFF").toString().equals("VM"))
	XLMX="PREVENTIVE MAINTENANCE";
else if(map.get("XLFF").toString().equals("RC"))
	XLMX="RECONDITION/REFURBISH";
else if(map.get("XLFF").toString().equals("FT"))
	XLMX="REFIT";
else if(map.get("XLFF").toString().equals("RR"))
	XLMX="REMOVE AND REINSTALL OR REFIT";
else if(map.get("XLFF").toString().equals("RP"))
	XLMX="REMOVE AND REPLACE COMPONENT(S)";
else if(map.get("XLFF").toString().equals("RM"))
	XLMX="REMOVE COMPONENT (WITHOUT REPLACEMENT)";
else if(map.get("XLFF").toString().equals("GT"))
	XLMX="REMOVE GLUE AND/OR TAPE";
else if(map.get("XLFF").toString().equals("MV"))
	XLMX="REMOVE MARKS/NAILS";
else if(map.get("XLFF").toString().equals("RE"))
	XLMX="RESECURE";
else if(map.get("XLFF").toString().equals("SD"))
	XLMX="SAND";
else if(map.get("XLFF").toString().equals("SE"))
	XLMX="SEAL OR RESEAL/CAULK OR RECAULK";
else if(map.get("XLFF").toString().equals("SN"))
	XLMX="SECTION";
else if(map.get("XLFF").toString().equals("SC"))
	XLMX="STEAM CLEAN";
else if(map.get("XLFF").toString().equals("GS"))
	XLMX="STRAIGHTEN";
else if(map.get("XLFF").toString().equals("RS"))
	XLMX="STRAIGHTEN AND SECURE COMPONENT(S)";
else if(map.get("XLFF").toString().equals("GW"))
	XLMX="STRAIGHTEN AND WELD";
else if(map.get("XLFF").toString().equals("PS"))
	XLMX="SURFACE PREPARATION (GRIND) AND PAINT";
else if(map.get("XLFF").toString().equals("WP"))
	XLMX="SWEEP";
else if(map.get("XLFF").toString().equals("WW"))
	XLMX="WATER WASH";
else if(map.get("XLFF").toString().equals("WD"))
	XLMX="WELD";
else if(map.get("XLFF").toString().equals("IP"))
	XLMX="INSPECT AND REPORT";
else if(map.get("XLFF").toString().equals("MD"))
	XLMX="MODIFICATIONS MISCELLANEOUS";
else if(map.get("XLFF").toString().equals("MK"))
	XLMX="RE-MARK";
else if(map.get("XLFF").toString().equals("NA"))
	XLMX="NO ACTION NECESSARY";
else if(map.get("XLFF").toString().equals("OX"))
	XLMX="OVERIAY";
else if(map.get("XLFF").toString().equals("PC"))
	XLMX="POLISH CLEAN";
else if(map.get("XLFF").toString().equals("PI"))
	XLMX="PRE-TRIP INSPECTION";
else if(map.get("XLFF").toString().equals("PV"))
	XLMX="PEPAIRS PRIOR TO REFURBISHMENT";
else if(map.get("XLFF").toString().equals("PX"))
	XLMX="PATCH AND FOAM";
else if(map.get("XLFF").toString().equals("RA"))
	XLMX="RE-ALIGN";
else if(map.get("XLFF").toString().equals("RB"))
	XLMX="REBUILD";
else if(map.get("XLFF").toString().equals("RG"))
	XLMX="RE-GLASS";
else if(map.get("XLFF").toString().equals("RW"))
	XLMX="REWIRE";
else if(map.get("XLFF").toString().equals("SF"))
	XLMX="SECTION AND FOAM";
else if(map.get("XLFF").toString().equals("AC"))
	XLMX="AIR CLEAN";
else if(map.get("XLFF").toString().equals("AJ"))
	XLMX="ADJUST";
else if(map.get("XLFF").toString().equals("BX"))
	XLMX="FIT BY M&R STOCK";
else if(map.get("XLFF").toString().equals("CH"))
	XLMX="RECHARGE";
else if(map.get("XLFF").toString().equals("SP"))
	XLMX="SPECIAL REPAIR NECESSARY";
else if(map.get("XLFF").toString().equals("DC"))
	XLMX="DISMANTLE AND CLEAN";
else if(map.get("XLFF").toString().equals("SR"))
	XLMX="RESEAL";
else if(map.get("XLFF").toString().equals("DF"))
	XLMX="DRAIN AND FILL";
else if(map.get("XLFF").toString().equals("TB"))
	XLMX="TECHNICAL BULLETIN";
else if(map.get("XLFF").toString().equals("DR"))
	XLMX="DRAIN";
else if(map.get("XLFF").toString().equals("DU"))
	XLMX="DRY OUT";
else if(map.get("XLFF").toString().equals("TC"))
	XLMX="TEST/CALIBRATE";
else if(map.get("XLFF").toString().equals("TP"))
	XLMX="TOP UP";
else if(map.get("XLFF").toString().equals("EX"))
	XLMX="FIT PART EX OWNERS STOCK";
else if(map.get("XLFF").toString().equals("TR"))
	XLMX="TEMPORARY";
else if(map.get("XLFF").toString().equals("FL"))
	XLMX="GRIND FLOOR";
else if(map.get("XLFF").toString().equals("HN"))
	XLMX="HANDLING REQUIRED";
else if(map.get("XLFF").toString().equals("ZZ"))
	XLMX="NOT APPLICABLE";
else if(map.get("XLFF").toString().equals("AB"))
	XLMX="ABRASIVE CLEAN AND PAINT";
else if(map.get("XLFF").toString().equals("CC"))
	XLMX="CHEMICAL CLEAN";
else if(map.get("XLFF").toString().equals("RF"))
	XLMX="REPLACE FILMS";
else if(map.get("XLFF").toString().equals("IS"))
	XLMX="INSERT(PATCH) COMBINATION WITH STRAIGHTEN ADJACENT...";
else if(map.get("XLFF").toString().equals("VU"))
	XLMX="VACUUMIZE";
else if(map.get("XLFF").toString().equals("FM"))
	XLMX="FORM";
else if(map.get("XLFF").toString().equals("CL"))
	XLMX="CHECK LEAKAGE";
else if(map.get("XLFF").toString().equals("LT"))
	XLMX="LIFTING/TRUCKING";
else if(map.get("XLFF").toString().equals("H1"))
	XLMX="HANGERTAINER(SINGLE BAR)";
else if(map.get("XLFF").toString().equals("H2"))
	XLMX="HANGERTAINER(DOUBLE BARS)";
labelC = new jxl.write.Label(23, hang, map.get("XLFF").toString(), title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(24, hang,XLMX, title2);
ws.addCell(labelC);
labelC = new jxl.write.Label(25, hang,"DB", title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(26, hang, map.get("bjmc").toString(), title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(27, hang,"", title3);
ws.addCell(labelC);
labelNF = new jxl.write.Number(28, hang,new BigDecimal(map.get("c").toString()).doubleValue(), wcfN);
ws.addCell(labelNF);
labelNF = new jxl.write.Number(29, hang,new BigDecimal(map.get("k").toString()).doubleValue(), wcfN);
ws.addCell(labelNF);
labelNF = new jxl.write.Number(30, hang,new BigDecimal(map.get("sl").toString()).doubleValue(), wcfN);
ws.addCell(labelNF);
labelNF = new jxl.write.Number(31, hang,new BigDecimal(map.get("gs").toString()).doubleValue(), wcfN2); 
ws.addCell(labelNF);
labelNF = new jxl.write.Number(32, hang,3.85, wcfN2); 
ws.addCell(labelNF);
labelNF = new jxl.write.Number(33, hang,new BigDecimal(map.get("gsf").toString()).doubleValue(), wcfN2);
ws.addCell(labelNF);
labelNF = new jxl.write.Number(34, hang,new BigDecimal(map.get("clf").toString()).doubleValue(), wcfN2);
ws.addCell(labelNF);
Double feehj= Double.parseDouble(map.get("gsf").toString())+Double.parseDouble(map.get("clf").toString());

labelNF = new jxl.write.Number(35,hang,new BigDecimal(feehj.toString()).doubleValue(), wcfN2);
ws.addCell(labelNF);
labelC = new jxl.write.Label(36, hang, map.get("fff").toString(), title3);
ws.addCell(labelC);
labelC = new jxl.write.Label(37, hang,"", title2);
ws.addCell(labelC);
}}
ws.setColumnView(0, 18);
ws.setColumnView(1, 18);
ws.setColumnView(2, 16);
ws.setColumnView(3, 16);
ws.setColumnView(4, 16);
ws.setColumnView(5, 16);
ws.setColumnView(6, 16);
ws.setColumnView(7, 16);
ws.setColumnView(8, 16);
ws.setColumnView(9, 16);
ws.setColumnView(10, 16);
ws.setColumnView(11, 16);
ws.setColumnView(12, 16);
ws.setColumnView(13, 16);
ws.setColumnView(14, 16);
ws.setColumnView(15, 16);
ws.setColumnView(16, 16);
ws.setColumnView(17, 16);
ws.setColumnView(18, 16);
ws.setColumnView(19, 16);
ws.setColumnView(20, 16);
ws.setColumnView(21, 16);
ws.setColumnView(22, 22);
ws.setColumnView(23, 16);
ws.setColumnView(24, 22);
ws.setColumnView(25, 16);
ws.setColumnView(26, 16);
ws.setColumnView(27, 16);
ws.setColumnView(28, 16);
ws.setColumnView(29, 16);
ws.setColumnView(30, 16);
ws.setColumnView(31, 16);
ws.setColumnView(32, 16);
ws.setColumnView(33, 16);
ws.setColumnView(34, 16);
ws.setColumnView(35, 16);
ws.setColumnView(36, 16);
ws.setColumnView(37, 16);

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
