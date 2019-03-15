package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TWzdm
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TWzdm
 * @author MyEclipse Persistence Tools
 */

public class TWzdmDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TWzdmDAO.class);
	// property constants
	public static final String WZDM = "wzdm";

	protected void initDao() {
		// do nothing
	}

	public void save(TWzdm transientInstance) {
		log.debug("saving TWzdm instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TWzdm persistentInstance) {
		log.debug("deleting TWzdm instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TWzdm findById(Long id) {
		log.debug("getting TWzdm instance with id: " + id);
		try {
			TWzdm instance = (TWzdm) getHibernateTemplate().get(
					"com.cr.domain.TWzdm", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TWzdm instance) {
		log.debug("finding TWzdm instance by example");
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
		log.debug("finding TWzdm instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TWzdm as model where model."
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

	public List findAll() {
		log.debug("finding all TWzdm instances");
		try {
			String queryString = "from TWzdm";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TWzdm merge(TWzdm detachedInstance) {
		log.debug("merging TWzdm instance");
		try {
			TWzdm result = (TWzdm) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TWzdm instance) {
		log.debug("attaching dirty TWzdm instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TWzdm instance) {
		log.debug("attaching clean TWzdm instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TWzdmDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TWzdmDAO) ctx.getBean("TWzdmDAO");
	}
}