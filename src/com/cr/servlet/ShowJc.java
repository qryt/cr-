package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cr.domain.TUser;
import com.cr.service.MyService;

public class ShowJc extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowJc() {
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
		 Authentication   auth   =   SecurityContextHolder.getContext().getAuthentication(); 
		   Object   principal   =   auth.getPrincipal(); 
		   String   userId   =   null; 
		   if(principal   instanceof   UserDetails){ 
		   userId   =   ((UserDetails)principal).getUsername(); 
		   }else
			   userId="yu";
		  
		ServletContext sc = request.getSession().getServletContext();
		WebApplicationContext wc = WebApplicationContextUtils.getWebApplicationContext(sc);
MyService myService=(MyService)wc.getBean("myService");
TUser user=myService.loadUserById(userId);
String date_start=request.getParameter("date_start");
String date_end=request.getParameter("date_end");
String start = request.getParameter("start"); 
String limit = request.getParameter("limit");
DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
/*String jcrq="";
String ccrq="";
String qrrq="";
String jzrq="";
String wgrq=""; 
String lrrq="";*/
String re="";
String sort=request.getParameter("sort");
String dir=request.getParameter("dir");
int index = Integer.parseInt(start); 
int pageSize = Integer.parseInt(limit);
String condition=request.getParameter("sql");
String sql=condition;
//System.out.println(sort);
StringBuffer data=new StringBuffer("({\"totalProperty\":\"0\",\"root\":[]})");
if(null!=sort&&null!=dir){
if(null!=request.getParameter("sql")&&!request.getParameter("sql").trim().equals(""))
{ 
if(user.getJsmc().indexOf("客户")>-1){
	if(null!=user.getQxfw()&&!user.getQxfw().trim().equals("")){
	String arr[]=user.getQxfw().split(",");
	String qxfw="";
	for(int i=0;i<arr.length-1;i++)
	{ qxfw+="'"+arr[i]+"',";
		
	}
	qxfw+="'"+arr[arr.length-1]+"'";
		sql+=" and box_owner in ("+qxfw+")";	
		}
	else
		sql+=" and box_owner is null";
	}
}else
{
	if(user.getJsmc().indexOf("客户")>-1)
	{	if(null!=user.getQxfw()&&!user.getQxfw().trim().equals(""))
		{String arr[]=user.getQxfw().split(",");
	String qxfw="";
	for(int i=0;i<arr.length-1;i++)
	{ qxfw+="'"+arr[i]+"',";
		
	}
	qxfw+="'"+arr[arr.length-1]+"'";
		sql=" box_owner in ("+qxfw+")";	
		}else
			sql=" box_owner is null";
	
	}
}
if (sql.trim().length()>0)
sql+=" and jcrq >'"+date_start+"' and jcrq<='"+date_end+"'";
else
sql="   jcrq >'"+date_start+"' and jcrq<='"+date_end+"'";
if(sql.length()>0)
	sql=" where "+sql;
String sqlSelect="";
if(sql.indexOf("fff")>-1)
	sqlSelect="select  a.rcbh,bz,ifnull((datediff(ccrq,jcrq)+1),(datediff(curdate(),jcrq)+1)) as ts,cgs,xh,cc,xx,xxl,jczt,tyf,dcf,qdf,zzrq,jctc,tdh,lxd,jcwz,wzmx,eirlsh,zgd,zdbh,sfbf,ifnull(zygr,'') zygr,ifnull(DATE_FORMAT(jcrq,'%y-%m-%d %H:%i'),'') jcrq,ifnull(DATE_FORMAT(edirq,'%y-%m-%d %H:%i'),'') edirq,ifnull(DATE_FORMAT(fsrq,'%y-%m-%d %H:%i'),'') fsrq, ifnull(DATE_FORMAT(qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(llrq,'%y-%m-%d %H:%i'),'') llrq,  ifnull(gs,0) gs,  ifnull(gsf,0) gsf,  ifnull(clf,0) clf,ifnull(hj,0) hj,fl_type,cur_type,box_owner from t_jcxxx a left join (select rcbh, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj  from t_sum where rcbh>=date_format('"+date_start+"','%y%m00001') and rcbh<=date_format('"+date_end+"','%y%m99999') group by rcbh) b on a.rcbh=b.rcbh " +sql+"  order by "+ sort+" "+dir +" limit "+start+","+limit ;

else
		sqlSelect="select  a.rcbh,bz,ifnull((datediff(ccrq,jcrq)+1),(datediff(curdate(),jcrq)+1)) as ts,cgs,xh,cc,xx,xxl,jczt,tyf,dcf,qdf,zzrq,jctc,tdh,lxd,jcwz,wzmx,eirlsh,zgd,zdbh,sfbf,ifnull(zygr,'') zygr,ifnull(DATE_FORMAT(jcrq,'%y-%m-%d %H:%i'),'') jcrq,ifnull(DATE_FORMAT(edirq,'%y-%m-%d %H:%i'),'') edirq,ifnull(DATE_FORMAT(fsrq,'%y-%m-%d %H:%i'),'') fsrq, ifnull(DATE_FORMAT(qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(llrq,'%y-%m-%d %H:%i'),'') llrq,  ifnull(gs,0) gs,  ifnull(gsf,0) gsf,  ifnull(clf,0) clf,ifnull(hj,0) hj,fl_type,cur_type,box_owner from (select * from t_jcxxx "+sql+"  order by "+ sort+" "+dir +" limit "+start+","+limit+") a left join (select rcbh, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj  from t_sum where rcbh>=date_format('"+date_start+"','%y%m00001') and rcbh<=date_format('"+date_end+"','%y%m99999') group by rcbh) b on a.rcbh=b.rcbh "  ;
 
List list=myService.listvar(sqlSelect);
long sl=myService.sumJc(sql);
String cb = request.getParameter("callback");
 data =new StringBuffer(cb+"({\"totalProperty\":\""+sl+"\",\"root\":["); 
DecimalFormat decimalFormat = new DecimalFormat("#####0.00");
DecimalFormat intFormat = new DecimalFormat("#####0");
Iterator it=list.iterator();
for(;it.hasNext();){
	Map map=(Map)it.next();


			list=myService.listFpdcByRcbh(map.get("rcbh").toString());
			Iterator it1=list.iterator();
			re="";
			for(;it1.hasNext();){
				Map map1=(Map)it1.next();
			re=re+map1.get("zzrq").toString().substring(2,16)+","+decimalFormat.format(map1.get("dcfl"))+";";
			}

	if(null!=map.get("fl_type")&&map.get("fl_type").toString().equals("2"))
		data.append("{fl_type : '"+map.get("fl_type")+"', rcbh : '"+map.get("rcbh")+"',cgs : '"+map.get("cgs")+"',box_owner : '"+map.get("box_owner")+"' , xh : '"+map.get("xh")+"' , cc : '"+map.get("cc")+"', xx: '"+map.get("xx")+"',xxl: '"+map.get("xxl")+"',jczt: '"+map.get("jczt")+"',tdh: '"+map.get("tdh")+"', zzrq : '"+map.get("zzrq")+"',  jctc : '"+map.get("jctc")+"', lxd : '"+map.get("lxd")+"', jcwz : '"+map.get("jcwz")+"', wzmx : '"+map.get("wzmx")+"', eirlsh : '"+map.get("eirlsh")+"', zgd : '"+map.get("zgd")+"', sfbf : '"+map.get("sfbf")+"', zygr : '"+map.get("zygr")+"', zdbh : '"+map.get("zdbh")+"', jcrq : '"+map.get("jcrq")+"', fsrq : '"+map.get("fsrq")+"', qrrq : '"+map.get("qrrq")+"', wgrq : '"+map.get("wgrq")+"', ccrq : '"+map.get("ccrq")+"', jzrq : '"+map.get("jzrq")+"',edirq : '"+map.get("edirq")+"', qdf : '"+decimalFormat.format(Double.parseDouble(map.get("qdf").toString()))+"', tyf : '"+decimalFormat.format(Double.parseDouble(map.get("tyf").toString()))+"', dcf : '"+decimalFormat.format(Double.parseDouble(map.get("dcf").toString()))+"', ts : '"+intFormat.format(Double.parseDouble(map.get("ts").toString()))+"', gs : '"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+"', gsf : '"+decimalFormat.format(Double.parseDouble(map.get("gsf").toString()))+"', clf : '"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"', hj : '"+decimalFormat.format(Double.parseDouble(map.get("hj").toString()))+"', hblx : '"+map.get("hblx")+"', llr : '"+map.get("llr")+"', llrq : '"+map.get("llrq") +"', tpxz : '<img src=images/icon_grid_menu.gif style=\"cursor:hand\" onclick=down(\""+map.get("xh")+".zip\")>',bz : '"+map.get("bz")+"', re : '"+re+"'},");

		else
			data.append("{fl_type : '"+map.get("fl_type")+"', rcbh: '"+map.get("rcbh")+"',cgs : '"+map.get("cgs")+"',box_owner : '"+map.get("box_owner")+"' , xh : '"+map.get("xh")+"' , cc : '"+map.get("cc")+"', xx: '"+map.get("xx")+"',xxl: '"+map.get("xxl")+"',jczt: '"+map.get("jczt")+"',tdh: '"+map.get("tdh")+"', zzrq : '"+map.get("zzrq")+"',  jctc : '"+map.get("jctc")+"', lxd : '"+map.get("lxd")+"', jcwz : '"+map.get("jcwz")+"', wzmx : '"+map.get("wzmx")+"', eirlsh : '"+map.get("eirlsh")+"', zgd : '"+map.get("zgd")+"', sfbf : '"+map.get("sfbf")+"', zygr : '"+map.get("zygr")+"', zdbh : '"+map.get("zdbh")+"', jcrq : '"+map.get("jcrq")+"', fsrq : '"+map.get("fsrq")+"', qrrq : '"+map.get("qrrq")+"', wgrq : '"+map.get("wgrq")+"', ccrq : '"+map.get("ccrq")+"', jzrq : '"+map.get("jzrq")+"',edirq : '"+map.get("edirq")+"', qdf : '"+decimalFormat.format(Double.parseDouble(map.get("qdf").toString()))+"', tyf : '"+decimalFormat.format(Double.parseDouble(map.get("tyf").toString()))+"', dcf : '"+decimalFormat.format(Double.parseDouble(map.get("dcf").toString()))+"', ts : '"+intFormat.format(Double.parseDouble(map.get("ts").toString()))+"', gs : '"+decimalFormat.format(Double.parseDouble(map.get("gs").toString()))+"', gsf : '"+decimalFormat.format(Double.parseDouble(map.get("gsf").toString()))+"', clf : '"+decimalFormat.format(Double.parseDouble(map.get("clf").toString()))+"', hj : '"+decimalFormat.format(Double.parseDouble(map.get("hj").toString()))+"', hblx : '"+map.get("hblx")+"', llr : '"+map.get("llr")+"', llrq : '"+map.get("llrq")+"', tpxz : '<img src=images/icon_grid_menu.gif style=\"cursor:hand\" onclick=down(\""+map.get("xh")+".zip\")>',bz : '"+map.get("bz")+"', re : '"+re+"'},");
}


if(data.substring(data.length()-1,data.length()).equals(","))
	data=new StringBuffer(data.substring(0,data.length()-1));
data.append("]})");



}
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
