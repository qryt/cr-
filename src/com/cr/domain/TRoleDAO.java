package com.cr.domain;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for TRole
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.TRole
 * @author MyEclipse Persistence Tools
 */

public class TRoleDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TRoleDAO.class);
	// property constants
	public static final String _RNAME = "RName";
	public static final String _RCAPTION = "RCaption";
	public static final String _RDESCRIPTION = "RDescription";

	protected void initDao() {
		// do nothing
	}

	public void save(TRole transientInstance) {
		log.debug("saving TRole instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TRole persistentInstance) {
		log.debug("deleting TRole instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TRole findById(Long id) {
		log.debug("getting TRole instance with id: " + id);
		try {
			TRole instance = (TRole) getHibernateTemplate().get(
					"com.cr.domain.TRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TRole instance) {
		log.debug("finding TRole instance by example");
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
		log.debug("finding TRole instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TRole as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRName(Object RName) {
		return findByProperty(_RNAME, RName);
	}

	public List findByRCaption(Object RCaption) {
		return findByProperty(_RCAPTION, RCaption);
	}

	public List findByRDescription(Object RDescription) {
		return findByProperty(_RDESCRIPTION, RDescription);
	}

	public List findAll() {
		log.debug("finding all TRole instances");
		try {
			String queryString = "from TRole";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TRole merge(TRole detachedInstance) {
		log.debug("merging TRole instance");
		try {
			TRole result = (TRole) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TRole instance) {
		log.debug("attaching dirty TRole instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TRole instance) {
		log.debug("attaching clean TRole instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TRoleDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TRoleDAO) ctx.getBean("TRoleDAO");
	}
}