package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TXxxx
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TXxxx
 * @author MyEclipse Persistence Tools
 */

public class TXxxxDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TXxxxDAO.class);
	// property constants
	public static final String XXMC = "xxmc";
	public static final String XXMX = "xxmx";

	protected void initDao() {
		// do nothing
	}

	public void save(TXxxx transientInstance) {
		log.debug("saving TXxxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TXxxx persistentInstance) {
		log.debug("deleting TXxxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TXxxx findById(java.lang.String id) {
		log.debug("getting TXxxx instance with id: " + id);
		try {
			TXxxx instance = (TXxxx) getHibernateTemplate().get(
					"com.cr.domain.TXxxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TXxxx instance) {
		log.debug("finding TXxxx instance by example");
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
		log.debug("finding TXxxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TXxxx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXxmc(Object xxmc) {
		return findByProperty(XXMC, xxmc);
	}

	public List findByXxmx(Object xxmx) {
		return findByProperty(XXMX, xxmx);
	}

	public List findAll() {
		log.debug("finding all TXxxx instances");
		try {
			String queryString = "from TXxxx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TXxxx merge(TXxxx detachedInstance) {
		log.debug("merging TXxxx instance");
		try {
			TXxxx result = (TXxxx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TXxxx instance) {
		log.debug("attaching dirty TXxxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TXxxx instance) {
		log.debug("attaching clean TXxxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TXxxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TXxxxDAO) ctx.getBean("TXxxxDAO");
	}
}