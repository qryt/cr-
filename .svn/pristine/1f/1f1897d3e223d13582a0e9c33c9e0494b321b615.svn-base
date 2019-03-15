package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TDataDetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.cr.domain.TDataDetail
 * @author MyEclipse Persistence Tools
 */

public class TDataDetailDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TDataDetailDAO.class);
	// property constants
	public static final String SE_ID = "seId";
	public static final String DATA_DETAIL_NAME = "dataDetailName";

	protected void initDao() {
		// do nothing
	}

	public void save(TDataDetail transientInstance) {
		log.debug("saving TDataDetail instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TDataDetail persistentInstance) {
		log.debug("deleting TDataDetail instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TDataDetail findById(Long id) {
		log.debug("getting TDataDetail instance with id: " + id);
		try {
			TDataDetail instance = (TDataDetail) getHibernateTemplate().get(
					"com.cr.domain.TDataDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TDataDetail instance) {
		log.debug("finding TDataDetail instance by example");
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
		log.debug("finding TDataDetail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TDataDetail as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySeId(Object seId) {
		return findByProperty(SE_ID, seId);
	}

	public List findByDataDetailName(Object dataDetailName) {
		return findByProperty(DATA_DETAIL_NAME, dataDetailName);
	}

	public List findAll() {
		log.debug("finding all TDataDetail instances");
		try {
			String queryString = "from TDataDetail";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TDataDetail merge(TDataDetail detachedInstance) {
		log.debug("merging TDataDetail instance");
		try {
			TDataDetail result = (TDataDetail) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TDataDetail instance) {
		log.debug("attaching dirty TDataDetail instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TDataDetail instance) {
		log.debug("attaching clean TDataDetail instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TDataDetailDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TDataDetailDAO) ctx.getBean("TDataDetailDAO");
	}
}