package com.cr.domain;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TZcgjd entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.cr.domain.TZcgjd
 * @author MyEclipse Persistence Tools
 */

public class TZcgjdDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TZcgjdDAO.class);
	// property constants
	public static final String SHDM = "shdm";
	public static final String SHMX = "shmx";
	public static final String SL = "sl";
	public static final String XS = "xs";
	public static final String GSF = "gsf";
	public static final String CLF = "clf";
	public static final String HJ = "hj";
	public static final String SFXL = "sfxl";
	public static final String FFF = "fff";
	public static final String HBLX = "hblx";
	public static final String SHLX = "shlx";
	public static final String SHWZ = "shwz";
	public static final String LRR = "lrr";

	protected void initDao() {
		// do nothing
	}

	public void save(TZcgjd transientInstance) {
		log.debug("saving TZcgjd instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TZcgjd persistentInstance) {
		log.debug("deleting TZcgjd instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TZcgjd findById(Long id) {
		log.debug("getting TZcgjd instance with id: " + id);
		try {
			TZcgjd instance = (TZcgjd) getHibernateTemplate().get(
					"com.cr.domain.TZcgjd", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TZcgjd instance) {
		log.debug("finding TZcgjd instance by example");
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
		log.debug("finding TZcgjd instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TZcgjd as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByShdm(Object shdm) {
		return findByProperty(SHDM, shdm);
	}

	public List findByShmx(Object shmx) {
		return findByProperty(SHMX, shmx);
	}

	public List findBySl(Object sl) {
		return findByProperty(SL, sl);
	}

	public List findByXs(Object xs) {
		return findByProperty(XS, xs);
	}

	public List findByGsf(Object gsf) {
		return findByProperty(GSF, gsf);
	}

	public List findByClf(Object clf) {
		return findByProperty(CLF, clf);
	}

	public List findByHj(Object hj) {
		return findByProperty(HJ, hj);
	}

	public List findBySfxl(Object sfxl) {
		return findByProperty(SFXL, sfxl);
	}

	public List findByFff(Object fff) {
		return findByProperty(FFF, fff);
	}

	public List findByHblx(Object hblx) {
		return findByProperty(HBLX, hblx);
	}

	public List findByShlx(Object shlx) {
		return findByProperty(SHLX, shlx);
	}

	public List findByShwz(Object shwz) {
		return findByProperty(SHWZ, shwz);
	}

	public List findByLrr(Object lrr) {
		return findByProperty(LRR, lrr);
	}

	public List findAll() {
		log.debug("finding all TZcgjd instances");
		try {
			String queryString = "from TZcgjd";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TZcgjd merge(TZcgjd detachedInstance) {
		log.debug("merging TZcgjd instance");
		try {
			TZcgjd result = (TZcgjd) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TZcgjd instance) {
		log.debug("attaching dirty TZcgjd instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TZcgjd instance) {
		log.debug("attaching clean TZcgjd instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TZcgjdDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TZcgjdDAO) ctx.getBean("TZcgjdDAO");
	}
}