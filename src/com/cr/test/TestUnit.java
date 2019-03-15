package com.cr.test;


import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cr.domain.TCgsxx;
import com.cr.domain.TJcxxx;
import com.cr.domain.TSum;
import com.cr.service.MyService;

 

public class TestUnit extends  TestCase{
	public ApplicationContext factory=null;
	private static String[] CONFIG_FILES={"/WebRoot/WEB-INF/applicationContext.xml","/WebRoot/WEB-INF/controller_config.xml"};

	@Before
	public void setUp() throws Exception {
		factory=new FileSystemXmlApplicationContext(CONFIG_FILES);
	}

	@After
	public void tearDown() throws Exception {
	}
	public void testInit(){
		MyService myService=(MyService)factory.getBean("myService");
		List list=myService.listvar("select rcbh from t_jcxxx where llrq>='2012-1-1' and llrq<'2012-6-1'");
		Iterator its=list.iterator();
		for(;its.hasNext();){
			Map maps=(Map)its.next();
			String rcbh=maps.get("rcbh").toString();
			System.out.println(rcbh);
			TJcxxx jc=myService.loadTJcxxxBybh(rcbh);
			TCgsxx cgs=myService.loadCgs(jc.getCgs());
			 jc.setCurType(cgs.getHblx());
			 jc.setBoxOwner(cgs.getXz());
			 jc.setFlType(cgs.getFllx());
			 myService.editJcxxx(jc);
			List sumlist=myService.listvar("select fff,sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(hj) hj from  (select fff, sum(xs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf*100+clf*100)/100 hj from t_zcgjd where rcbh='"+jc.getRcbh()+"' group by fff union all select fff, sum(gs) gs,sum(gsf) gsf,sum(clf) clf,sum(gsf)+sum(clf) hj from zcgjd2 where rcbh='"+jc.getRcbh()+"' group by fff) a group by fff order by fff");
			Iterator it=sumlist.iterator();
			for(;it.hasNext();){
				Map map =(Map)it.next();
				List s=myService.listvar("select id from t_sum where fff='"+map.get("fff").toString()+"' and rcbh='"+jc.getRcbh()+"'");
			if(s.size()>0){
				Map sm=(Map)s.get(0);
				TSum sum=myService.loadTSum(Long.parseLong(sm.get("id").toString()));
				sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
				sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
				sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
				sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
				myService.editTSum(sum);
			}
			else{
				TSum sum=new TSum();
				sum.setTJcxxx(jc);
				sum.setFff(map.get("fff").toString());
				sum.setGs(new BigDecimal(map.get("gs").toString()).doubleValue());
				sum.setGsf(new BigDecimal(map.get("gsf").toString()).doubleValue());
				sum.setClf(new BigDecimal(map.get("clf").toString()).doubleValue());
				sum.setHj(new BigDecimal(map.get("hj").toString()).doubleValue());
				myService.addTSum(sum);
			}
			}
		}
	}
}
