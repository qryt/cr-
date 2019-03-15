package com.cr.domain;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TData
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TData
 * @author MyEclipse Persistence Tools
 */

public class TDataDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TDataDAO.class);
	// property constants
	public static final String SE_ID = "seId";
	public static final String DATA_TYPE_NAME = "dataTypeName";

	protected void initDao() {
		// do nothing
	}

	public void save(TData transientInstance) {
		log.debug("saving TData instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TData persistentInstance) {
		log.debug("deleting TData instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TData findById(Long id) {
		log.debug("getting TData instance with id: " + id);
		try {
			TData instance = (TData) getHibernateTemplate().get(
					"com.cr.domain.TData", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TData instance) {
		log.debug("finding TData instance by example");
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
		log.debug("finding TData instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TData as model where model."
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

	public List findByDataTypeName(Object dataTypeName) {
		return findByProperty(DATA_TYPE_NAME, dataTypeName);
	}

	public List findAll() {
		log.debug("finding all TData instances");
		try {
			String queryString = "from TData";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TData merge(TData detachedInstance) {
		log.debug("merging TData instance");
		try {
			TData result = (TData) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TData instance) {
		log.debug("attaching dirty TData instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TData instance) {
		log.debug("attaching clean TData instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TDataDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TDataDAO) ctx.getBean("TDataDAO");
	}
}