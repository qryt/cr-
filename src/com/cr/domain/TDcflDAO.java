package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TDcfl
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TDcfl
 * @author MyEclipse Persistence Tools
 */

public class TDcflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TDcflDAO.class);
	// property constants
	public static final String CC = "cc";
	public static final String XX = "xx";
	public static final String QDF = "qdf";
	public static final String TYF = "tyf";
	public static final String DCFL = "dcfl";
	public static final String BGDCF = "bgdcf";
	public static final String HBLX = "hblx";

	protected void initDao() {
		// do nothing
	}

	public void save(TDcfl transientInstance) {
		log.debug("saving TDcfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TDcfl persistentInstance) {
		log.debug("deleting TDcfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TDcfl findById(Long id) {
		log.debug("getting TDcfl instance with id: " + id);
		try {
			TDcfl instance = (TDcfl) getHibernateTemplate().get(
					"com.cr.domain.TDcfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TDcfl instance) {
		log.debug("finding TDcfl instance by example");
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
		log.debug("finding TDcfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TDcfl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCc(Object cc) {
		return findByProperty(CC, cc);
	}

	public List findByXx(Object xx) {
		return findByProperty(XX, xx);
	}

	public List findByQdf(Object qdf) {
		return findByProperty(QDF, qdf);
	}

	public List findByTyf(Object tyf) {
		return findByProperty(TYF, tyf);
	}

	public List findByDcfl(Object dcfl) {
		return findByProperty(DCFL, dcfl);
	}

	public List findByBgdcf(Object bgdcf) {
		return findByProperty(BGDCF, bgdcf);
	}

	public List findByHblx(Object hblx) {
		return findByProperty(HBLX, hblx);
	}

	public List findAll() {
		log.debug("finding all TDcfl instances");
		try {
			String queryString = "from TDcfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TDcfl merge(TDcfl detachedInstance) {
		log.debug("merging TDcfl instance");
		try {
			TDcfl result = (TDcfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TDcfl instance) {
		log.debug("attaching dirty TDcfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TDcfl instance) {
		log.debug("attaching clean TDcfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TDcflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TDcflDAO) ctx.getBean("TDcflDAO");
	}
}