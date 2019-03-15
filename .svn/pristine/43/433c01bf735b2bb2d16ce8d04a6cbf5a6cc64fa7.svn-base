package com.cr.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

import com.cr.domain.TUser;
import com.cr.service.MyService;

public class Printtdbb extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Printtdbb() {
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

		  response.setContentType("APPLICATION/OCTET-STREAM; charset=utf-8");
		  response.setHeader("Content-Disposition","attachment; filename=\"print.xls\"");
		  DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");         
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
	    jxl.write.WritableSheet ws = wwb.createSheet("提单统计报表", 0);
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
	    jxl.write.Label labelC = new jxl.write.Label(0, 0, "永嘉集装箱提单报表", title1);
	    ws.addCell(labelC);
	    ws.mergeCells(0, 0, 6, 0);
labelC = new jxl.write.Label(0, 1, "序号", title4);
	    
	    ws.addCell(labelC);
	    ws.setColumnView(0, 10);
 
	    labelC = new jxl.write.Label(1, 1, "箱公司", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(1, 10);
	    labelC = new jxl.write.Label(2, 1, "箱主", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(2, 10);
	     
	    labelC = new jxl.write.Label(3, 1, "提单号", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(3, 15);
	    
	    labelC = new jxl.write.Label(4, 1, "进场时间", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(4, 15);
	    labelC = new jxl.write.Label(5, 1, "发送时间", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(5, 15);
	     
	    labelC = new jxl.write.Label(6, 1, "合计", title4);
	    ws.addCell(labelC);
	    ws.setColumnView(6, 10);
	    
	    String sqlplus="";
	    String sql="";
	    String chk = request.getParameter("ck");
	    String var="";
	     String condition=request.getParameter("condition");
String start_date=request.getParameter("start_date");
String end_date=request.getParameter("end_date");
	    if(null!=request.getParameter("var")&&request.getParameter("var").length()>0)
	    	var=request.getParameter("var");
	    String[] arr=chk.split(",");
	    
	    
		for(int i=0;i<arr.length;i++){
			if(i==0)
			{
			if(!arr[i].trim().equals(""))
			sqlplus="fff='"+arr[i]+"'";
			}
			else
				sqlplus=sqlplus+" or fff='"+arr[i]+"'";	
		}
		if(sqlplus.length()>0)
			sqlplus=" ("+sqlplus+")";
		String[] brr=var.split("//");
		if(var.trim().equals("")){
		
			 String str="";
			 if(user.getJsmc().indexOf("高级用户")==-1)
			    	str= " box_owner=='"+user.getZh().toUpperCase()+"'";	
	 
	//if(sql.equals(""))
			 //如果condition为空，可以取所有记录，不用where来实现
		    
		 
		   
		   }
		
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
		 sql="  a.rcbh in ("+sql+") ";
	    int i = 0;
	    int j=0;
	    String str="";
	    if(user.getJsmc().indexOf("高级用户")==-1)
	    	str= "  box_owner='"+user.getZh().toUpperCase()+"'";	
if(str.length()>0){
	if(sql.length()>0)
		sql=sql;
	else
		sql=str;
	
}else{
	if(sql.length()>0)
		sql=sql;
	else
		sql="";
}


if(sql.length()>0)
	sqlplus=" and "+sqlplus;
if(condition.trim().length()>0)
	condition=" and "+condition;
	//  List list=  myService.listvar(" select a.rcbh,ifnull((datediff(a.ccrq,a.jcrq)+1),(datediff(curdate(),a.jcrq)+1)) as ts,a.cgs,a.xh,a.cc,a.xx,a.xxl,a.jczt,a.tyf,a.dcf,a.qdf,a.zzrq,a.jctc,a.tdh,a.lxd,a.jcwz,a.wzmx,a.eirlsh,a.zgd,a.zdbh,a.sfbf,ifnull(a.zygr,'') zygr,a.jcrq,a.qrrq,a.wgrq,a.ccrq,a.jzrq,a.llr,a.llrq,ifnull(b.gs,0) gs,ifnull(b.gsf,0) gsf,ifnull(b.clf,0) clf,ifnull(b.hj,0) hj,c.fllx,c.hblx,c.xz from (select * from t_jcxxx "+str+") a left join (select rcbh, ifnull(sum(gs),0) as gs,ifnull(sum(gsf),0) as gsf,ifnull(sum(clf),0) as clf,ifnull(sum(gsf+clf),0) as hj from v_gjd where "+sqlplus+" group by rcbh) b on a.rcbh=b.rcbh left join t_cgsxx c  on c.gsdm=a.cgs   "+sql+" order by rcbh desc ");
List list=myService.listvar("select    cgs,tdh,   ifnull(DATE_FORMAT(min(jcrq),'%y-%m-%d %H:%i'),'') jcrq,ifnull(DATE_FORMAT(min(fsrq),'%y-%m-%d %H:%i'),'') fsrq ,ifnull(sum(hj),0) hj, box_owner from  t_jcxxx a    left join  t_sum b on a.rcbh=b.rcbh  where "+sql+sqlplus+condition+" and jcrq>='"+start_date+"' and jcrq<'"+end_date+"' group by tdh,cgs,box_owner    order by a.tdh desc");
//	System.out.println("select a.rcbh,bz,ifnull((datediff(ccrq,jcrq)+1),(datediff(curdate(),jcrq)+1)) as ts,cgs,xh,cc,xx,xxl,jczt,tyf,dcf,qdf,zzrq,jctc,tdh,lxd,jcwz,wzmx,eirlsh,zgd,zdbh,sfbf,ifnull(zygr,'') zygr,ifnull(DATE_FORMAT(jcrq,'%y-%m-%d %H:%i'),'') jcrq, ifnull(DATE_FORMAT(qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(llrq,'%y-%m-%d %H:%i'),'') llrq,  ifnull(sum(gs),0) gs,  ifnull(sum(gsf),0) gsf,  ifnull(sum(clf),0) clf,ifnull(sum(hj),0) hj,fl_type,cur_type,box_owner from  t_jcxxx a    left join  t_sum b on a.rcbh=b.rcbh  where "+sql+sqlplus+condition+" and jcrq>='"+start_date+"' and jcrq<'"+end_date+"' group by a.rcbh    order by a.rcbh desc");
 //System.out.println("select a.rcbh,a.bz,ifnull((datediff(a.ccrq,a.jcrq)+1),(datediff(curdate(),a.jcrq)+1)) as ts,a.cgs,a.xh,a.cc,a.xx,a.xxl,a.jczt,a.tyf,a.dcf,a.qdf,a.zzrq,a.jctc,a.tdh,a.lxd,a.jcwz,a.wzmx,a.eirlsh,a.zgd,a.zdbh,a.sfbf,ifnull(a.zygr,'') zygr,ifnull(DATE_FORMAT(a.jcrq,'%y-%m-%d %H:%i'),'') jcrq, ifnull(DATE_FORMAT(a.qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(a.wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(a.ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(a.jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(a.llrq,'%y-%m-%d %H:%i'),'') llrq,ifnull(sum(b.xs),0)+ifnull(sum(d.gs),0) gs,ifnull(sum(b.gsf),0)+ifnull(sum(d.gsf),0) gsf,ifnull(sum(b.clf),0)+ifnull(sum(d.clf),0) clf,ifnull(sum(b.gsf+b.clf),0)+ifnull(sum(d.gsf+d.clf),0) hj,a.fllx,a.hblx,a.xz from (select * from t_jcxxx a left join t_cgsxx c  on c.gsdm=a.cgs  "+sql+"  ) a    left join   (select rcbh,xs,gsf,clf  from  t_zcgjd where "+sqlplus+") b on b.rcbh=a.rcbh left join (select gs,gsf,clf,rcbh from zcgjd2 where "+sqlplus+") d on d.rcbh=a.rcbh   group by a.rcbh    order by a.rcbh desc");
Iterator it =list.iterator();
	 for(;it.hasNext();){
		 Map map=(Map)it.next();
		 ++i;
		/* String jcrq="";
		 String ccrq="";
		 String qrrq="";
		 String jzrq="";
		 String wgrq=""; 
		 String lrrq="";
		 
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
			 */
					labelC = new jxl.write.Label(0, 1 + i, String.valueOf(i), title4);
         ws.addCell(labelC); 
         
         labelC = new jxl.write.Label(1, 1 + i, String.valueOf(map.get("cgs")), title4);
         ws.addCell(labelC); 
         labelC = new jxl.write.Label(2, 1 + i, String.valueOf(map.get("box_owner")), title4);
         ws.addCell(labelC); 
	      

         
         labelC = new jxl.write.Label(3, 1 + i, String.valueOf(map.get("tdh")), title4);
 ws.addCell(labelC); 
    
         labelC = new jxl.write.Label(4, 1 + i, String.valueOf(map.get("jcrq")), title4);
         ws.addCell(labelC); 
         labelC = new jxl.write.Label(5, 1 + i, String.valueOf(map.get("fsrq")), title4);
         ws.addCell(labelC); 
        
         labelNF = new jxl.write.Number(6, 1 + i, new BigDecimal(String.valueOf(map.get("hj"))).doubleValue(), wcfN);
         ws.addCell(labelNF);
          
	 }
	 i++;
j=i;
list=myService.listvar("select fff, gs, gsf, clf, hj from (select fff, ifnull(sum(gs),0) gs,ifnull(sum(gsf),0) gsf,ifnull(sum(clf),0) clf,sum(ifnull(hj,0)*100)/100 hj  from  t_jcxxx a    left join  t_sum b on a.rcbh=b.rcbh    where "+sql+sqlplus+condition+" and jcrq>='"+start_date+"' and jcrq<'"+end_date+"'   group by fff) a  order by fff asc"); 
//System.out.println("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf+clf) hj from (select fff,rcbh,xs as gs,gsf,clf from t_zcgjd "+sql+"  and  (fff='C' or fff='U' or fff='O' or fff='W')   union all select fff,rcbh,gs,gsf,clf from zcgjd2 "+sql+" and  (fff='C' or fff='U' or fff='O' or fff='W') ) a group by fff");
it=list.iterator();
	 for(;it.hasNext();){
	Map	 map=(Map)it.next();
		++i;
		  labelC = new jxl.write.Label(2, 1 + i,  String.valueOf(map.get("fff")), title4);
        ws.addCell(labelC); 
        labelNF = new jxl.write.Number(3, 1 + i, new BigDecimal(String.valueOf(map.get("gs"))).doubleValue(), wcfN);
        ws.addCell(labelNF);
        labelNF = new jxl.write.Number(4, 1 + i, new BigDecimal(String.valueOf(map.get("gsf"))).doubleValue(), wcfN);
        ws.addCell(labelNF);
        labelNF = new jxl.write.Number(5, 1 + i, new BigDecimal(String.valueOf(map.get("clf"))).doubleValue(), wcfN);
        ws.addCell(labelNF);
        labelNF = new jxl.write.Number(6, 1 + i, new BigDecimal(String.valueOf(map.get("hj"))).doubleValue(), wcfN);
        ws.addCell(labelNF);
		 
	 }
 
		 
	list=myService.listvar("select  ifnull(sum(hj*100)/100,0) hj from  t_jcxxx a    left join  t_sum b on a.rcbh=b.rcbh  where "+sql+sqlplus+condition+" and jcrq>='"+start_date+"' and jcrq<'"+end_date+"'   ");

	it=list.iterator();
	 for(;it.hasNext();){
	Map	 map=(Map)it.next();
		++i;
		  labelC = new jxl.write.Label(5, 1 + i, "合计：", title4);
      
         ws.addCell(labelC); 
        
         
         labelNF = new jxl.write.Number(6, 1 + i, new BigDecimal(String.valueOf(map.get("hj"))).doubleValue(), wcfN);
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
