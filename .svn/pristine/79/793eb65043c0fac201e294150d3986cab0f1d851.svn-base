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
 * Zcgjd2 entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.cr.domain.Zcgjd2
 * @author MyEclipse Persistence Tools
 */

public class Zcgjd2DAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Zcgjd2DAO.class);
	// property constants
	public static final String WZDM = "wzdm";
	public static final String SHLX = "shlx";
	public static final String XLFF = "xlff";
	public static final String XLMX = "xlmx";
	public static final String BJMC = "bjmc";
	public static final String C = "c";
	public static final String K = "k";
	public static final String SL = "sl";
	public static final String GS = "gs";
	public static final String GSF = "gsf";
	public static final String CLF = "clf";
	public static final String FFF = "fff";
	public static final String LX = "lx";
	public static final String LRR = "lrr";

	protected void initDao() {
		// do nothing
	}

	public void save(Zcgjd2 transientInstance) {
		log.debug("saving Zcgjd2 instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Zcgjd2 persistentInstance) {
		log.debug("deleting Zcgjd2 instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zcgjd2 findById(Long id) {
		log.debug("getting Zcgjd2 instance with id: " + id);
		try {
			Zcgjd2 instance = (Zcgjd2) getHibernateTemplate().get(
					"com.cr.domain.Zcgjd2", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zcgjd2 instance) {
		log.debug("finding Zcgjd2 instance by example");
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
		log.debug("finding Zcgjd2 instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Zcgjd2 as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByWzdm(Object wzdm) {
		return findByProperty(WZDM, wzdm);
	}

	public List findByShlx(Object shlx) {
		return findByProperty(SHLX, shlx);
	}

	public List findByXlff(Object xlff) {
		return findByProperty(XLFF, xlff);
	}

	public List findByXlmx(Object xlmx) {
		return findByProperty(XLMX, xlmx);
	}

	public List findByBjmc(Object bjmc) {
		return findByProperty(BJMC, bjmc);
	}

	public List findByC(Object c) {
		return findByProperty(C, c);
	}

	public List findByK(Object k) {
		return findByProperty(K, k);
	}

	public List findBySl(Object sl) {
		return findByProperty(SL, sl);
	}

	public List findByGs(Object gs) {
		return findByProperty(GS, gs);
	}

	public List findByGsf(Object gsf) {
		return findByProperty(GSF, gsf);
	}

	public List findByClf(Object clf) {
		return findByProperty(CLF, clf);
	}

	public List findByFff(Object fff) {
		return findByProperty(FFF, fff);
	}

	public List findByLx(Object lx) {
		return findByProperty(LX, lx);
	}

	public List findByLrr(Object lrr) {
		return findByProperty(LRR, lrr);
	}

	public List findAll() {
		log.debug("finding all Zcgjd2 instances");
		try {
			String queryString = "from Zcgjd2";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zcgjd2 merge(Zcgjd2 detachedInstance) {
		log.debug("merging Zcgjd2 instance");
		try {
			Zcgjd2 result = (Zcgjd2) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zcgjd2 instance) {
		log.debug("attaching dirty Zcgjd2 instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zcgjd2 instance) {
		log.debug("attaching clean Zcgjd2 instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Zcgjd2DAO getFromApplicationContext(ApplicationContext ctx) {
		return (Zcgjd2DAO) ctx.getBean("Zcgjd2DAO");
	}
}