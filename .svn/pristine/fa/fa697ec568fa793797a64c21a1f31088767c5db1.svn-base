package com.cr.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Xlfl2
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.cr.domain.Xlfl2
 * @author MyEclipse Persistence Tools
 */

public class Xlfl2DAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Xlfl2DAO.class);
	// property constants
	public static final String LX = "lx";
	public static final String BJMC = "bjmc";
	public static final String XLFF = "xlff";
	public static final String C = "c";
	public static final String K = "k";
	public static final String XLMX = "xlmx";
	public static final String GS = "gs";
	public static final String CLF = "clf";

	protected void initDao() {
		// do nothing
	}

	public void save(Xlfl2 transientInstance) {
		log.debug("saving Xlfl2 instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xlfl2 persistentInstance) {
		log.debug("deleting Xlfl2 instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xlfl2 findById(Long id) {
		log.debug("getting Xlfl2 instance with id: " + id);
		try {
			Xlfl2 instance = (Xlfl2) getHibernateTemplate().get(
					"com.cr.domain.Xlfl2", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xlfl2 instance) {
		log.debug("finding Xlfl2 instance by example");
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
		log.debug("finding Xlfl2 instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xlfl2 as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLx(Object lx) {
		return findByProperty(LX, lx);
	}

	public List findByBjmc(Object bjmc) {
		return findByProperty(BJMC, bjmc);
	}

	public List findByXlff(Object xlff) {
		return findByProperty(XLFF, xlff);
	}

	public List findByC(Object c) {
		return findByProperty(C, c);
	}

	public List findByK(Object k) {
		return findByProperty(K, k);
	}

	public List findByXlmx(Object xlmx) {
		return findByProperty(XLMX, xlmx);
	}

	public List findByGs(Object gs) {
		return findByProperty(GS, gs);
	}

	public List findByClf(Object clf) {
		return findByProperty(CLF, clf);
	}

	public List findAll() {
		log.debug("finding all Xlfl2 instances");
		try {
			String queryString = "from Xlfl2";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xlfl2 merge(Xlfl2 detachedInstance) {
		log.debug("merging Xlfl2 instance");
		try {
			Xlfl2 result = (Xlfl2) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xlfl2 instance) {
		log.debug("attaching dirty Xlfl2 instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xlfl2 instance) {
		log.debug("attaching clean Xlfl2 instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Xlfl2DAO getFromApplicationContext(ApplicationContext ctx) {
		return (Xlfl2DAO) ctx.getBean("Xlfl2DAO");
	}
}