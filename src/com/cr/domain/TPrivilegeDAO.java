package com.cr.domain;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPrivilege entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.cr.domain.TPrivilege
 * @author MyEclipse Persistence Tools
 */

public class TPrivilegeDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TPrivilegeDAO.class);
	// property constants
	public static final String PRIV_NAME = "privName";
	public static final String PRIV_TITLE = "privTitle";
	public static final String PRIV_DETAIL = "privDetail";

	protected void initDao() {
		// do nothing
	}

	public void save(TPrivilege transientInstance) {
		log.debug("saving TPrivilege instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPrivilege persistentInstance) {
		log.debug("deleting TPrivilege instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPrivilege findById(Long id) {
		log.debug("getting TPrivilege instance with id: " + id);
		try {
			TPrivilege instance = (TPrivilege) getHibernateTemplate().get(
					"com.cr.domain.TPrivilege", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPrivilege instance) {
		log.debug("finding TPrivilege instance by example");
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
		log.debug("finding TPrivilege instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TPrivilege as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPrivName(Object privName) {
		return findByProperty(PRIV_NAME, privName);
	}

	public List findByPrivTitle(Object privTitle) {
		return findByProperty(PRIV_TITLE, privTitle);
	}

	public List findByPrivDetail(Object privDetail) {
		return findByProperty(PRIV_DETAIL, privDetail);
	}

	public List findAll() {
		log.debug("finding all TPrivilege instances");
		try {
			String queryString = "from TPrivilege";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPrivilege merge(TPrivilege detachedInstance) {
		log.debug("merging TPrivilege instance");
		try {
			TPrivilege result = (TPrivilege) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPrivilege instance) {
		log.debug("attaching dirty TPrivilege instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPrivilege instance) {
		log.debug("attaching clean TPrivilege instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPrivilegeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TPrivilegeDAO) ctx.getBean("TPrivilegeDAO");
	}
}