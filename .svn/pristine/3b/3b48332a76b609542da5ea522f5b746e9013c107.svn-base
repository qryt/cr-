package com.cr.domain;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TFpdc
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TFpdc
 * @author MyEclipse Persistence Tools
 */

public class TFpdcDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TFpdcDAO.class);
	// property constants
	public static final String DCFL = "dcfl";

	protected void initDao() {
		// do nothing
	}

	public void save(TFpdc transientInstance) {
		log.debug("saving TFpdc instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TFpdc persistentInstance) {
		log.debug("deleting TFpdc instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TFpdc findById(Long id) {
		log.debug("getting TFpdc instance with id: " + id);
		try {
			TFpdc instance = (TFpdc) getHibernateTemplate().get(
					"com.cr.domain.TFpdc", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TFpdc instance) {
		log.debug("finding TFpdc instance by example");
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
		log.debug("finding TFpdc instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TFpdc as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDcfl(Object dcfl) {
		return findByProperty(DCFL, dcfl);
	}

	public List findAll() {
		log.debug("finding all TFpdc instances");
		try {
			String queryString = "from TFpdc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TFpdc merge(TFpdc detachedInstance) {
		log.debug("merging TFpdc instance");
		try {
			TFpdc result = (TFpdc) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TFpdc instance) {
		log.debug("attaching dirty TFpdc instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TFpdc instance) {
		log.debug("attaching clean TFpdc instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TFpdcDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TFpdcDAO) ctx.getBean("TFpdcDAO");
	}
}