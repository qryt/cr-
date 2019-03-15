package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TXlfl
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TXlfl
 * @author MyEclipse Persistence Tools
 */

public class TXlflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TXlflDAO.class);
	// property constants
	public static final String SHDM = "shdm";
	public static final String SHMX = "shmx";
	public static final String GS = "gs";
	public static final String CLF = "clf";

	protected void initDao() {
		// do nothing
	}

	public void save(TXlfl transientInstance) {
		log.debug("saving TXlfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TXlfl persistentInstance) {
		log.debug("deleting TXlfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TXlfl findById(Long id) {
		log.debug("getting TXlfl instance with id: " + id);
		try {
			TXlfl instance = (TXlfl) getHibernateTemplate().get(
					"com.cr.domain.TXlfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TXlfl instance) {
		log.debug("finding TXlfl instance by example");
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
		log.debug("finding TXlfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TXlfl as model where model."
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

	public List findByGs(Object gs) {
		return findByProperty(GS, gs);
	}

	public List findByClf(Object clf) {
		return findByProperty(CLF, clf);
	}

	public List findAll() {
		log.debug("finding all TXlfl instances");
		try {
			String queryString = "from TXlfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TXlfl merge(TXlfl detachedInstance) {
		log.debug("merging TXlfl instance");
		try {
			TXlfl result = (TXlfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TXlfl instance) {
		log.debug("attaching dirty TXlfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TXlfl instance) {
		log.debug("attaching clean TXlfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TXlflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TXlflDAO) ctx.getBean("TXlflDAO");
	}
}