package com.cr.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JasperPrint;

import com.cr.domain.TCgsxx;
import com.cr.domain.TData;
import com.cr.domain.TDataDetail;
import com.cr.domain.TDcfl;
import com.cr.domain.TFpdc;
import com.cr.domain.TJcxxx;
import com.cr.domain.TRole;
import com.cr.domain.TShlxsz;
import com.cr.domain.TSum;
import com.cr.domain.TUser;
import com.cr.domain.TWzdm;
import com.cr.domain.TXlfl;
import com.cr.domain.TXxl;
import com.cr.domain.TXxxx;
import com.cr.domain.TZcgjd;
import com.cr.domain.Xlfl2;
import com.cr.domain.Zcgjd2;


public interface MyService {
boolean editUser(TUser user);	
boolean checkPwd(String zh,String mm);
TUser loadUserById(String zh);
boolean addJcxxx(TJcxxx jc);
List listTodayJcxxx();
TJcxxx loadTJcxxxBybh(String bh);
boolean editJcxxx(TJcxxx jc);
boolean delJcxxx(String bh);
List listJcxvar(TJcxxx jc);
String getRcbh();
List listXh(String id);
String getJczt(String cgs);
boolean addZcgjd(String bh,TZcgjd gjd);
List listGjd(String bh);
List listXx(String xxdm);
List listCgs(String gsdm);
List listShdm(String shdm,String bh);
boolean editGjd(TZcgjd gjd);
boolean delGjd(long id);
TZcgjd loadGjdById(long id);
boolean addXx(TXxxx xx);
boolean editXx(TXxxx xx);
boolean delXx(String xxdm);
List listAllXx();
TXxxx loadXxById(String xxdm);
boolean addCgs(TCgsxx cgs);
boolean editCgs(TCgsxx cgs);
boolean delCgs(long id);
TCgsxx loadCgsxxById(long id);
List listAllCgs();
boolean addDcfl(long id,TDcfl dcfl);
boolean editDcfl(TDcfl dcfl);
boolean delDcfl(long id);
List listDcflByGsid(long gsid);
TDcfl loadDcflById(long id);
boolean addXlfl(long id,TXlfl xlfl);
boolean editXlfl(TXlfl xlfl);
boolean delXlfl(long id);
List listXlflByGsid(long id);
TXlfl loadXlflById(long id);
List listDcf(TJcxxx jc);
JasperPrint setReportCollection(String url, Collection list);
JasperPrint getGjdJasper(String realpath,String rcbh,String chk);
List listAllUser();
boolean addUser(TUser user);
boolean delUser(String zh);

boolean findUserByZh(String zh);
boolean addRole(TRole role);
boolean editRole(TRole role);
boolean delRole(long id);
TRole loadRoleById(long id);
List listAllRole();
 List listJsByZh(String zh);
 List listQxByZh(String zh);
 boolean delUserRoleByZh(String zh);
 TRole loadRoleByCaption(String caption);
 boolean editYh(TUser user);
 List listBbcx(TJcxxx jc);
 String findBbSql(TJcxxx jc);
 List listvar(String sql);
 boolean addclonecgs(long id);
 boolean addShlxsz(TShlxsz shlx);
 boolean editShlxsz(TShlxsz shlx);
 boolean delShlxsz(String shlxdm);
 TShlxsz loadShlxByDm(String shlxdm);
 List listAllShlx();
 List listShlx(String lxdmvar);
 boolean chkZczt(String xh);
 boolean addXlfl2(long id,Xlfl2 xlfl2);
 boolean editXlfl2(Xlfl2 xlfl2);
 boolean delXlfl2(long id);
 Xlfl2 loadXlfl2ById(long id);
 List listXlfl2ByGsid(long gsid);
 List listGjd2(String bh);
 boolean addZcgjd2(String bh,Zcgjd2 gjd);
 Zcgjd2 loadGjd2ById(long id);
 boolean editGjd2(Zcgjd2 gjd2);
 boolean delGjd2(long id);
 List listBjmc(String bh,String xlff,String bjmc);
 List listXlff(String bh,String xlff);
 List listC(String bh,String bjmc,String xlff,String c);
 List listK(String bh,String bjmc,String xlff,String c,String k);
 List listLx(String bh,String bjmc,String xlff,String c,String k,String lx);
 public JasperPrint getGjdJaspers(String realpath,String rcbh,String chk);
 List listFpdcByRcbh(String rcbh);
 boolean addFpdc(TFpdc fpdc);
 boolean delFpdc(String rcbh);
 float  listDcfByJcId(String rcbh);
 float getQdf(String cgs,String cc,String xx);
 float getTyf(String cgs,String cc,String xx);
 float getDcf(String rcbh,Date ccrq);
 boolean chkXx(String xx);
 boolean chkCgs(String cgs);
 String getLx(String rcbh);
 boolean addXxl(TXxl xxl);
 boolean editXxl(TXxl xxl);
 boolean delXxl(long id);
 TXxl loadXxl(long id);
 List  listAllXxl();
 boolean addWzdm(TWzdm wzdm);
 boolean editWzdm(TWzdm wzdm);
 boolean delWzdm(long id);
 TWzdm loadWzdm(long id);
 List listAllWzdm();
List listXxl(String xxl);
long sumxlfl2(long gsid,String sql);
List listXlfl2(long gsid,long start,long limit,String sort,String dir,String sql);
long sumxlfl(long gsid,String sql);
List listXlfl(long gsid,long start,long limit,String sort,String dir,String sql);
List listSh(String shdm,String cgs);
List listShwz(String shwz);
List listBj(String bjmc,String cgs,String xlff);
List listXlff1(String cgs,String xlff);
List listC1(String cgs,String bjmc,String xlff,String c);
List listK1(String cgs,String bjmc,String xlff,String c,String k);
List listLx1(String cgs,String bjmc,String xlff,String c,String k,String lx);
TCgsxx loadCgs(String gsdm);
String getBsm();
void addBsm();
boolean delJc(String s);
List listJc(long start,long limit,String sort,String dir,String sql);
long sumJc(String sql);
List listJc(String sql);
List sumgjd2(String bh);
List sumgjd(String bh);
boolean checkXx(String xx);
boolean checkXxl(String xxl);
boolean checkCgs(String cgs);
long addData(TData data);
boolean editData(TData data);
boolean delData(long data_id);
long addDataDetail(TDataDetail dataDetail);
boolean editDataDetail(TDataDetail dataDetail);
boolean delDataDetail(long data_detail_id);
TData loadData(long data_id);
TDataDetail loadDetail(long detail_id);
List<Map> listDataType(String type);
List<Map> listVar(String sqlSelect);
void addVar(String insertSql);
long addTSum(TSum sum);
boolean editTSum(TSum sum);
TSum loadTSum(long id);
long addGjd(TZcgjd gjd);
long addGjd2(Zcgjd2 gjd2);
}
