package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TSum
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TSum
 * @author MyEclipse Persistence Tools
 */

public class TSumDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TSumDAO.class);
	// property constants
	public static final String FFF = "fff";
	public static final String GS = "gs";
	public static final String GSF = "gsf";
	public static final String CLF = "clf";
	public static final String HJ = "hj";

	protected void initDao() {
		// do nothing
	}

	public void save(TSum transientInstance) {
		log.debug("saving TSum instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TSum persistentInstance) {
		log.debug("deleting TSum instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TSum findById(Long id) {
		log.debug("getting TSum instance with id: " + id);
		try {
			TSum instance = (TSum) getHibernateTemplate().get(
					"com.cr.domain.TSum", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TSum instance) {
		log.debug("finding TSum instance by example");
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
		log.debug("finding TSum instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TSum as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFff(Object fff) {
		return findByProperty(FFF, fff);
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

	public List findByHj(Object hj) {
		return findByProperty(HJ, hj);
	}

	public List findAll() {
		log.debug("finding all TSum instances");
		try {
			String queryString = "from TSum";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TSum merge(TSum detachedInstance) {
		log.debug("merging TSum instance");
		try {
			TSum result = (TSum) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TSum instance) {
		log.debug("attaching dirty TSum instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TSum instance) {
		log.debug("attaching clean TSum instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TSumDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TSumDAO) ctx.getBean("TSumDAO");
	}
}