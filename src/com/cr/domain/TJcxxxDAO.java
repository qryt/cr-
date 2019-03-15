package com.cr.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TJcxxx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.cr.domain.TJcxxx
 * @author MyEclipse Persistence Tools
 */

public class TJcxxxDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TJcxxxDAO.class);
	// property constants
	public static final String XH = "xh";
	public static final String XX = "xx";
	public static final String ZZRQ = "zzrq";
	public static final String CC = "cc";
	public static final String JCZT = "jczt";
	public static final String JCTC = "jctc";
	public static final String LXD = "lxd";
	public static final String JCWZ = "jcwz";
	public static final String EIRLSH = "eirlsh";
	public static final String CGS = "cgs";
	public static final String SFBF = "sfbf";
	public static final String LCZT = "lczt";
	public static final String CCTC = "cctc";
	public static final String QX = "qx";
	public static final String TDH = "tdh";
	public static final String MTWTBH = "mtwtbh";
	public static final String ZGD = "zgd";
	public static final String TYF = "tyf";
	public static final String DCF = "dcf";
	public static final String QDF = "qdf";
	public static final String ZDBH = "zdbh";
	public static final String ZYGR = "zygr";
	public static final String LLR = "llr";
	public static final String WZMX = "wzmx";
	public static final String XXL = "xxl";
	public static final String PXYY = "pxyy";
	public static final String BZ = "bz";
	public static final String CUR_TYPE = "curType";
	public static final String BOX_OWNER = "boxOwner";
	public static final String FL_TYPE = "flType";

	protected void initDao() {
		// do nothing
	}

	public void save(TJcxxx transientInstance) {
		log.debug("saving TJcxxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TJcxxx persistentInstance) {
		log.debug("deleting TJcxxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TJcxxx findById(java.lang.String id) {
		log.debug("getting TJcxxx instance with id: " + id);
		try {
			TJcxxx instance = (TJcxxx) getHibernateTemplate().get(
					"com.cr.domain.TJcxxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TJcxxx instance) {
		log.debug("finding TJcxxx instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TJcxxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TJcxxx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXh(Object xh) {
		return findByProperty(XH, xh);
	}

	public List findByXx(Object xx) {
		return findByProperty(XX, xx);
	}

	public List findByZzrq(Object zzrq) {
		return findByProperty(ZZRQ, zzrq);
	}

	public List findByCc(Object cc) {
		return findByProperty(CC, cc);
	}

	public List findByJczt(Object jczt) {
		return findByProperty(JCZT, jczt);
	}

	public List findByJctc(Object jctc) {
		return findByProperty(JCTC, jctc);
	}

	public List findByLxd(Object lxd) {
		return findByProperty(LXD, lxd);
	}

	public List findByJcwz(Object jcwz) {
		return findByProperty(JCWZ, jcwz);
	}

	public List findByEirlsh(Object eirlsh) {
		return findByProperty(EIRLSH, eirlsh);
	}

	public List findByCgs(Object cgs) {
		return findByProperty(CGS, cgs);
	}

	public List findBySfbf(Object sfbf) {
		return findByProperty(SFBF, sfbf);
	}

	public List findByLczt(Object lczt) {
		return findByProperty(LCZT, lczt);
	}

	public List findByCctc(Object cctc) {
		return findByProperty(CCTC, cctc);
	}

	public List findByQx(Object qx) {
		return findByProperty(QX, qx);
	}

	public List findByTdh(Object tdh) {
		return findByProperty(TDH, tdh);
	}

	public List findByMtwtbh(Object mtwtbh) {
		return findByProperty(MTWTBH, mtwtbh);
	}

	public List findByZgd(Object zgd) {
		return findByProperty(ZGD, zgd);
	}

	public List findByTyf(Object tyf) {
		return findByProperty(TYF, tyf);
	}

	public List findByDcf(Object dcf) {
		return findByProperty(DCF, dcf);
	}

	public List findByQdf(Object qdf) {
		return findByProperty(QDF, qdf);
	}

	public List findByZdbh(Object zdbh) {
		return findByProperty(ZDBH, zdbh);
	}

	public List findByZygr(Object zygr) {
		return findByProperty(ZYGR, zygr);
	}

	public List findByLlr(Object llr) {
		return findByProperty(LLR, llr);
	}

	public List findByWzmx(Object wzmx) {
		return findByProperty(WZMX, wzmx);
	}

	public List findByXxl(Object xxl) {
		return findByProperty(XXL, xxl);
	}

	public List findByPxyy(Object pxyy) {
		return findByProperty(PXYY, pxyy);
	}

	public List findByBz(Object bz) {
		return findByProperty(BZ, bz);
	}

	public List findByCurType(Object curType) {
		return findByProperty(CUR_TYPE, curType);
	}

	public List findByBoxOwner(Object boxOwner) {
		return findByProperty(BOX_OWNER, boxOwner);
	}

	public List findByFlType(Object flType) {
		return findByProperty(FL_TYPE, flType);
	}

	public List findAll() {
		log.debug("finding all TJcxxx instances");
		try {
			String queryString = "from TJcxxx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TJcxxx merge(TJcxxx detachedInstance) {
		log.debug("merging TJcxxx instance");
		try {
			TJcxxx result = (TJcxxx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TJcxxx instance) {
		log.debug("attaching dirty TJcxxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TJcxxx instance) {
		log.debug("attaching clean TJcxxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TJcxxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TJcxxxDAO) ctx.getBean("TJcxxxDAO");
	}
}