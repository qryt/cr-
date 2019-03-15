package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TShlxsz entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.cr.domain.TShlxsz
 * @author MyEclipse Persistence Tools
 */

public class TShlxszDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TShlxszDAO.class);
	// property constants
	public static final String SHLXMC = "shlxmc";
	public static final String SHLXMX = "shlxmx";

	protected void initDao() {
		// do nothing
	}

	public void save(TShlxsz transientInstance) {
		log.debug("saving TShlxsz instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TShlxsz persistentInstance) {
		log.debug("deleting TShlxsz instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TShlxsz findById(java.lang.String id) {
		log.debug("getting TShlxsz instance with id: " + id);
		try {
			TShlxsz instance = (TShlxsz) getHibernateTemplate().get(
					"com.cr.domain.TShlxsz", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TShlxsz instance) {
		log.debug("finding TShlxsz instance by example");
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
		log.debug("finding TShlxsz instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TShlxsz as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByShlxmc(Object shlxmc) {
		return findByProperty(SHLXMC, shlxmc);
	}

	public List findByShlxmx(Object shlxmx) {
		return findByProperty(SHLXMX, shlxmx);
	}

	public List findAll() {
		log.debug("finding all TShlxsz instances");
		try {
			String queryString = "from TShlxsz";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TShlxsz merge(TShlxsz detachedInstance) {
		log.debug("merging TShlxsz instance");
		try {
			TShlxsz result = (TShlxsz) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TShlxsz instance) {
		log.debug("attaching dirty TShlxsz instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TShlxsz instance) {
		log.debug("attaching clean TShlxsz instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TShlxszDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TShlxszDAO) ctx.getBean("TShlxszDAO");
	}
}