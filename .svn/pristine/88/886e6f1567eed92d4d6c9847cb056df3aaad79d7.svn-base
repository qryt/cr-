package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TXxl
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TXxl
 * @author MyEclipse Persistence Tools
 */

public class TXxlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TXxlDAO.class);
	// property constants
	public static final String XXL = "xxl";
	public static final String MX = "mx";

	protected void initDao() {
		// do nothing
	}

	public void save(TXxl transientInstance) {
		log.debug("saving TXxl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TXxl persistentInstance) {
		log.debug("deleting TXxl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TXxl findById(Long id) {
		log.debug("getting TXxl instance with id: " + id);
		try {
			TXxl instance = (TXxl) getHibernateTemplate().get(
					"com.cr.domain.TXxl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TXxl instance) {
		log.debug("finding TXxl instance by example");
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
		log.debug("finding TXxl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TXxl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXxl(Object xxl) {
		return findByProperty(XXL, xxl);
	}

	public List findByMx(Object mx) {
		return findByProperty(MX, mx);
	}

	public List findAll() {
		log.debug("finding all TXxl instances");
		try {
			String queryString = "from TXxl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TXxl merge(TXxl detachedInstance) {
		log.debug("merging TXxl instance");
		try {
			TXxl result = (TXxl) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TXxl instance) {
		log.debug("attaching dirty TXxl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TXxl instance) {
		log.debug("attaching clean TXxl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TXxlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TXxlDAO) ctx.getBean("TXxlDAO");
	}
}