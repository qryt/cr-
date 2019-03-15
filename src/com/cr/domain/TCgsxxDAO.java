package com.cr.domain;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for TCgsxx entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.cr.domain.TCgsxx
  * @author MyEclipse Persistence Tools 
 */

public class TCgsxxDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(TCgsxxDAO.class);
	//property constants
	public static final String GSDM = "gsdm";
	public static final String GSMC = "gsmc";
	public static final String YWMC = "ywmc";
	public static final String LXDH = "lxdh";
	public static final String CZ = "cz";
	public static final String FZR = "fzr";
	public static final String EMAIL = "email";
	public static final String LGSMC = "lgsmc";
	public static final String LYWMC = "lywmc";
	public static final String LLXDH = "llxdh";
	public static final String LCZ = "lcz";
	public static final String LFZR = "lfzr";
	public static final String LEMAIL = "lemail";
	public static final String HBLX = "hblx";
	public static final String GSFL = "gsfl";
	public static final String LGSDZ = "lgsdz";
	public static final String FLLX = "fllx";
	public static final String LGSDM = "lgsdm";
	public static final String SSGS = "ssgs";
	public static final String XZ = "xz";



	protected void initDao() {
		//do nothing
	}
    
    public void save(TCgsxx transientInstance) {
        log.debug("saving TCgsxx instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCgsxx persistentInstance) {
        log.debug("deleting TCgsxx instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCgsxx findById( Long id) {
        log.debug("getting TCgsxx instance with id: " + id);
        try {
            TCgsxx instance = (TCgsxx) getHibernateTemplate()
                    .get("com.cr.domain.TCgsxx", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCgsxx instance) {
        log.debug("finding TCgsxx instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding TCgsxx instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCgsxx as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByGsdm(Object gsdm
	) {
		return findByProperty(GSDM, gsdm
		);
	}
	
	public List findByGsmc(Object gsmc
	) {
		return findByProperty(GSMC, gsmc
		);
	}
	
	public List findByYwmc(Object ywmc
	) {
		return findByProperty(YWMC, ywmc
		);
	}
	
	public List findByLxdh(Object lxdh
	) {
		return findByProperty(LXDH, lxdh
		);
	}
	
	public List findByCz(Object cz
	) {
		return findByProperty(CZ, cz
		);
	}
	
	public List findByFzr(Object fzr
	) {
		return findByProperty(FZR, fzr
		);
	}
	
	public List findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	
	public List findByLgsmc(Object lgsmc
	) {
		return findByProperty(LGSMC, lgsmc
		);
	}
	
	public List findByLywmc(Object lywmc
	) {
		return findByProperty(LYWMC, lywmc
		);
	}
	
	public List findByLlxdh(Object llxdh
	) {
		return findByProperty(LLXDH, llxdh
		);
	}
	
	public List findByLcz(Object lcz
	) {
		return findByProperty(LCZ, lcz
		);
	}
	
	public List findByLfzr(Object lfzr
	) {
		return findByProperty(LFZR, lfzr
		);
	}
	
	public List findByLemail(Object lemail
	) {
		return findByProperty(LEMAIL, lemail
		);
	}
	
	public List findByHblx(Object hblx
	) {
		return findByProperty(HBLX, hblx
		);
	}
	
	public List findByGsfl(Object gsfl
	) {
		return findByProperty(GSFL, gsfl
		);
	}
	
	public List findByLgsdz(Object lgsdz
	) {
		return findByProperty(LGSDZ, lgsdz
		);
	}
	
	public List findByFllx(Object fllx
	) {
		return findByProperty(FLLX, fllx
		);
	}
	
	public List findByLgsdm(Object lgsdm
	) {
		return findByProperty(LGSDM, lgsdm
		);
	}
	
	public List findBySsgs(Object ssgs
	) {
		return findByProperty(SSGS, ssgs
		);
	}
	
	public List findByXz(Object xz
	) {
		return findByProperty(XZ, xz
		);
	}
	

	public List findAll() {
		log.debug("finding all TCgsxx instances");
		try {
			String queryString = "from TCgsxx";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCgsxx merge(TCgsxx detachedInstance) {
        log.debug("merging TCgsxx instance");
        try {
            TCgsxx result = (TCgsxx) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCgsxx instance) {
        log.debug("attaching dirty TCgsxx instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCgsxx instance) {
        log.debug("attaching clean TCgsxx instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static TCgsxxDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (TCgsxxDAO) ctx.getBean("TCgsxxDAO");
	}
}