package com.cr.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

import com.cr.domain.TCgsxx;
import com.cr.domain.TCgsxxDAO;
import com.cr.domain.TData;
import com.cr.domain.TDataDAO;
import com.cr.domain.TDataDetail;
import com.cr.domain.TDataDetailDAO;
import com.cr.domain.TDcfl;
import com.cr.domain.TDcflDAO;
import com.cr.domain.TFpdc;
import com.cr.domain.TFpdcDAO;
import com.cr.domain.TJcxxx;
import com.cr.domain.TJcxxxDAO;
import com.cr.domain.TRole;
import com.cr.domain.TRoleDAO;
import com.cr.domain.TShlxsz;
import com.cr.domain.TShlxszDAO;
import com.cr.domain.TSum;
import com.cr.domain.TSumDAO;
import com.cr.domain.TUser;
import com.cr.domain.TUserDAO;
import com.cr.domain.TWzdm;
import com.cr.domain.TWzdmDAO;
import com.cr.domain.TXlfl;
import com.cr.domain.TXlflDAO;
import com.cr.domain.TXxl;
import com.cr.domain.TXxlDAO;
import com.cr.domain.TXxxx;
import com.cr.domain.TXxxxDAO;
import com.cr.domain.TZcgjd;
import com.cr.domain.TZcgjdDAO;
import com.cr.domain.Xlfl2;
import com.cr.domain.Xlfl2DAO;
import com.cr.domain.Zcgjd2;
import com.cr.domain.Zcgjd2DAO;
import com.cr.util.MyPasswordEncoder;
import com.cr.dao.DaoSupport;
 


public class MyServiceImpl implements MyService {
private TUserDAO TUserdao;
private TJcxxxDAO TJcxxxdao;
private TZcgjdDAO TZcgjddao;
private DaoSupport dao;
private TCgsxxDAO TCgsxxdao;
private TXxxxDAO TXxxxdao;
private TDcflDAO TDcfldao;
private TXlflDAO TXlfldao;
private TShlxszDAO TShlxszdao;
private Zcgjd2DAO zcgjd2dao;
private Xlfl2DAO xlfl2dao;
private TFpdcDAO TFpdcdao;
private TXxlDAO TXxldao;
private TWzdmDAO TWzdmdao;
private TDataDAO TDatadao;
private TSumDAO TSumdao;

public TSumDAO getTSumdao() {
	return TSumdao;
}

public void setTSumdao(TSumDAO tSumdao) {
	TSumdao = tSumdao;
}
private TDataDetailDAO TDataDetaildao;

public TDataDAO getTDatadao() {
	return TDatadao;
}

public void setTDatadao(TDataDAO tDatadao) {
	TDatadao = tDatadao;
}

public TDataDetailDAO getTDataDetaildao() {
	return TDataDetaildao;
}

public void setTDataDetaildao(TDataDetailDAO tDataDetaildao) {
	TDataDetaildao = tDataDetaildao;
}

public TWzdmDAO getTWzdmdao() {
	return TWzdmdao;
}

public void setTWzdmdao(TWzdmDAO wzdmdao) {
	TWzdmdao = wzdmdao;
}

public TXxlDAO getTXxldao() {
	return TXxldao;
}

public void setTXxldao(TXxlDAO xxldao) {
	TXxldao = xxldao;
}

public TFpdcDAO getTFpdcdao() {
	return TFpdcdao;
}

public void setTFpdcdao(TFpdcDAO fpdcdao) {
	TFpdcdao = fpdcdao;
}

public Zcgjd2DAO getZcgjd2dao() {
	return zcgjd2dao;
}

public void setZcgjd2dao(Zcgjd2DAO zcgjd2dao) {
	this.zcgjd2dao = zcgjd2dao;
}

public Xlfl2DAO getXlfl2dao() {
	return xlfl2dao;
}

public void setXlfl2dao(Xlfl2DAO xlfl2dao) {
	this.xlfl2dao = xlfl2dao;
}

public TShlxszDAO getTShlxszdao() {
	return TShlxszdao;
}

public void setTShlxszdao(TShlxszDAO shlxszdao) {
	TShlxszdao = shlxszdao;
}

public TDcflDAO getTDcfldao() {
	return TDcfldao;
}

public void setTDcfldao(TDcflDAO dcfldao) {
	TDcfldao = dcfldao;
}

public TXlflDAO getTXlfldao() {
	return TXlfldao;
}

public void setTXlfldao(TXlflDAO xlfldao) {
	TXlfldao = xlfldao;
}

public TCgsxxDAO getTCgsxxdao() {
	return TCgsxxdao;
}

public void setTCgsxxdao(TCgsxxDAO cgsxxdao) {
	TCgsxxdao = cgsxxdao;
}

public TXxxxDAO getTXxxxdao() {
	return TXxxxdao;
}

public void setTXxxxdao(TXxxxDAO xxxxdao) {
	TXxxxdao = xxxxdao;
}

public DaoSupport getDao() {
	return dao;
}

public void setDao(DaoSupport dao) {
	this.dao = dao;
}

public TJcxxxDAO getTJcxxxdao() {
	return TJcxxxdao;
}

public void setTJcxxxdao(TJcxxxDAO jcxxxdao) {
	TJcxxxdao = jcxxxdao;
}

public TUserDAO getTUserdao() {
	return TUserdao;
}

public void setTUserdao(TUserDAO userdao) {
	TUserdao = userdao;
}
private TRoleDAO TRoledao;

public TRoleDAO getTRoledao() {
	return TRoledao;
}

public void setTRoledao(TRoleDAO roledao) {
	TRoledao = roledao;
}

public boolean editUser(TUser user) {
	// TODO Auto-generated method stub
	boolean b=false;
	//MyPasswordEncoder coder=new MyPasswordEncoder();
	try{
		//user.setMm(coder.encode(user.getMm()));
		TUserdao.attachDirty(user);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editYh(TUser user) {
	// TODO Auto-generated method stub
	boolean b=false;
	 
	try{
		 
		TUserdao.attachDirty(user);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean checkPwd(String zh, String mm) {
	// TODO Auto-generated method stub
	boolean b=false;
	MyPasswordEncoder coder=new MyPasswordEncoder();
	try{
	TUser user=	TUserdao.findById(zh);	
	mm=coder.encode(mm);
	 
	if(user.getMm().equals(mm))
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public TUser loadUserById(String zh) {
	// TODO Auto-generated method stub
 
	return TUserdao.findById(zh);
}

public boolean addJcxxx(TJcxxx jc) {
	// TODO Auto-generated method stub
	boolean b=false;
	
	try{
		 		
	List list= listDcf(jc);
	if(list.size()>0)
	{Iterator it=list.iterator();
Map map=(Map)it.next();
if(jc.getQdf()==0)
jc.setQdf(Double.parseDouble(map.get("qdf").toString()));
if(jc.getTyf()==0)
jc.setTyf(Double.parseDouble(map.get("tyf").toString()));
if(jc.getDcf()==0){
if(Double.parseDouble(map.get("bgdcf").toString())>0){
	jc.setDcf(Double.parseDouble(map.get("bgdcf").toString()));
}else if(Double.parseDouble(map.get("dcfl").toString())>0&&jc.getCcrq()!=null&&jc.getJcrq()!=null){
	//jc.setDcf(dcf)
	long between=jc.getCcrq().getTime()-jc.getJcrq().getTime();
	long day=between/(24*60*60*1000);
jc.setDcf(Double.parseDouble(map.get("dcfl").toString())*day);
	
}else{
	jc.setDcf(0);
}
}	}
	if(null!=jc.getZygr()&&jc.getZygr().equals(""))
		  jc.setZygr(null);
	TCgsxx cgs=loadCgs(jc.getCgs());
	 jc.setCurType(cgs.getHblx());
	 jc.setBoxOwner(cgs.getXz());
	 jc.setFlType(cgs.getFllx());
		TJcxxxdao.save(jc);
	 
	
		b=true;
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return b;
}

public List listTodayJcxxx() {
	// TODO Auto-generated method stub
	String sqlSelect =" select a.*,b.fllx from t_jcxxx a left join t_cgsxx b on a.cgs=b.gsdm   where a.llrq>=curdate() order by a.rcbh desc";

	return dao.getObjectList(sqlSelect); 
	 
}

public TJcxxx loadTJcxxxBybh(String bh) {
	// TODO Auto-generated method stub
	TJcxxx jc=TJcxxxdao.findById(bh);
	try{
 		
		List list= listDcf(jc);
		if(list.size()>0)
		{Iterator it=list.iterator();
	Map map=(Map)it.next();
	if(jc.getQdf()==0)
	jc.setQdf(Double.parseDouble(map.get("qdf").toString()));
	if(jc.getTyf()==0)
	jc.setTyf(Double.parseDouble(map.get("tyf").toString()));
	if(jc.getDcf()==0){
	if(Double.parseDouble(map.get("bgdcf").toString())>0){
		jc.setDcf(Double.parseDouble(map.get("bgdcf").toString()));
	}else if(Double.parseDouble(map.get("dcfl").toString())>0&&jc.getCcrq()!=null&&jc.getJcrq()!=null){
		//jc.setDcf(dcf)
		long between=jc.getCcrq().getTime()-jc.getJcrq().getTime();
		long day=between/(24*60*60*1000);
	jc.setDcf(Double.parseDouble(map.get("dcfl").toString())*day);
		
	}else{
		jc.setDcf(0);
	}}
		}}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return jc;
}

public boolean delJcxxx(String bh) {
	// TODO Auto-generated method stub]
	boolean b=false;
	try{
		TJcxxx jc=TJcxxxdao.findById(bh);
		TJcxxxdao.delete(jc);
		b=true;
		
	}catch(Exception e){
		
		e.printStackTrace();
	}
	return b;
}

public boolean editJcxxx(TJcxxx jc) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		if(null!=jc.getZygr()&&jc.getZygr().equals(""))
  jc.setZygr(null);
		TCgsxx cgs=loadCgs(jc.getCgs());
		 jc.setCurType(cgs.getHblx());
		 jc.setBoxOwner(cgs.getXz());
		 jc.setFlType(cgs.getFllx());
		TJcxxxdao.merge(jc);
		b=true;
		
	}catch(Exception e){
		
		e.printStackTrace();
	}
	return b;
}

public List listJcxvar(TJcxxx jc) {
	// TODO Auto-generated method stub
	 java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
String qsrq="";
String jzrq="";
String qrqsrq="";
String qrjzrq="";
	String selectStr="select a.*,b.fllx from t_jcxxx a left join t_cgsxx b on a.cgs=b.gsdm ";
	String fromStr="";
	 
	if(null!=jc.getRcbh()&&jc.getRcbh().trim().length()>0){
		fromStr=" a.rcbh like '%"+jc.getRcbh()+"%'";
	}
if(null!=jc.getXh()&&jc.getXh().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.xh like '%"+jc.getXh()+"%'";
	else
	fromStr=" a.xh like '%"+jc.getXh()+"%'";	
	}
if(null!=jc.getCc()&&jc.getCc()!=null&&jc.getCc().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.cc like '%"+jc.getCc()+"%'";
	else
	fromStr=" a.cc like '%"+jc.getCc()+"%'";	
	}
if(jc.getXx()!=null&&jc.getXx().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.xx like '%"+jc.getXx()+"%'";
	else
	fromStr=" a.xx like '%"+jc.getXx()+"%'";	
	}
if(jc.getJczt()!=null&&jc.getJczt().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.jczt like '%"+jc.getJczt()+"%'";
	else
	fromStr=" a.jczt like '%"+jc.getJczt()+"%'";	
	}
if(jc.getCgs().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.cgs like '%"+jc.getCgs()+"%'";
	else
	fromStr=" a.cgs like '%"+jc.getCgs()+"%'";	
	}
if(jc.getTdh().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.tdh like '%"+jc.getTdh()+"%'";
	else
	fromStr=" a.tdh like '%"+jc.getTdh()+"%'";	
	}
if(jc.getZygr()!=null&&jc.getZygr().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.zygr = '"+jc.getZygr()+"'";
	else
	fromStr=" a.zygr= '"+jc.getZygr()+"'";	
	}
if(jc.getLczt()!=null&&jc.getLczt().trim().length()>0){
	if(fromStr.length()>0){
		if(jc.getLczt().equals("离场"))
	fromStr=fromStr+" and a.ccrq is not null";
		else
	 fromStr=fromStr+" and a.ccrq is null";		
	}
	else{
		 
		if(jc.getLczt().equals("离场"))
			fromStr= "  a.ccrq is not null";
				else
			 fromStr= "  a.ccrq is null";		
	}
	}
if(jc.getSfbf()!=null&&jc.getSfbf().trim().length()>0){
	if(fromStr.length()>0)
	fromStr=fromStr+" and a.sfbf = '"+jc.getSfbf()+"'";
	else
	fromStr=" a.sfbf = '"+jc.getSfbf()+"'";	
	}
if(jc.getSfqr()!=null&&jc.getSfqr().trim().length()>0){
	if(fromStr.length()>0){
	if(jc.getSfqr().equals("是"))
		fromStr=fromStr+" and a.qrrq is not null";
	else
		fromStr=fromStr+" and a.qrrq is  null";
	}
	else{
		if(jc.getSfqr().equals("是"))
	fromStr=" a.qrrq is not null";	
		else 
    fromStr=" a.qrrq is  null";			
	
	}
	}
if(jc.getSfwg()!=null&&jc.getSfwg().trim().length()>0){
	if(fromStr.length()>0){
	if(jc.getSfwg().equals("是"))
		fromStr=fromStr+" and a.wgrq is not null";
	else
		fromStr=fromStr+" and a.wgrq is  null";
	}
	else{
		if(jc.getSfwg().equals("是"))
	fromStr=" a.wgrq is not null";	
		else 
    fromStr=" a.wgrq is  null";			
	
	}
	}
if(jc.getSfjz()!=null&&jc.getSfjz().trim().length()>0){
	if(fromStr.length()>0){
	if(jc.getSfjz().equals("是"))
		fromStr=fromStr+" and a.jzrq is not null";
	else
		fromStr=fromStr+" and a.jzrq is  null";
	}
	else{
		if(jc.getSfjz().equals("是"))
	fromStr=" a.jzrq is not null";	
		else 
    fromStr=" a.jzrq is  null";			
	
	}
	}
try{
	if(jc.getJcrq()!=null)
	qsrq=format.format(jc.getJcrq());
	if(jc.getWgrq()!=null)
		qrqsrq=format.format(jc.getWgrq());
	
	if(jc.getLlrq()!=null)
 jzrq=format.format(jc.getLlrq());
	if(jc.getQrrq()!=null)
		 qrjzrq=format.format(jc.getQrrq());
}catch(Exception e){
	e.printStackTrace();
}
if(qsrq.length()>0){
	if(fromStr.length()>0)
		fromStr=fromStr+" and a.jcrq >= '"+qsrq+"'";
		else
		fromStr=" a.jcrq >= '"+qsrq+"'";
}
if(jzrq.length()>0){
	if(fromStr.length()>0)
		fromStr=fromStr+" and a.jcrq < '"+jzrq+"'";
		else
		fromStr=" a.jcrq < '"+jzrq+"'";
}
if(qrqsrq.length()>0){
	if(fromStr.length()>0)
		fromStr=fromStr+" and a.qrrq >= '"+qrqsrq+"'";
		else
		fromStr=" a.qrrq >= '"+qrqsrq+"'";
}
if(qrjzrq.length()>0){
	if(fromStr.length()>0)
		fromStr=fromStr+" and a.qrrq < '"+qrjzrq+"'";
		else
		fromStr=" a.qrrq < '"+qrjzrq+"'";
}
if(fromStr.length()>0)
	selectStr=selectStr+" where "+fromStr+" order by a.rcbh desc";
else
	selectStr=selectStr+" order by a.rcbh desc";
 

	return dao.getObjectList(selectStr);
}

public String getRcbh() {
	// TODO Auto-generated method stub
	 SimpleDateFormat   formatter   =   new   SimpleDateFormat("yyMM");   
	 Date   currentTime   =   new   Date();   
	 String   strDate   =   formatter.format(currentTime);  
	 String bh="";
	 int i=0;
	String sqlSelect="select max(rcbh) as RCBH from t_jcxxx a where rcbh like '"+strDate+"%'";

	List list=dao.getObjectList(sqlSelect);
	Iterator it=list.iterator();
	NumberFormat numformatter = new DecimalFormat("00000");
	  Map map=(Map)it.next();
	if(map.get("RCBH")!=null){
	   
		i=Integer.valueOf(map.get("RCBH").toString().substring(4,9));
        ++i;
        bh=strDate+numformatter.format(i);
	}else{
		bh=strDate+"00001";
	}
	
	return bh;
}

public List listXh(String id) {
	// TODO Auto-generated method stub
	String sqlSelect =" select xh,xx,xxl,cc,cgs,zzrq,ifnull(date_format(jcrq,'%Y-%m-%d %H:%i'),'') jcrq,ifnull(date_format(ccrq,'%Y-%m-%d %H:%i'),'') ccrq from t_jcxxx where xh  = '"+id+"' group by xh,xx,cgs,zzrq,ccrq order by llrq desc";
	
	return dao.getObjectList(sqlSelect);
}

public String getJczt(String cgs) {
	// TODO Auto-generated method stub
	 SimpleDateFormat   formatter   =   new   SimpleDateFormat("yyMM");   
	 Date   currentTime   =   new   Date();   
	 String   strDate   =   formatter.format(currentTime);  
	 String bh="";
	 int i=0;
	String sqlSelect="select max(zdbh) as zdbh from t_jcxxx a where cgs='"+cgs+"' and zdbh like '"+strDate+"%'";

	List list=dao.getObjectList(sqlSelect);
	NumberFormat numformatter = new DecimalFormat("0000");
	  Map map=(Map)list.get(0);
	if(map.get("zdbh")!=null){
	   
		i=Integer.valueOf(map.get("zdbh").toString().substring(4,8));
        ++i;
        bh=strDate+numformatter.format(i);
	}else{
		bh=strDate+"0001";
	}
	
	return bh;
}

public TZcgjdDAO getTZcgjddao() {
	return TZcgjddao;
}

public void setTZcgjddao(TZcgjdDAO zcgjddao) {
	TZcgjddao = zcgjddao;
}

public boolean addZcgjd(String bh,TZcgjd gjd) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TJcxxx jc=TJcxxxdao.findById(bh);
		gjd.setTJcxxx(jc);
		TZcgjddao.getHibernateTemplate().save(gjd);
		TZcgjddao.getHibernateTemplate().flush();
		List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+jc.getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+jc.getRcbh()+"' group by fff) a group by fff order by fff");
		Iterator it=sumlist.iterator();
		for(;it.hasNext();){
			Map map =(Map)it.next();
			List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+jc.getRcbh()+"'");
		if(s.size()>0){
			Map sm=(Map)s.get(0);
			TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.attachDirty(sum);
		}
		else{
			TSum sum=new TSum();
			sum.setTJcxxx(jc);
			sum.setFff(map.get("fff").toString());
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.save(sum);
		}
		}
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listGjd(String bh) {
	// TODO Auto-generated method stub

String sqlSelect =" select id,shlx,shwz,shdm,shmx,sl,xs,gsf,clf,fff,lrr,lrsj from t_zcgjd where rcbh = '"+bh+"' order by id asc";
	
	return dao.getObjectList(sqlSelect);
	

}

public List listXx(String xxdm) {
	// TODO Auto-generated method stub
String sqlSelect =" select xxdm,xxmc,xxmx from t_xxxx where xxdm like '%"+xxdm+"%'";
	
	return dao.getObjectList(sqlSelect);
}

public List listCgs(String gsdm) {
	// TODO Auto-generated method stub
String sqlSelect =" select gsdm,gsmc,ywmc,lxdh,cz,fzr,email,fllx,lgsdm from t_cgsxx where gsdm like '%"+gsdm+"%' order by gsdm";
	
	return dao.getObjectList(sqlSelect);
}

public List listShdm(String shdm,String bh) {
	// TODO Auto-generated method stub
String sqlSelect =" select a.shdm,a.shmx,a.gs,c.gsfl as gsfl,a.clf from t_xlfl a,t_jcxxx b,t_cgsxx c where   b.rcbh='"+bh+"'      and a.gsid =c.gsid and c.gsdm=b.cgs   and  a.shdm like '%"+shdm+"%'";
 
	return dao.getObjectList(sqlSelect);
}

public boolean delGjd(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	TZcgjd gjd=	TZcgjddao.findById(id);
		TJcxxx jc=gjd.getTJcxxx();
		dao.executeSql("delete from t_zcgjd where id="+id);
		dao.executeSql("delete from t_sum where rcbh='"+jc.getRcbh()+"'");
	
		List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+jc.getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+jc.getRcbh()+"' group by fff) a group by fff order by fff");
		Iterator it=sumlist.iterator();
		for(;it.hasNext();){
			Map map =(Map)it.next();
			List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+jc.getRcbh()+"'");
		if(s.size()>0){
			Map sm=(Map)s.get(0);
			TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.attachDirty(sum);
		}
		else{
			TSum sum=new TSum();
			sum.setTJcxxx(jc);
			sum.setFff(map.get("fff").toString());
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.save(sum);
		}
		}
	b=true;
	}catch(Exception e){
		 
		e.printStackTrace();
	}
	return b;
}

public boolean editGjd(TZcgjd gjd) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TZcgjddao.getHibernateTemplate().saveOrUpdate(gjd);
		TZcgjddao.getHibernateTemplate().flush();
		TJcxxx jc=gjd.getTJcxxx();
		dao.executeSql("delete from t_sum where rcbh='"+jc.getRcbh()+"'");
		List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+jc.getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+jc.getRcbh()+"' group by fff) a group by fff order by fff");
		Iterator it=sumlist.iterator();
		for(;it.hasNext();){
			Map map =(Map)it.next();
			List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+jc.getRcbh()+"'");
		if(s.size()>0){
			Map sm=(Map)s.get(0);
			TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.attachDirty(sum);
		}
		else{
			TSum sum=new TSum();
			sum.setTJcxxx(jc);
			sum.setFff(map.get("fff").toString());
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.save(sum);
		}
		}
	//	jcxxx.setSumGs(sumGs)
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public TZcgjd loadGjdById(long id) {
	// TODO Auto-generated method stub
	return TZcgjddao.findById(id);
}

public boolean addXx(TXxxx xx) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TXxxxdao.save(xx);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delXx(String xxdm) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TXxxx xx=TXxxxdao.findById(xxdm);
		TXxxxdao.delete(xx);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editXx(TXxxx xx) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	TXxxxdao.merge(xx);	
	b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listAllXx() {
	// TODO Auto-generated method stub
	
	return TXxxxdao.findAll();
}

public TXxxx loadXxById(String xxdm) {
	// TODO Auto-generated method stub
	return TXxxxdao.findById(xxdm);
}

public boolean addCgs(TCgsxx cgs) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TCgsxxdao.save(cgs);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delCgs(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	TCgsxx cgs=	TCgsxxdao.findById(id);
	TCgsxxdao.delete(cgs);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editCgs(TCgsxx cgs) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TCgsxxdao.attachDirty(cgs);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listAllCgs() {
	// TODO Auto-generated method stub
	return TCgsxxdao.findAll();
}

public TCgsxx loadCgsxxById(long id) {
	// TODO Auto-generated method stub
	return TCgsxxdao.findById(id);
}

public boolean addDcfl(long id, TDcfl dcfl) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	     dcfl.setTCgsxx(TCgsxxdao.findById(id));
	     TDcfldao.save(dcfl);
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delDcfl(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	TDcfl dcfl=	TDcfldao.findById(id);
	     TDcfldao.delete(dcfl);
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editDcfl(TDcfl dcfl) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	     
	     TDcfldao.attachDirty(dcfl);
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listDcflByGsid(long gsid) {
	// TODO Auto-generated method stub
	String sqlSelect =" select id,cc,xx,qdf,tyf,dcfl,bgdcf,hblx from t_dcfl where gsid ="+gsid+"";

	return dao.getObjectList(sqlSelect);
}

public TDcfl loadDcflById(long id) {
	// TODO Auto-generated method stub
	return TDcfldao.findById(id);
}

public boolean addXlfl(long id, TXlfl xlfl) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	    TCgsxx cgs= TCgsxxdao.findById(id);
	    xlfl.setTCgsxx(cgs);
	    TXlfldao.save(xlfl);
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delXlfl(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	     
	   TXlfl xlfl= TXlfldao.findById(id);
	   TXlfldao.delete(xlfl);
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editXlfl(TXlfl xlfl) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	     
	     TXlfldao.attachDirty(xlfl);
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listXlflByGsid(long id) {
	// TODO Auto-generated method stub
	String sqlSelect =" select id,gsid,shdm,shmx,gs,clf from t_xlfl where gsid ="+id+"";

	return dao.getObjectList(sqlSelect);
}

public TXlfl loadXlflById(long id) {
	// TODO Auto-generated method stub
	return TXlfldao.findById(id);
}

public List listDcf(TJcxxx jc) {
	// TODO Auto-generated method stub
	String sqlSelect ="select a.qdf,a.dcfl,a.bgdcf,a.tyf,a.hblx from t_dcfl a,t_jcxxx b,t_cgsxx  c where a.gsid=c.gsid and c.gsdm=b.cgs and b.cgs='"+jc.getCgs()+"' and a.xx='"+jc.getXx()+"' and a.cc='"+jc.getCc()+"'";
	
	  
	return dao.getObjectList(sqlSelect);
}

 

public JasperPrint getGjdJasper(String realpath,String rcbh,String chk) {
	// TODO Auto-generated method stub
	String sqlplus="";
	boolean c=false;
	boolean u=false;
	boolean o=false;
	boolean w=false;
	String pname="reports//gjd.jasper";
	String[] arr=chk.split(",");
	for(int i=0;i<arr.length;i++){
		if(i==0)
		{
		if(!arr[i].trim().equals(""))
		sqlplus="b.fff='"+arr[i]+"'";
		}
		else
			sqlplus=sqlplus+" or b.fff='"+arr[i]+"'";	
	}
	if(sqlplus.length()>0)
	sqlplus=" and ("+sqlplus+")";
	String sqlSelect ="SELECT a.`xh`,a.`cc`,a.`xx`,a.zdbh,a.`zzrq`,a.`cgs`,a.jcrq,a.tdh,c.`llxdh`,c.`lcz`,c.`lemail`,b.shlx,b.shwz,b.`shdm`,b.`shmx`,b.`sl`,b.`xs`,b.`gsf`,b.`clf`,(b.gsf+b.clf)as hj,b.`fff`,c.`lywmc`,c.lgsdz,c.hblx,(select ifnull(sum(xs),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='C') as cxs,(select ifnull(sum(xs),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='U') as uxs,(select ifnull(sum(xs),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='O') as oxs,(select ifnull(sum(xs),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='W') as wxs,(select ifnull(sum(gsf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='C') as cgsf,(select ifnull(sum(gsf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='U') as ugsf,(select ifnull(sum(gsf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='O') as ogsf,(select ifnull(sum(gsf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='W') as wgsf,(select ifnull(sum(clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='C') as cclf,(select ifnull(sum(clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='U') as uclf,(select ifnull(sum(clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='O') as oclf,(select ifnull(sum(clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='W') as wclf,(select ifnull(sum(gsf+clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='C') as chj,(select ifnull(sum(gsf+clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='U') as uhj,(select ifnull(sum(gsf+clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='O') as ohj,(select ifnull(sum(gsf+clf),0)  from t_zcgjd where rcbh='"+rcbh+"' and fff='W') as whj FROM `t_jcxxx` a,`t_zcgjd` b,`t_cgsxx` c  WHERE a.rcbh = '"+rcbh+"' and a.cgs = c.gsdm and b.rcbh = a.rcbh "+sqlplus+" order by b.id";
//System.out.println(sqlSelect);
	Collection rows = dao.getObjectList(sqlSelect); 

	Iterator it=rows.iterator();
	for(;it.hasNext();){
		Map map=(Map)it.next();
		if(Float.parseFloat(map.get("chj").toString())>0)
			c=true;
		if(Float.parseFloat(map.get("uhj").toString())>0)
			u=true;
		if(Float.parseFloat(map.get("ohj").toString())>0)
			o=true;
		if(Float.parseFloat(map.get("whj").toString())>0)
			w=true;
	}

		if(chk.trim().equals("C,U,")&&c&&u)
			  pname="reports//gjd2.jasper";
		  else if(chk.trim().equals("C,O,")&&c&&o)
			  pname="reports//gjd3.jasper";
		  else if(chk.trim().equals("C,W,")&&c&&w)
			  pname="reports//gjd4.jasper";
		  else if(chk.trim().equals("U,O,")&&u&&o)
			  pname="reports//gjd5.jasper";
		  else if(chk.trim().equals("U,W,")&&u&&w)
			  pname="reports//gjd6.jasper";
		  else if(chk.trim().equals("O,W,")&&o&&w)
			  pname="reports//gjd7.jasper";
		  else if(chk.trim().equals("C,U,O,")){
			  if(c&&u&&o){
			  pname="reports//gjd8.jasper";
			  }else if(c&&u){
				  pname="reports//gjd2.jasper";  
			  }else if(c&&o){
				  pname="reports//gjd3.jasper"; 
			  }else if(u&&o){
				  pname="reports//gjd5.jasper"; 
			  }
			  
		  }
		  else if(chk.trim().equals("C,U,W,")){
			  if(c&&u&&w){
			  pname="reports//gjd9.jasper";
			  }else if(c&&u){
				  pname="reports//gjd2.jasper";    
			  }else if(c&&w){
				  pname="reports//gjd4.jasper";    
			  }else if(u&&w){
				  pname="reports//gjd6.jasper";    
			  }
			  }
		  else if(chk.trim().equals("C,O,W,")){
			  if(c&&o&&w)
			  pname="reports//gjd10.jasper";
			  else if(c&&o)
				  pname="reports//gjd3.jasper";
			  else if(c&&w)
				  pname="reports//gjd4.jasper";
			  else if(o&&w)
				  pname="reports//gjd7.jasper";
		  }
		  else if(chk.trim().equals("U,O,W,")){
			  if(u&&o&&w)
			  pname="reports//gjd11.jasper";
			  else if(u&&o)  
				  pname="reports//gjd5.jasper";
			  else if(u&&w)
				  pname="reports//gjd6.jasper";
			  else if(o&&w)
				  pname="reports//gjd7.jasper";
		  }
		  else if(chk.trim().equals("C,U,O,W,")){
			  if(c&&u&&o&&w)
			  pname="reports//gjd12.jasper";
			  else if(c&&u&&o)
				  pname="reports//gjd8.jasper";
			  else if(c&&u&&w)
				  pname="reports//gjd9.jasper";
			  else if(c&&o&&w)
				  pname="reports//gjd10.jasper";
			  else if(u&&o&&w)
				  pname="reports//gjd11.jasper";
			  else if(c&&u)
				  pname="reports//gjd2.jasper";
			  else if(c&&o)
				  pname="reports//gjd3.jasper";
			  else if(c&&w)
				  pname="reports//gjd4.jasper";
			  else if(u&&o)
				  pname="reports//gjd5.jasper";
			  else if(u&&w)
				  pname="reports//gjd6.jasper";
			  else if(o&&w)
				  pname="reports//gjd7.jasper";
			  }

     JasperPrint jasperPrint = setReportCollection(realpath+ pname, rows);   
     return jasperPrint;   
}

public JasperPrint setReportCollection(String url, Collection list) {
	// TODO Auto-generated method stub
	Map parameters =  new HashMap();
    JRMapCollectionDataSource dataSource;   
    //将list数据集转换为JRMapCollectionDataSource   
    dataSource = new JRMapCollectionDataSource(list);   
    //使用JasperFillManager填充JasperPrint对象   
    JasperPrint jasperPrint=null;
   // System.out.println(JRPropertiesMap.class.getPackage().getImplementationVersion());

  try
    { jasperPrint = JasperFillManager.fillReport(url, parameters,dataSource);   
    }catch(Exception e){
    
    	e.printStackTrace();
    }
    return jasperPrint;   
}

public List listAllUser() {
	// TODO Auto-generated method stub
	return TUserdao.findAll();
}

public boolean addUser(TUser user) {
	// TODO Auto-generated method stub
	boolean b=false;
	MyPasswordEncoder coder=new MyPasswordEncoder();
	try{
	user.setMm(coder.encode(user.getMm()));
		TUserdao.save(user);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delUser(String zh) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TUser user=TUserdao.findById(zh);
		TUserdao.delete(user);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}



public boolean findUserByZh(String zh) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	List list=	TUserdao.findByProperty("zh", zh);
	if(list.size()==0)
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean addRole(TRole role) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	 TRoledao.save(role);
	 b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delRole(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	 TRole role=TRoledao.findById(id);
	 TRoledao.delete(role);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editRole(TRole role) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	 TRoledao.merge(role);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listAllRole() {
	// TODO Auto-generated method stub
	return TRoledao.findAll();
}

public TRole loadRoleById(long id) {
	// TODO Auto-generated method stub
	return TRoledao.findById(id);
}
public List listJsByZh(String zh) {
	// TODO Auto-generated method stub
	List list=new ArrayList();
	List list1=new ArrayList();
	List list2=new ArrayList();
	String sql="";
 
	if(!zh.equals("")){
sql="select * from user_role where zh= '"+zh+"'";
	 
	 list=dao.getObjectList(sql);	
 
	 for(int i=0;i<list.size();i++){
		 Map map=(Map)list.get(i);
		 list1.add(map.get("ROLE_ID").toString());
		 
	 }
	 }


	list= listAllRole();
 
	for(int i=0;i<list.size();i++){
		TRole js=(TRole)list.get(i);
		if(list1.indexOf(String.valueOf(js.getRoleId()))==-1){
			js.setColor("kk1");
		}else{
			js.setColor("kk");

		}
	 
		list2.add(js);
	}
	return list2;
}
public List listQxByZh(String zh) {
	// TODO Auto-generated method stub
	List list=new ArrayList();
	List list1=new ArrayList();
	List list2=new ArrayList();
	String sql="";
 
	if(!zh.equals("")){
sql="select qxfw from t_user where zh= '"+zh+"'";
	 
	 list=dao.getObjectList(sql);	
 
	 for(int i=0;i<list.size();i++){
		 Map map=(Map)list.get(i);
		 if(null!=map&&null!=map.get("qxfw"))
		 list1.add(map.get("qxfw").toString());
		 
	 }
	 }

	sql="select  distinct xz xz from t_cgsxx";
	 
	 list=dao.getObjectList(sql);	
 Iterator it=list.iterator();
	for(;it.hasNext();){
		TRole js=new TRole();
	Map map=(Map)it.next();
	js.setRCaption(map.get("xz").toString());
		if(list1.indexOf(String.valueOf(map.get("xz").toString()))==-1){
			js.setColor("kk1");
		}else{
			js.setColor("kk");

		}
	 
		list2.add(js);
	}
	return list2;
}
public boolean delUserRoleByZh(String zh) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	String	 sql="delete from user_role where zh= '"+zh+"'";

			dao.executeSql(sql); 
			b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public TRole loadRoleByCaption(String caption) {
	// TODO Auto-generated method stub
	TRole role=new TRole();
	List list=TRoledao.findByRCaption(caption);
	Iterator it=list.iterator();
	if(it.hasNext())
		role=(TRole)it.next();
	return role;
}

public List listBbcx(TJcxxx jc) {
	// TODO Auto-generated method stub
	java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	String qsrq="";
	String jzrq="";
	String qrqsrq="";
	String qrjzrq="";
		String selectStr="select a.*,ifnull(sum(b.gs),0) as gs,ifnull(sum(b.GSF),0) as gsf,ifnull(sum(b.CLF),0) as clf,ifnull(sum(b.GSF+b.CLF),0) as hj,c.hblx from t_jcxxx a ";
		String fromStr="";
		 
		if(jc.getRcbh()!=null&&jc.getRcbh().trim().length()>0){
			fromStr=" a.rcbh like '%"+jc.getRcbh()+"%'";
		}
	if(jc.getXh()!=null&&jc.getXh().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.xh like '%"+jc.getXh()+"%'";
		else
		fromStr=" a.xh like '%"+jc.getXh()+"%'";	
		}
	if(jc.getCc()!=null&&jc.getCc().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.cc like '%"+jc.getCc()+"%'";
		else
		fromStr=" a.cc like '%"+jc.getCc()+"%'";	
		}
	if(jc.getXx()!=null&&jc.getXx().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.xx like '%"+jc.getXx()+"%'";
		else
		fromStr=" a.xx like '%"+jc.getXx()+"%'";	
		}
	if(jc.getJczt()!=null&&jc.getJczt().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.jczt like '%"+jc.getJczt()+"%'";
		else
		fromStr=" a.jczt like '%"+jc.getJczt()+"%'";	
		}
	if(jc.getCgs()!=null&&jc.getCgs().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.cgs like '%"+jc.getCgs()+"%'";
		else
		fromStr=" a.cgs like '%"+jc.getCgs()+"%'";	
		}
	if(jc.getTdh()!=null&&jc.getTdh().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.tdh like '%"+jc.getTdh()+"%'";
		else
		fromStr=" a.tdh like '%"+jc.getTdh()+"%'";	
		}
	if(jc.getLczt()!=null&&jc.getLczt().trim().length()>0){
		if(fromStr.length()>0){
			if(jc.getLczt().equals("离场"))
		fromStr=fromStr+" and a.ccrq is not null";
			else
		 fromStr=fromStr+" and a.ccrq is null";		
		}
		else{
			 
			if(jc.getLczt().equals("离场"))
				fromStr= "  a.ccrq is not null";
					else
				 fromStr= "  a.ccrq is null";		
		}
		}
	if(jc.getSfbf()!=null&&jc.getSfbf().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.sfbf = '"+jc.getSfbf()+"'";
		else
		fromStr=" a.sfbf = '"+jc.getSfbf()+"'";	
		}
	if(jc.getZygr()!=null&&jc.getZygr().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.zygr = '"+jc.getZygr()+"'";
		else
		fromStr=" a.zygr= '"+jc.getZygr()+"'";	
		}
	if(jc.getSfqr()!=null&&jc.getSfqr().trim().length()>0){
		if(fromStr.length()>0){
		if(jc.getSfqr().equals("是"))
			fromStr=fromStr+" and a.qrrq is not null";
		else
			fromStr=fromStr+" and a.qrrq is  null";
		}
		else{
			if(jc.getSfqr().equals("是"))
		fromStr=" a.qrrq is not null";	
			else 
	    fromStr=" a.qrrq is  null";			
		
		}
		}
	if(jc.getSfwg()!=null&&jc.getSfwg().trim().length()>0){
		if(fromStr.length()>0){
		if(jc.getSfwg().equals("是"))
			fromStr=fromStr+" and a.wgrq is not null";
		else
			fromStr=fromStr+" and a.wgrq is  null";
		}
		else{
			if(jc.getSfwg().equals("是"))
		fromStr=" a.wgrq is not null";	
			else 
	    fromStr=" a.wgrq is  null";			
		
		}
		}
	if(jc.getSfjz()!=null&&jc.getSfjz().trim().length()>0){
		if(fromStr.length()>0){
		if(jc.getSfjz().equals("是"))
			fromStr=fromStr+" and a.jzrq is not null";
		else
			fromStr=fromStr+" and a.jzrq is  null";
		}
		else{
			if(jc.getSfjz().equals("是"))
		fromStr=" a.jzrq is not null";	
			else 
	    fromStr=" a.jzrq is  null";			
		
		}
		}
	try{
		if(jc.getJcrq()!=null)
		qsrq=format.format(jc.getJcrq());
		if(jc.getWgrq()!=null)
			qrqsrq=format.format(jc.getWgrq());
		
		if(jc.getLlrq()!=null)
	 jzrq=format.format(jc.getLlrq());
		if(jc.getQrrq()!=null)
			 qrjzrq=format.format(jc.getQrrq());
	}catch(Exception e){
		e.printStackTrace();
	}
	if(qsrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.jcrq >= '"+qsrq+"'";
			else
			fromStr=" a.jcrq >= '"+qsrq+"'";
	}
	if(jzrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.jcrq < '"+jzrq+"'";
			else
			fromStr=" a.jcrq < '"+jzrq+"'";
	}
	if(qrqsrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.qrrq >= '"+qrqsrq+"'";
			else
			fromStr=" a.qrrq >= '"+qrqsrq+"'";
	}
	if(qrjzrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.qrrq < '"+qrjzrq+"'";
			else
			fromStr=" a.qrrq < '"+qrjzrq+"'";
	}
	if(fromStr.length()>0)
		selectStr=selectStr+" left join v_gjd b on a.rcbh=b.rcbh left join t_cgsxx c  on c.gsdm=a.cgs where "+fromStr+" group by a.rcbh order by a.rcbh desc";
	else
		selectStr=selectStr+" left join v_gjd b on a.rcbh=b.rcbh left join t_cgsxx c  on c.gsdm=a.cgs group by a.rcbh order by a.rcbh desc";
 
		return dao.getObjectList(selectStr);
}

public String findBbSql(TJcxxx jc) {
	// TODO Auto-generated method stub
	java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	String qsrq="";
	String jzrq="";
	String qrqsrq="";
	String qrjzrq="";
		String selectStr="";
		String fromStr="";
		 
		if(jc.getRcbh()!=null&&jc.getRcbh().trim().length()>0){
			fromStr=" a.rcbh like '%"+jc.getRcbh()+"%'";
		}
	if(jc.getXh()!=null&&jc.getXh().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.xh like '%"+jc.getXh()+"%'";
		else
		fromStr=" a.xh like '%"+jc.getXh()+"%'";	
		}
	if(jc.getCc()!=null&&jc.getCc().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.cc like '%"+jc.getCc()+"%'";
		else
		fromStr=" a.cc like '%"+jc.getCc()+"%'";	
		}
	if(jc.getXx()!=null&&jc.getXx().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.xx like '%"+jc.getXx()+"%'";
		else
		fromStr=" a.xx like '%"+jc.getXx()+"%'";	
		}
	if(jc.getJczt()!=null&&jc.getJczt().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.jczt like '%"+jc.getJczt()+"%'";
		else
		fromStr=" a.jczt like '%"+jc.getJczt()+"%'";	
		}
	if(jc.getCgs()!=null&&jc.getCgs().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.cgs like '%"+jc.getCgs()+"%'";
		else
		fromStr=" a.cgs like '%"+jc.getCgs()+"%'";	
		}
	if(jc.getTdh()!=null&&jc.getTdh().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.tdh like '%"+jc.getTdh()+"%'";
		else
		fromStr=" a.tdh like '%"+jc.getTdh()+"%'";	
		}
	if(jc.getZygr()!=null&&jc.getZygr().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.zygr = '"+jc.getZygr()+"'";
		else
		fromStr=" a.zygr= '"+jc.getZygr()+"'";	
		}
	if(jc.getLczt()!=null&&jc.getLczt().trim().length()>0){
		if(fromStr.length()>0){
			if(jc.getLczt().equals("离场"))
		fromStr=fromStr+" and a.ccrq is not null";
			else
		 fromStr=fromStr+" and a.ccrq is null";		
		}
		else{
			 
			if(jc.getLczt().equals("离场"))
				fromStr= "  a.ccrq is not null";
					else
				 fromStr= "  a.ccrq is null";		
		}
		}
	if(jc.getSfbf()!=null&&jc.getSfbf().trim().length()>0){
		if(fromStr.length()>0)
		fromStr=fromStr+" and a.sfbf = '"+jc.getSfbf()+"'";
		else
		fromStr=" a.sfbf = '"+jc.getSfbf()+"'";	
		}
	if(jc.getSfqr()!=null&&jc.getSfqr().trim().length()>0){
		if(fromStr.length()>0){
		if(jc.getSfqr().equals("是"))
			fromStr=fromStr+" and a.qrrq is not null";
		else
			fromStr=fromStr+" and a.qrrq is  null";
		}
		else{
			if(jc.getSfqr().equals("是"))
		fromStr=" a.qrrq is not null";	
			else 
	    fromStr=" a.qrrq is  null";			
		
		}
		}
	if(jc.getSfwg()!=null&&jc.getSfwg().trim().length()>0){
		if(fromStr.length()>0){
		if(jc.getSfwg().equals("是"))
			fromStr=fromStr+" and a.wgrq is not null";
		else
			fromStr=fromStr+" and a.wgrq is  null";
		}
		else{
			if(jc.getSfwg().equals("是"))
		fromStr=" a.wgrq is not null";	
			else 
	    fromStr=" a.wgrq is  null";			
		
		}
		}
	if(jc.getSfjz()!=null&&jc.getSfjz().trim().length()>0){
		if(fromStr.length()>0){
		if(jc.getSfjz().equals("是"))
			fromStr=fromStr+" and a.jzrq is not null";
		else
			fromStr=fromStr+" and a.jzrq is  null";
		}
		else{
			if(jc.getSfjz().equals("是"))
		fromStr=" a.jzrq is not null";	
			else 
	    fromStr=" a.jzrq is  null";			
		
		}
		}
	try{
		if(jc.getJcrq()!=null)
		qsrq=format.format(jc.getJcrq());
		if(jc.getWgrq()!=null)
			qrqsrq=format.format(jc.getWgrq());
		
		if(jc.getLlrq()!=null)
	 jzrq=format.format(jc.getLlrq());
		if(jc.getQrrq()!=null)
			 qrjzrq=format.format(jc.getQrrq());
	}catch(Exception e){
		e.printStackTrace();
	}
	if(qsrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.jcrq >= '"+qsrq+"'";
			else
			fromStr=" a.jcrq >= '"+qsrq+"'";
	}
	if(jzrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.jcrq < '"+jzrq+"'";
			else
			fromStr=" a.jcrq < '"+jzrq+"'";
	}
	if(qrqsrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.qrrq >= '"+qrqsrq+"'";
			else
			fromStr=" a.qrrq >= '"+qrqsrq+"'";
	}
	if(qrjzrq.length()>0){
		if(fromStr.length()>0)
			fromStr=fromStr+" and a.qrrq < '"+qrjzrq+"'";
			else
			fromStr=" a.qrrq < '"+qrjzrq+"'";
	}
	if(fromStr.length()>0)
		selectStr=selectStr+" left join v_gjd b on a.rcbh=b.rcbh  where "+fromStr;
	else
		selectStr=selectStr+" left join v_gjd b on a.rcbh=b.rcbh ";

	return selectStr;
}

public List listvar(String sql) {
	// TODO Auto-generated method stub
	return dao.getObjectList(sql);
}

public boolean addclonecgs(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TCgsxx cgs=TCgsxxdao.findById(id);
		TCgsxx c1=new TCgsxx();
		c1.setGsmc(cgs.getGsmc());
		c1.setGsdm(cgs.getGsdm()+" 复制");
		c1.setCz(cgs.getCz());
		c1.setEmail(cgs.getEmail());
		c1.setFzr(cgs.getFzr());
		c1.setGsfl(cgs.getGsfl());
		c1.setHblx(cgs.getHblx());
		 c1.setLxdh(cgs.getLxdh());
		Iterator it=cgs.getTDcfls().iterator();
	 
		for(;it.hasNext();){
		TDcfl d=(TDcfl)it.next();
			TDcfl dcfl=new TDcfl();
		dcfl.setBgdcf(d.getBgdcf());
		dcfl.setCc(d.getCc());
		dcfl.setXx(d.getXx());
		dcfl.setDcfl(d.getDcfl());
		dcfl.setQdf(d.getQdf());
		dcfl.setTyf(d.getTyf());
	 dcfl.setTCgsxx(c1);
	 TDcfldao.save(dcfl);
		c1.getTDcfls().add(dcfl);
		}
	 
		  it=cgs.getTXlfls().iterator();
		for(;it.hasNext();){
		TXlfl d=(TXlfl)it.next();
			TXlfl xlfl=new TXlfl();
		 xlfl.setShdm(d.getShdm());
		 xlfl.setShmx(d.getShmx());
		 xlfl.setGs(d.getGs());
		 xlfl.setClf(d.getClf());
		 xlfl.setTCgsxx(c1);
		 TXlfldao.save(xlfl);
	 c1.getTXlfls().add(xlfl);
	 
		}
		it=cgs.getXlfl2s().iterator();
		for(;it.hasNext();){
			Xlfl2 d=(Xlfl2)it.next();
			Xlfl2 xlfl2=new Xlfl2();
			xlfl2.setLx(d.getLx());
			xlfl2.setBjmc(d.getBjmc());
			xlfl2.setXlff(d.getXlff());
			xlfl2.setC(d.getC());
			xlfl2.setK(d.getK());
			xlfl2.setXlmx(d.getXlmx());
			xlfl2.setGs(d.getGs());
			xlfl2.setClf(d.getClf());
			xlfl2.setTCgsxx(c1);
			xlfl2dao.save(xlfl2);
			c1.getXlfl2s().add(xlfl2);
		}
		c1.setLcz(cgs.getLcz());
		c1.setLemail(cgs.getLemail());
		c1.setLfzr(cgs.getLfzr());
		c1.setLgsdz(cgs.getLgsdz());
		c1.setLgsmc(cgs.getLgsmc());
		c1.setLlxdh(cgs.getLlxdh());
		c1.setLywmc(cgs.getLywmc());
		c1.setYwmc(cgs.getYwmc());
		TCgsxxdao.save(c1);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean addShlxsz(TShlxsz shlx) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TShlxszdao.save(shlx);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delShlxsz(String shlxdm) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TShlxsz shlx=TShlxszdao.findById(shlxdm);
		TShlxszdao.delete(shlx);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editShlxsz(TShlxsz shlx) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TShlxszdao.merge(shlx);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public TShlxsz loadShlxByDm(String shlxdm) {
	// TODO Auto-generated method stub
	return TShlxszdao.findById(shlxdm);
}

public List listAllShlx() {
	// TODO Auto-generated method stub
	return TShlxszdao.findAll();
}

public List listShlx(String lxdmvar) {
	// TODO Auto-generated method stub
	String sqlSelect =" select shlxdm,shlxmc,shlxmx from t_shlxsz where  shlxdm like '%"+lxdmvar+"%'";
	 
	return dao.getObjectList(sqlSelect);
}

public boolean chkZczt(String xh) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		String sqlSelect =" select rcbh from t_jcxxx where xh='"+xh+"' and ccrq is  null";
		List list=dao.getObjectList(sqlSelect);
	 if(list.size()>0)
		 b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean addXlfl2(long id,Xlfl2 xlfl2) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TCgsxx cgs= TCgsxxdao.findById(id);
	  xlfl2.setTCgsxx(cgs);
	   xlfl2dao.save(xlfl2);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delXlfl2(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		xlfl2dao.delete(loadXlfl2ById(id));
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editXlfl2(Xlfl2 xlfl2) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		xlfl2dao.merge(xlfl2);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listXlfl2ByGsid(long gsid) {
	// TODO Auto-generated method stub
	
	String sqlSelect =" select id,gsid,lx,bjmc,xlff,c,k,xlmx,gs,clf from xlfl2 where gsid ="+gsid+"";

	return dao.getObjectList(sqlSelect);
}

public Xlfl2 loadXlfl2ById(long id) {
	// TODO Auto-generated method stub
	
	return xlfl2dao.findById(id);
}

public List listGjd2(String bh) {
	// TODO Auto-generated method stub
String sqlSelect =" select id,lx,wzdm,shlx,xlff,xlmx,bjmc,c,k,sl,gs,gsf,clf,fff,lrr,lrsj from zcgjd2 where rcbh = '"+bh+"' order by id asc";
	
	return dao.getObjectList(sqlSelect);
}

public boolean addZcgjd2(String bh, Zcgjd2 gjd2) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TJcxxx jc=TJcxxxdao.findById(bh);
		gjd2.setTJcxxx(jc);
		zcgjd2dao.save(gjd2);
		
		dao.executeSql("delete from t_sum where rcbh='"+jc.getRcbh()+"'");
		List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+jc.getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+jc.getRcbh()+"' group by fff) a group by fff order by fff");
		Iterator it=sumlist.iterator();
		for(;it.hasNext();){
			Map map =(Map)it.next();
			List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+jc.getRcbh()+"'");
		if(s.size()>0){
			Map sm=(Map)s.get(0);
			TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.attachDirty(sum);
		}
		else{
			TSum sum=new TSum();
			sum.setTJcxxx(jc);
			sum.setFff(map.get("fff").toString());
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.save(sum);
		}
		}
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public Zcgjd2 loadGjd2ById(long id) {
	// TODO Auto-generated method stub
	return zcgjd2dao.findById(id);
}

public boolean editGjd2(Zcgjd2 gjd2) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	zcgjd2dao.getHibernateTemplate().saveOrUpdate(gjd2);
	 zcgjd2dao.getHibernateTemplate().flush();
	 
	TJcxxx jc=gjd2.getTJcxxx();
	dao.executeSql("delete from t_sum where rcbh='"+jc.getRcbh()+"'");
	List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+jc.getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+jc.getRcbh()+"' group by fff) a group by fff order by fff");
	Iterator it=sumlist.iterator();
	for(;it.hasNext();){
		Map map =(Map)it.next();
		List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+jc.getRcbh()+"'");
	if(s.size()>0){
		Map sm=(Map)s.get(0);
		TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
		sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
		sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
		sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
		sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
		TSumdao.attachDirty(sum);
	}
	else{
		TSum sum=new TSum();
		sum.setTJcxxx(jc);
		sum.setFff(map.get("fff").toString());
		sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
		sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
		sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
		sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
		TSumdao.save(sum);
	}
	}
	b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delGjd2(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		Zcgjd2 gjd2= loadGjd2ById(id);
		TJcxxx jc=gjd2.getTJcxxx();
	 dao.executeSql("delete from zcgjd2 where id="+id);
	 dao.executeSql("delete from t_sum where rcbh='"+jc.getRcbh()+"'");
		List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+jc.getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+jc.getRcbh()+"' group by fff) a group by fff order by fff");
		Iterator it=sumlist.iterator();
		for(;it.hasNext();){
			Map map =(Map)it.next();
			List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+jc.getRcbh()+"'");
		if(s.size()>0){
			Map sm=(Map)s.get(0);
			TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.attachDirty(sum);
		}
		else{
			TSum sum=new TSum();
			sum.setTJcxxx(jc);
			sum.setFff(map.get("fff").toString());
			sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
			sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
			sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
			sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
			TSumdao.save(sum);
		}
		}
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return  b;
}

public List listBjmc(String bh,String xlff,String bjmc) {
	// TODO Auto-generated method stub
String sqlSelect =" select distinct a.bjmc from xlfl2 a , t_jcxxx b  ,t_cgsxx c  where b.cgs=c.gsdm and c.gsid=a.gsid and b.rcbh ='"+bh+"' and a.xlff='"+xlff+"' and a.bjmc like '"+bjmc+"%' order by a.id ";

	return dao.getObjectList(sqlSelect);
}

public List listXlff(String bh, String xlff) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct a.xlff from xlfl2 a , t_jcxxx b  ,t_cgsxx c  where b.cgs=c.gsdm and c.gsid=a.gsid and b.rcbh ='"+bh+"' and a.xlff like '"+xlff+"%' order by a.id";
	return dao.getObjectList(sqlSelect);
}

public List listC(String bh, String bjmc, String xlff, String c) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct a.c from xlfl2 a , t_jcxxx b  ,t_cgsxx c  where b.cgs=c.gsdm and c.gsid=a.gsid and b.rcbh ='"+bh+"' and a.bjmc = '"+bjmc+"' and a.xlff = '"+xlff+"' and a.c like '"+c+"%' order by a.c";
	
	return dao.getObjectList(sqlSelect);
}

public List listK(String bh, String bjmc, String xlff, String c, String k) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct a.k from xlfl2 a , t_jcxxx b  ,t_cgsxx c  where b.cgs=c.gsdm and c.gsid=a.gsid and b.rcbh ='"+bh+"' and a.bjmc = '"+bjmc+"' and a.xlff = '"+xlff+"' and a.c = '"+c+"' and a.k like '"+k+"%' order by a.k";
	return dao.getObjectList(sqlSelect);
}

public List listLx(String bh, String bjmc, String xlff, String c, String k,
		String lx) {
	// TODO Auto-generated method stub
	String sqlSelect =" select  a.lx,a.gs,a.clf,c.gsfl,a.gs*c.gsfl gsf,a.xlmx from xlfl2 a , t_jcxxx b  ,t_cgsxx c  where b.cgs=c.gsdm and c.gsid=a.gsid and b.rcbh ='"+bh+"' and a.bjmc = '"+bjmc+"' and a.xlff = '"+xlff+"' and a.c = '"+c+"' and a.k = '"+k+"' and a.lx like '"+lx+"%' order by a.id";
	
	return dao.getObjectList(sqlSelect);
}

public JasperPrint getGjdJaspers(String realpath, String rcbh, String chk) {
	// TODO Auto-generated method stub
	String sqlplus="";
	boolean c=false;
	boolean u=false;
	boolean o=false;
	boolean w=false;
	String pname="reports//gjds.jasper";
	String[] arr=chk.split(",");
	for(int i=0;i<arr.length;i++){
		if(i==0)
		{
		if(!arr[i].trim().equals(""))
		sqlplus="b.fff='"+arr[i]+"'";
		}
		else
			sqlplus=sqlplus+" or b.fff='"+arr[i]+"'";	
	}
	if(sqlplus.length()>0)
	sqlplus=" and ("+sqlplus+")";
	String sqlSelect ="SELECT a.`xh`,a.`cc`,a.`xx`,a.zdbh,a.`zzrq`,a.`cgs`,a.jcrq,a.tdh,c.`llxdh`,c.`lcz`,c.`lemail`, b.wzdm,b.shlx,b.`xlff`,(CASE  when b.`bjmc`in ( 'TSR','BSR','DHD','FIR','FBR','DSL') then 'RLA' when b.`bjmc`in ( 'DLA') then 'LBA' when b.`bjmc`in ('RCC') then 'DRT' when b.`bjmc`in ('HPI') then 'HGP' when b.`bjmc`in ('CMU') then 'CMA' when b.`bjmc`in ('HGH','CDH') then 'HGB' when b.`bjmc`in ('CPS') then 'CPA' when b.`bjmc`in ('FLT') then 'FLW' when b.`bjmc`in ('MOC') then 'MSD' when b.`bjmc`in ('PAT','PAS','PAF','PAD') then 'PSC' when b.`bjmc`in ('SCU') then 'FWA' when b.`bjmc`in ('TNF','TNT') then 'TNA' when b.`bjmc`in ('TIF') then 'TIC' ELSE b.`bjmc`END) `bjmc`,b.`c`,b.`k`,if(b.`lx` REGEXP '^[0-9]+$',(SELECT CAST(b.`lx` AS SIGNED)),b.`sl`) `sl`,b.`gs`,b.gsf,b.clf,(b.gsf+b.clf)as hj,b.`fff`,b.xlmx,c.`lywmc`,c.lgsdz,c.hblx,(select ifnull(sum(gs),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='C') as cxs,(select ifnull(sum(gs),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='U') as uxs,(select ifnull(sum(gs),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='O') as oxs,(select ifnull(sum(gs),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='W') as wxs,(select ifnull(sum(gsf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='C') as cgsf,(select ifnull(sum(gsf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='U') as ugsf,(select ifnull(sum(gsf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='O') as ogsf,(select ifnull(sum(gsf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='W') as wgsf,(select IFNULL(sum(clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='C') as cclf,(select IFNULL(sum(clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='U') as uclf,(select IFNULL(sum(clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='O') as oclf,(select IFNULL(sum(clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='W') as wclf,(select ifnull(sum(gsf+clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='C') as chj,(select ifnull(sum(gsf+clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='U') as uhj,(select ifnull(sum(gsf+clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='O') as ohj,(select ifnull(sum(gsf+clf),0)  from zcgjd2 where rcbh='"+rcbh+"' and fff='W') as whj FROM `t_jcxxx` a,`zcgjd2` b,`t_cgsxx` c  WHERE a.rcbh = '"+rcbh+"' and a.cgs = c.gsdm and b.rcbh = a.rcbh "+sqlplus+" order by b.id";
 System.out.println(sqlSelect);
	Collection rows = dao.getObjectList(sqlSelect); 
Iterator it=rows.iterator();
for(;it.hasNext();){
	Map map=(Map)it.next();
	if(Float.parseFloat(map.get("chj").toString())>0)
		c=true;
	if(Float.parseFloat(map.get("uhj").toString())>0)
		u=true;
	if(Float.parseFloat(map.get("ohj").toString())>0)
		o=true;
	if(Float.parseFloat(map.get("whj").toString())>0)
		w=true;
}
	if(chk.trim().equals("C,U,")&&c&&u)
		  pname="reports//gjds2.jasper";
	  else if(chk.trim().equals("C,O,")&&c&&o)
		  pname="reports//gjds3.jasper";
	  else if(chk.trim().equals("C,W,")&&c&&w)
		  pname="reports//gjds4.jasper";
	  else if(chk.trim().equals("U,O,")&&u&&o)
		  pname="reports//gjds5.jasper";
	  else if(chk.trim().equals("U,W,")&&u&&w)
		  pname="reports//gjds6.jasper";
	  else if(chk.trim().equals("O,W,")&&o&&w)
		  pname="reports//gjds7.jasper";
	  else if(chk.trim().equals("C,U,O,")){
		  if(c&&u&&o){
		  pname="reports//gjds8.jasper";
		  }else if(c&&u){
			  pname="reports//gjds2.jasper";  
		  }else if(c&&o){
			  pname="reports//gjds3.jasper"; 
		  }else if(u&&o){
			  pname="reports//gjds5.jasper"; 
		  }
		  
	  }
	  else if(chk.trim().equals("C,U,W,")){
		  if(c&&u&&w){
		  pname="reports//gjds9.jasper";
		  }else if(c&&u){
			  pname="reports//gjds2.jasper";    
		  }else if(c&&w){
			  pname="reports//gjds4.jasper";    
		  }else if(u&&w){
			  pname="reports//gjds6.jasper";    
		  }
		  }
	  else if(chk.trim().equals("C,O,W,")){
		  if(c&&o&&w)
		  pname="reports//gjds10.jasper";
		  else if(c&&o)
			  pname="reports//gjds3.jasper";
		  else if(c&&w)
			  pname="reports//gjds4.jasper";
		  else if(o&&w)
			  pname="reports//gjds7.jasper";
	  }
	  else if(chk.trim().equals("U,O,W,")){
		  if(u&&o&&w)
		  pname="reports//gjds11.jasper";
		  else if(u&&o)  
			  pname="reports//gjds5.jasper";
		  else if(u&&w)
			  pname="reports//gjds6.jasper";
		  else if(o&&w)
			  pname="reports//gjds7.jasper";
	  }
	  else if(chk.trim().equals("C,U,O,W,")){
		  if(c&&u&&o&&w)
		  pname="reports//gjds12.jasper";
		  else if(c&&u&&o)
			  pname="reports//gjds8.jasper";
		  else if(c&&u&&w)
			  pname="reports//gjds9.jasper";
		  else if(c&&o&&w)
			  pname="reports//gjds10.jasper";
		  else if(u&&o&&w)
			  pname="reports//gjds11.jasper";
		  else if(c&&u)
			  pname="reports//gjds2.jasper";
		  else if(c&&o)
			  pname="reports//gjds3.jasper";
		  else if(c&&w)
			  pname="reports//gjds4.jasper";
		  else if(u&&o)
			  pname="reports//gjds5.jasper";
		  else if(u&&w)
			  pname="reports//gjds6.jasper";
		  else if(o&&w)
			  pname="reports//gjds7.jasper";
		  }

     JasperPrint jasperPrint = setReportCollection(realpath+ pname, rows);   
     return jasperPrint;   
}

public List listFpdcByRcbh(String rcbh) {
	// TODO Auto-generated method stub
	
	String sqlSelect =" select id,zzrq,dcfl from t_fpdc where rcbh ='"+rcbh+"' and dcfl>0 order by zzrq";
	return dao.getObjectList(sqlSelect);
}

public boolean addFpdc(TFpdc fpdc) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	TFpdcdao.save(fpdc);
	b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delFpdc(String rcbh) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
 dao.executeSql("delete from t_fpdc where rcbh='"+rcbh+"'");
	b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}


public  float listDcfByJcId(String rcbh) {
	// TODO Auto-generated method stub
	float dcfl=0f;
	String sqlSelect ="select dcfl from t_dcfl a,t_cgsxx b,t_jcxxx c where a.gsid=b.gsid and b.gsdm=c.cgs and c.rcbh='"+rcbh+"' and c.cc=a.cc and a.xx=c.xx";
	List list=dao.getObjectList(sqlSelect);
	Iterator it=list.iterator();
	if(it.hasNext()){
		Map map=(Map)it.next();
	dcfl=Float.parseFloat(map.get("dcfl").toString());	
	}
	return dcfl;
}

public float getQdf(String cgs, String cc, String xx) {
	// TODO Auto-generated method stub
	float qdf=0f;
	String sqlSelect ="select a.qdf from t_dcfl a,t_cgsxx b where a.gsid=b.gsid and  b.gsdm='"+cgs+"' and a.cc='"+cc+"' and a.xx ='"+xx+"'";
	List list=dao.getObjectList(sqlSelect);
	Iterator it=list.iterator();
	if(it.hasNext()){
		Map map=(Map)it.next();
	qdf=Float.parseFloat(map.get("qdf").toString());	
	}
	
	return qdf;
}

public float getTyf(String cgs, String cc, String xx) {
	// TODO Auto-generated method stub
	float tyf=0f;
	String sqlSelect ="select a.tyf from t_dcfl a,t_cgsxx b where a.gsid=b.gsid and  b.gsdm='"+cgs+"' and a.cc='"+cc+"' and a.xx ='"+xx+"'";
	List list=dao.getObjectList(sqlSelect);
	Iterator it=list.iterator();
	if(it.hasNext()){
		Map map=(Map)it.next();
	tyf=Float.parseFloat(map.get("tyf").toString());	
	}
	
	return tyf;
}

public float getDcf(String rcbh,Date ccrq) {
	// TODO Auto-generated method stub
	float dcf=0f;
	TJcxxx jc=TJcxxxdao.findById(rcbh);
	float dcfl=0f;
	float bgdcf=0f;
	float fee=0f;
	Date qssj=jc.getJcrq();
 
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");         
	Date d=jc.getJcrq();
	String sqlSelect ="select ifnull(a.dcfl,0) dcfl,ifnull(a.bgdcf,0) bgdcf from t_dcfl a,t_cgsxx b where a.gsid=b.gsid and  b.gsdm='"+jc.getCgs()+"' and a.cc='"+jc.getCc()+"' and a.xx ='"+jc.getXx()+"'";
	List list=dao.getObjectList(sqlSelect);
	Iterator it=list.iterator();
	if(it.hasNext()){
		Map map=(Map)it.next();

	dcfl=Float.parseFloat(map.get("dcfl").toString());	
	bgdcf=Float.parseFloat(map.get("bgdcf").toString());	
	}
	if(bgdcf>0)
		dcf=bgdcf;
	else
	{sqlSelect ="select zzrq,dcfl from t_fpdc where rcbh='"+rcbh+"' order by zzrq";
list=dao.getObjectList(sqlSelect);
it=list.iterator();
for(;it.hasNext();)
{
	Map map=(Map)it.next();
	try{
	 d=format.parse(map.get("zzrq").toString());
	}catch(Exception e){
		e.printStackTrace();
	}
	fee=fee+((d.getDate()-qssj.getDate())+1)*Float.parseFloat(map.get("dcfl").toString());
	qssj=d;
}
 
fee=fee+(ccrq.getDate()-d.getDate()+1)* dcfl;
		
	}
	return fee;
}

public boolean chkCgs(String cgs) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		String sqlSelect ="select gsdm from t_cgsxx where gsdm='"+cgs+"'";
		List list=dao.getObjectList(sqlSelect);
		if(list.size()>0)
			b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean chkXx(String xx) {
	// TODO Auto-generated method stub
	boolean b=false;
try{
	String sqlSelect ="select xxdm from t_xxxx where xxdm='"+xx+"'";
	List list=dao.getObjectList(sqlSelect);
	if(list.size()>0)
		b=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public String getLx(String rcbh) {
	// TODO Auto-generated method stub
	String lx=null;
	String sqlSelect ="select a.fllx from t_cgsxx a,t_jcxxx b where a.gsdm=b.cgs and b.rcbh='"+rcbh+"'";
	List list=dao.getObjectList(sqlSelect);
	if(list.size()>0){
		Iterator it=list.iterator();
		if(it.hasNext()){
			Map map=(Map)it.next();
		if(null!=map.get("fllx"))
			lx=map.get("fllx").toString();
	 
			
		}
	}
	return lx;
}

public boolean addXxl(TXxl xxl) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TXxldao.save(xxl);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delXxl(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	TXxl xxl=	TXxldao.findById(id);
	TXxldao.delete(xxl);
	
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editXxl(TXxl xxl) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
 
		TXxldao.merge(xxl);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public TXxl loadXxl(long id) {
	// TODO Auto-generated method stub
	return TXxldao.findById(id);
}

public List listAllXxl() {
	// TODO Auto-generated method stub
	return TXxldao.findAll();
}

public boolean addWzdm(TWzdm wzdm) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
 TWzdmdao.save(wzdm);
 b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean delWzdm(long id) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
 TWzdm wzdm=TWzdmdao.findById(id);
 TWzdmdao.delete(wzdm);
 b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public boolean editWzdm(TWzdm wzdm) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
 TWzdmdao.merge(wzdm);
 b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listAllWzdm() {
	// TODO Auto-generated method stub
	return TWzdmdao.findAll();
}

public TWzdm loadWzdm(long id) {
	// TODO Auto-generated method stub
	
	return TWzdmdao.findById(id);
}

public List listXxl(String xxl) {
	// TODO Auto-generated method stub
String sqlSelect =" select xxl,mx from t_xxl where xxl like '"+xxl+"%' order by xxl";
 
	return dao.getObjectList(sqlSelect);
}

public List listXlfl2(long gsid, long start, long limit, String sort, String dir,String sql) {
	// TODO Auto-generated method stub
	String sqlSelect="";
	if(sql.length()>0)
		sql=" and "+sql;
	
	if(null!=sort&&null!=dir)
sqlSelect =" select id,gsid,lx,bjmc,xlff,c,k,xlmx,gs,clf from xlfl2  where gsid ="+gsid+sql+" order by "+ sort+" "+dir;
	else
sqlSelect =" select id,gsid,lx,bjmc,xlff,c,k,xlmx,gs,clf from xlfl2  where gsid ="+gsid+sql+" order by id desc ";

	sqlSelect =sqlSelect +" limit "+start+","+limit;
 
	return dao.getObjectList(sqlSelect);
}

public long sumxlfl2(long gsid,String sql) {
	// TODO Auto-generated method stub
long sl=0l;
if(sql.length()>0)
	sql=" and "+sql;
	String sqlSelect =" select count(id) sl from xlfl2 where gsid ="+gsid+sql;
	
	List list =dao.getObjectList(sqlSelect);
 Iterator it=list.iterator();
 if(it.hasNext())
 { Map map=(Map)it.next();
 sl=Long.parseLong(map.get("sl").toString());
 }
	return sl;
}

public List listXlfl(long gsid, long start, long limit, String sort, String dir,String sql) {
	// TODO Auto-generated method stub
	String sqlSelect="";
	if(sql.length()>0)
		sql=" and "+sql;
	if(null!=sort&&null!=dir)
sqlSelect =" select id,gsid,shdm,shmx,gs,clf from t_xlfl where gsid ="+gsid+sql+" order by "+ sort+" "+dir+" limit "+start+","+limit;
	else
sqlSelect =" select id,gsid,shdm,shmx,gs,clf from t_xlfl where gsid ="+gsid+sql+" order by id desc limit "+start+","+limit;

	System.out.println(sqlSelect); 
 
	return dao.getObjectList(sqlSelect);
}

public long sumxlfl(long gsid,String sql) {
	// TODO Auto-generated method stub
	long sl=0l;
	if(sql.length()>0)
		sql=" and "+sql;
	String sqlSelect =" select count(id) sl from t_xlfl where gsid ="+gsid+sql ;

	 
	List list =dao.getObjectList(sqlSelect);
 Iterator it=list.iterator();
 if(it.hasNext())
 { Map map=(Map)it.next();
 sl=Long.parseLong(map.get("sl").toString());
 }
	return sl;
}

public List listSh(String shdm, String cgs) {
	// TODO Auto-generated method stub
	String sqlSelect =" select a.shdm,a.shmx,a.gs,c.gsfl as gsfl,a.clf from t_xlfl a,t_cgsxx c where   c.gsdm='"+cgs+"' and a.gsid =c.gsid   and  a.shdm like '%"+shdm+"%' order by a.shdm";
 
	return dao.getObjectList(sqlSelect);
}

public List listShwz(String shwz) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct wzdm from t_wzdm where wzdm like '"+shwz+"%' order by wzdm";
	 
	return dao.getObjectList(sqlSelect);
}

public List listBj(String bjmc, String cgs,String xlff) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct a.bjmc from xlfl2 a   ,t_cgsxx c  where c.gsid=a.gsid and c.gsdm='"+cgs+"' and a.xlff='"+xlff+"' and a.bjmc like '"+bjmc+"%' order by a.bjmc ";
 
	return dao.getObjectList(sqlSelect);
}

public List listXlff1(String cgs,  String xlff) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct a.xlff from xlfl2 a ,t_cgsxx c  where   c.gsid=a.gsid and c.gsdm ='"+cgs+"' and a.xlff like '"+xlff+"%' order by a.xlff";
	return dao.getObjectList(sqlSelect);
}

public List listC1(String cgs, String bjmc, String xlff, String c) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct a.c from xlfl2 a ,t_cgsxx c  where  c.gsid=a.gsid  and c.gsdm='"+cgs+"' and a.bjmc = '"+bjmc+"' and a.xlff = '"+xlff+"' and a.c like '"+c+"%' order by a.c";
	
	return dao.getObjectList(sqlSelect);
}

public List listK1(String cgs, String bjmc, String xlff, String c, String k) {
	// TODO Auto-generated method stub
	String sqlSelect =" select distinct a.k from xlfl2 a ,t_cgsxx c  where  c.gsid=a.gsid and c.gsdm='"+cgs+"' and a.bjmc  = '"+bjmc+"' and a.xlff  ='"+xlff+"' and a.c = '"+c+"' and a.k like '"+k+"%' order by a.k";
	return dao.getObjectList(sqlSelect);
}

public List listLx1(String cgs, String bjmc, String xlff, String c, String k,
		String lx) {
	// TODO Auto-generated method stub
	String sqlSelect =" select  a.lx,a.gs,a.clf,c.gsfl,a.gs*c.gsfl gsf,a.xlmx from xlfl2 a  ,t_cgsxx c  where   c.gsid=a.gsid and c.gsdm='"+cgs+"' and a.bjmc = '"+bjmc+"' and a.xlff = '"+xlff+"' and a.c = '"+c+"' and a.k = '"+k+"' and a.lx like '"+lx+"%' order by a.lx";
	return dao.getObjectList(sqlSelect);
}

public TCgsxx loadCgs(String gsdm) {
	// TODO Auto-generated method stub
	
	List list= TCgsxxdao.findByGsdm(gsdm);
	TCgsxx cgs=new TCgsxx();
	Iterator it=list.iterator();
	if(it.hasNext())
	{cgs=(TCgsxx)it.next();
		
	}
	return cgs;
}

public String getBsm() {
	// TODO Auto-generated method stub
	String bsm="";
	String sqlSelect="select max(id) id from seq";
	
	List list=dao.getObjectList(sqlSelect);
	Iterator it=list.iterator();
	if(it.hasNext())
		{Map map=(Map)it.next();
		bsm="80"+String.format("%09d", Integer.parseInt(map.get("id").toString()));
		}
	 return bsm;
}

public void addBsm() {
	// TODO Auto-generated method stub
	String sqlSelect ="insert into seq select NULL";
	dao.executeSql(sqlSelect);
}

public boolean delJc(String s) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		String insertSql="delete from t_jcxxx where rcbh in ("+s+")";
		dao.executeSql(insertSql);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}

public List listJc(long start, long limit, String sort, String dir, String sql) {
	// TODO Auto-generated method stub
	String sqlSelect="";

	if(sql.length()>0)
		sql=" where "+sql;
	 
		if(null!=sort&&null!=dir)
			
		//	sqlSelect ="select a.rcbh,a.bz,ifnull((datediff(a.ccrq,a.jcrq)+1),(datediff(curdate(),a.jcrq)+1)) as ts,a.cgs,a.xh,a.cc,a.xx,a.xxl,a.jczt,a.tyf,a.dcf,a.qdf,a.zzrq,a.jctc,a.tdh,a.lxd,a.jcwz,a.wzmx,a.eirlsh,a.zgd,a.zdbh,a.sfbf,ifnull(a.zygr,'') zygr,a.jcrq,a.qrrq,a.wgrq,a.ccrq,a.jzrq,a.llr,a.llrq,ifnull(b.gs,0) gs,ifnull(b.gsf,0) gsf,ifnull(b.clf,0) clf,ifnull(b.hj,0) hj,c.fllx,c.hblx,c.xz from t_jcxxx a left join (select rcbh, ifnull(sum(gs),0) as gs,ifnull(sum(gsf),0) as gsf,ifnull(sum(clf),0) as clf,ifnull(sum(gsf+clf),0) as hj from v_gjd group by rcbh) b on a.rcbh=b.rcbh left join t_cgsxx c  on c.gsdm=a.cgs   "+sql+" order by "+ sort+" "+dir;
	if(sql.indexOf("fff")>-1)
		sqlSelect="select  a.rcbh,bz,ifnull((datediff(ccrq,jcrq)+1),(datediff(curdate(),jcrq)+1)) as ts,cgs,xh,cc,xx,xxl,jczt,tyf,dcf,qdf,zzrq,jctc,tdh,lxd,jcwz,wzmx,eirlsh,zgd,zdbh,sfbf,ifnull(zygr,'') zygr,ifnull(DATE_FORMAT(jcrq,'%y-%m-%d %H:%i'),'') jcrq,ifnull(DATE_FORMAT(fsrq,'%y-%m-%d %H:%i'),'') fsrq, ifnull(DATE_FORMAT(qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(llrq,'%y-%m-%d %H:%i'),'') llrq,  ifnull(gs,0) gs,  ifnull(gsf,0) gsf,  ifnull(clf,0) clf,ifnull(hj,0) hj,fl_type,cur_type,box_owner from t_jcxxx a left join (select rcbh, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj  from t_sum  group by rcbh) b on a.rcbh=b.rcbh " +sql+"  order by "+ sort+" "+dir +" limit "+start+","+limit ;

	else
			sqlSelect="select  a.rcbh,bz,ifnull((datediff(ccrq,jcrq)+1),(datediff(curdate(),jcrq)+1)) as ts,cgs,xh,cc,xx,xxl,jczt,tyf,dcf,qdf,zzrq,jctc,tdh,lxd,jcwz,wzmx,eirlsh,zgd,zdbh,sfbf,ifnull(zygr,'') zygr,ifnull(DATE_FORMAT(jcrq,'%y-%m-%d %H:%i'),'') jcrq,ifnull(DATE_FORMAT(fsrq,'%y-%m-%d %H:%i'),'') fsrq, ifnull(DATE_FORMAT(qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(llrq,'%y-%m-%d %H:%i'),'') llrq,  ifnull(gs,0) gs,  ifnull(gsf,0) gsf,  ifnull(clf,0) clf,ifnull(hj,0) hj,fl_type,cur_type,box_owner from (select * from t_jcxxx "+sql+"  order by "+ sort+" "+dir +" limit "+start+","+limit+") a left join (select rcbh, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj  from t_sum group by rcbh) b on a.rcbh=b.rcbh "  ;
 				
	 
	 System.out.println(sqlSelect);

	return dao.getObjectList(sqlSelect);
}

public long sumJc(String sql) {
	// TODO Auto-generated method stub
	
	long sl=0l;
	String sqlSelect="";
 
	if(sql.indexOf("fff")>-1)
		sqlSelect="select  a.rcbh,bz,ifnull((datediff(ccrq,jcrq)+1),(datediff(curdate(),jcrq)+1)) as ts,cgs,xh,cc,xx,xxl,jczt,tyf,dcf,qdf,zzrq,jctc,tdh,lxd,jcwz,wzmx,eirlsh,zgd,zdbh,sfbf,ifnull(zygr,'') zygr,ifnull(DATE_FORMAT(jcrq,'%y-%m-%d %H:%i'),'') jcrq, ifnull(DATE_FORMAT(qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(llrq,'%y-%m-%d %H:%i'),'') llrq,  ifnull(gs,0) gs,  ifnull(gsf,0) gsf,  ifnull(clf,0) clf,ifnull(hj,0) hj,fl_type,cur_type,box_owner from t_jcxxx a left join (select rcbh, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj  from t_sum group by rcbh) b on a.rcbh=b.rcbh " +sql ;

	else
			sqlSelect="select   * from   t_jcxxx a "+sql+" "  ;
 System.out.println(sqlSelect);
		List list =dao.getObjectList(sqlSelect);
	 sl=list.size();
		return sl;
}

public List listJc(String sql) {
	// TODO Auto-generated method stub
	if(sql.length()>0)
		sql=" where "+sql;
	String sqlSelect="";
//	String sqlSelect =" select a.rcbh from t_jcxxx a  left join t_cgsxx c  on c.gsdm=a.cgs  left join    t_zcgjd b on b.rcbh=a.rcbh left join zcgjd2 d on d.rcbh=a.rcbh "+sql+"  group by a.rcbh  order by a.rcbh desc";
	if(sql.indexOf("b.")>-1||sql.indexOf("c.")>-1)
	{
	 
		//	sqlSelect ="select a.rcbh,a.bz,ifnull((datediff(a.ccrq,a.jcrq)+1),(datediff(curdate(),a.jcrq)+1)) as ts,a.cgs,a.xh,a.cc,a.xx,a.xxl,a.jczt,a.tyf,a.dcf,a.qdf,a.zzrq,a.jctc,a.tdh,a.lxd,a.jcwz,a.wzmx,a.eirlsh,a.zgd,a.zdbh,a.sfbf,ifnull(a.zygr,'') zygr,a.jcrq,a.qrrq,a.wgrq,a.ccrq,a.jzrq,a.llr,a.llrq,ifnull(b.gs,0) gs,ifnull(b.gsf,0) gsf,ifnull(b.clf,0) clf,ifnull(b.hj,0) hj,c.fllx,c.hblx,c.xz from t_jcxxx a left join (select rcbh, ifnull(sum(gs),0) as gs,ifnull(sum(gsf),0) as gsf,ifnull(sum(clf),0) as clf,ifnull(sum(gsf+clf),0) as hj from v_gjd group by rcbh) b on a.rcbh=b.rcbh left join t_cgsxx c  on c.gsdm=a.cgs   "+sql+" order by "+ sort+" "+dir;
	sqlSelect="select rcbh from (select a.rcbh,a.bz,ifnull((datediff(a.ccrq,a.jcrq)+1),(datediff(curdate(),a.jcrq)+1)) as ts,a.cgs,a.xh,a.cc,a.xx,a.xxl,a.jczt,a.tyf,a.dcf,a.qdf,a.zzrq,a.jctc,a.tdh,a.lxd,a.jcwz,a.wzmx,a.eirlsh,a.zgd,a.zdbh,a.sfbf,ifnull(a.zygr,'') zygr,ifnull(DATE_FORMAT(a.jcrq,'%y-%m-%d %H:%i'),'') jcrq, ifnull(DATE_FORMAT(a.qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(a.wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(a.ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(a.jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(a.llrq,'%y-%m-%d %H:%i'),'') llrq,ifnull(sum(b.xs),0)+ifnull(sum(d.gs),0) gs,ifnull(sum(b.gsf),0)+ifnull(sum(d.gsf),0) gsf,ifnull(sum(b.clf),0)+ifnull(sum(d.clf),0) clf,ifnull(sum(b.gsf+b.clf),0)+ifnull(sum(d.gsf+d.clf),0) hj,a.fllx,a.hblx,a.xz from (select * from t_jcxxx a  left join t_cgsxx c  on c.gsdm=a.cgs ) a     left join    t_zcgjd b on b.rcbh=a.rcbh left join zcgjd2 d on d.rcbh=a.rcbh group by a.rcbh) b " +sql+" order by rcbh desc"  ;
		 
	}
	else{
		 
			sqlSelect="select rcbh  from (select a.rcbh,a.bz,ifnull((datediff(a.ccrq,a.jcrq)+1),(datediff(curdate(),a.jcrq)+1)) as ts,a.cgs,a.xh,a.cc,a.xx,a.xxl,a.jczt,a.tyf,a.dcf,a.qdf,a.zzrq,a.jctc,a.tdh,a.lxd,a.jcwz,a.wzmx,a.eirlsh,a.zgd,a.zdbh,a.sfbf,ifnull(a.zygr,'') zygr,ifnull(DATE_FORMAT(a.jcrq,'%y-%m-%d %H:%i'),'') jcrq, ifnull(DATE_FORMAT(a.qrrq,'%y-%m-%d %H:%i'),'') qrrq,ifnull(DATE_FORMAT(a.wgrq,'%y-%m-%d %H:%i'),'') wgrq,ifnull(DATE_FORMAT(a.ccrq,'%y-%m-%d %H:%i'),'') ccrq,ifnull(DATE_FORMAT(a.jzrq,'%y-%m-%d %H:%i'),'') jzrq,a.llr,ifnull(DATE_FORMAT(a.llrq,'%y-%m-%d %H:%i'),'') llrq,ifnull(sum(b.xs),0)+ifnull(sum(d.gs),0) gs,ifnull(sum(b.gsf),0)+ifnull(sum(d.gsf),0) gsf,ifnull(sum(b.clf),0)+ifnull(sum(d.clf),0) clf,ifnull(sum(b.gsf+b.clf),0)+ifnull(sum(d.gsf+d.clf),0) hj,a.fllx,a.hblx,a.xz from (select * from t_jcxxx a left join t_cgsxx c  on c.gsdm=a.cgs  "+sql+" ) a  left join    t_zcgjd b on b.rcbh=a.rcbh left join zcgjd2 d on d.rcbh=a.rcbh group by a.rcbh) b" +" order by rcbh desc";
		//	sqlSelect ="select a.rcbh,a.bz,ifnull((datediff(a.ccrq,a.jcrq)+1),(datediff(curdate(),a.jcrq)+1)) as ts,a.cgs,a.xh,a.cc,a.xx,a.xxl,a.jczt,a.tyf,a.dcf,a.qdf,a.zzrq,a.jctc,a.tdh,a.lxd,a.jcwz,a.wzmx,a.eirlsh,a.zgd,a.zdbh,a.sfbf,ifnull(a.zygr,'') zygr,a.jcrq,a.qrrq,a.wgrq,a.ccrq,a.jzrq,a.llr,a.llrq,ifnull(b.gs,0) gs,ifnull(b.gsf,0) gsf,ifnull(b.clf,0) clf,ifnull(b.hj,0) hj,c.fllx,c.hblx,c.xz from (select * from t_jcxxx a "+sql+" order by "+ sort+" "+dir+" limit "+start+","+limit+") a left join (select rcbh, ifnull(sum(gs),0) as gs,ifnull(sum(gsf),0) as gsf,ifnull(sum(clf),0) as clf,ifnull(sum(gsf+clf),0) as hj from v_gjd group by rcbh) b on a.rcbh=b.rcbh left join t_cgsxx c  on c.gsdm=a.cgs   ";
			 
 

	}
		return dao.getObjectList(sqlSelect);
}

public List sumgjd2(String bh) {
	// TODO Auto-generated method stub
	String sqlSelect ="select sum(gs) gs,sum(gsf) gsf,sum(clf) clf  from zcgjd2 where rcbh = '"+bh+"'";
	return dao.getObjectList(sqlSelect);
}

public List sumgjd(String bh) {
	// TODO Auto-generated method stub
	String sqlSelect ="select sum(xs) gs,sum(gsf) gsf,sum(clf) clf  from t_zcgjd where rcbh = '"+bh+"'";
	 
	return dao.getObjectList(sqlSelect);
}

public boolean checkXx(String xx) {
	// TODO Auto-generated method stub
	
	TXxxx xxxx=TXxxxdao.findById(xx.toUpperCase());
	 
	if(xxxx!=null)
		return true;
	else
	return false;
}

public boolean checkCgs(String cgs) {
	// TODO Auto-generated method stub
	List list=TCgsxxdao.findByGsdm(cgs);
	if(list.size()>0)
		return true;
	else
	return false;
}

public boolean checkXxl(String xxl) {
	// TODO Auto-generated method stub

	List list=TXxldao.findByXxl(xxl);
	
	if(list.size()>0)
		return true;
	else
	return false;
}

public long addData(TData data) {
	// TODO Auto-generated method stub
	TDatadao.save(data);
	return data.getDataId();
}
public long addDataDetail(TDataDetail dataDetail) {
	// TODO Auto-generated method stub
	TDataDetaildao.save(dataDetail);
	return dataDetail.getDataDetailId();
}
public boolean delData(long dataId) {
	// TODO Auto-generated method stub
boolean b=false;
try{
	TData data=TDatadao.findById(dataId);
	TDatadao.delete(data);
	b=true;
}catch(Exception e){
	e.printStackTrace();
}
	return b;
}
public boolean delDataDetail(long dataDetailId) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TDataDetail dataDetail=TDataDetaildao.findById(dataDetailId);
		TDataDetaildao.delete(dataDetail);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}
public boolean editData(TData data) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
		TDatadao.attachDirty(data);
		b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}
public boolean editDataDetail(TDataDetail dataDetail) {
	// TODO Auto-generated method stub
	boolean b=false;
	try{
	TDataDetaildao.attachDirty(dataDetail);
	b=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return b;
}
public TData loadData(long dataId) {
	// TODO Auto-generated method stub
	return TDatadao.findById(dataId);
}
public TDataDetail loadDetail(long detailId) {
	// TODO Auto-generated method stub
	return TDataDetaildao.findById(detailId);
}
public List<Map> listDataType(String type) {
	// TODO Auto-generated method stub
	String sqlSelect="select b.data_detail_name from t_data a join t_data_detail b on a.data_id=b.data_id where a.data_type_name='"+type+"' order by b.se_id";
	return dao.getObjectList(sqlSelect);
}

@Override
public void addVar(String insertSql) {
	// TODO Auto-generated method stub
	dao.executeSql(insertSql);	
}

@Override
public List<Map> listVar(String sqlSelect) {
	// TODO Auto-generated method stub
	return dao.getObjectList(sqlSelect);
	 
}

@Override
public long addTSum(TSum sum) {
	// TODO Auto-generated method stub
	TSumdao.save(sum);
	return sum.getId();
}

@Override
public boolean editTSum(TSum sum) {
	// TODO Auto-generated method stub
boolean b=false;
try{
	TSumdao.attachDirty(sum);
	b=true;
}catch(Exception e){
	e.printStackTrace();
}
	return b;
}

@Override
public TSum loadTSum(long id) {
	// TODO Auto-generated method stub
	return TSumdao.findById(id);
}

@Override
public long addGjd(TZcgjd gjd) {
	// TODO Auto-generated method stub
	TZcgjddao.getHibernateTemplate().save(gjd);
	TZcgjddao.getHibernateTemplate().flush();
	List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+gjd.getTJcxxx().getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+gjd.getTJcxxx().getRcbh()+"' group by fff) a group by fff order by fff");
	
	Iterator it=sumlist.iterator();
	for(;it.hasNext();){
		Map map =(Map)it.next();
		List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+gjd.getTJcxxx().getRcbh()+"'");
	if(s.size()>0){
		Map sm=(Map)s.get(0);
		TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
		sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
		sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
		sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
		sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
		TSumdao.attachDirty(sum);
	}
	else{
		TSum sum=new TSum();
		sum.setTJcxxx(gjd.getTJcxxx());
		sum.setFff(map.get("fff").toString());
		sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
		sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
		sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
		sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
		TSumdao.save(sum);
	}
	}
	 
	return gjd.getId();
}

@Override
public long addGjd2(Zcgjd2 gjd2) {
	// TODO Auto-generated method stub
	zcgjd2dao.getHibernateTemplate().save(gjd2);
	zcgjd2dao.getHibernateTemplate().flush();
	List sumlist=dao.getObjectList("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from t_zcgjd where rcbh='"+gjd2.getTJcxxx().getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+gjd2.getTJcxxx().getRcbh()+"' group by fff) a group by fff order by fff");
	
	Iterator it=sumlist.iterator();
	for(;it.hasNext();){
		Map map =(Map)it.next();
		List s=dao.getObjectList("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+gjd2.getTJcxxx().getRcbh()+"'");
	if(s.size()>0){
		Map sm=(Map)s.get(0);
		TSum sum=TSumdao.findById(Long.parseLong(sm.get("id").toString()));
		sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
		sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
		sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
		sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
		TSumdao.attachDirty(sum);
	}
	else{
		TSum sum=new TSum();
		sum.setTJcxxx(gjd2.getTJcxxx());
		sum.setFff(map.get("fff").toString());
		sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
		sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
		sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
		sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
		TSumdao.save(sum);
	}
	}
	return gjd2.getId();
}

}
