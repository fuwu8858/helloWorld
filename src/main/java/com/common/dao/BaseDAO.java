package com.common.dao;

import com.common.model.BaseModel;
import com.common.util.PageParams;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@Repository
@SuppressWarnings("unchecked")
public abstract class BaseDAO<T extends BaseModel<T, S>, S extends Serializable> {
    @Autowired
    protected SessionFactory sessionFactory;
    private Class<T> classType;
    private static Logger logger = LoggerFactory.getLogger(BaseDAO.class);

    
	public BaseDAO() {
        Type superClass = this.getClass().getGenericSuperclass();
        logger.debug(superClass.toString());

        if (superClass instanceof ParameterizedType) {
            this.classType = (Class<T>) ((ParameterizedType) superClass)
                .getActualTypeArguments()[0];
        }
//        else {
//            throw new IllegalArgumentException("Class should be parameterized");
//        }
    }

	/**
	 * 添加
	 * @param entity
	 * @return
	 */
	public S addEntity(T entity) {
        return (entity == null) ? null : (S) this.sessionFactory
            .getCurrentSession().save(entity);
    }

	/**
	 * 更新
	 * @param entity
	 * @return
	 */
	public T updateEntity(T entity) {
        return (entity == null) ? null : (T) this.sessionFactory
            .getCurrentSession().merge(entity);
    }

	/**
	 * 删除
	 * @param entity
	 */
    public void deleteEntity(T entity) {
        if (entity != null) {
            this.sessionFactory.getCurrentSession().delete(entity);
        }
    }

    /**
     * 根据主键获取对象
     * @param id
     * @return
     */
	public T getEntityByID(S id) {
        return (T) this.sessionFactory.getCurrentSession().get(this.classType,
            id);
    }

	/**
	 * 保存或修改
	 * @param entity
	 */
    public void saveOrMerge(T entity) {
        if (entity != null) {
            if (entity.getId() == null) {
                this.addEntity(entity);
            } else {
                this.updateEntity(entity);
            }
        }
    }
    
    /**
     * 根据查询语句和参数查询列表
     * @param hql			查询HQL
     * @param params		参数
     * @return
     */
	public List<T> getEntitysByHql(String hql, Map params){
    	return (List<T>)this.sessionFactory.getCurrentSession().createQuery(hql)
    			.setProperties(params).list();
    }
	
	/**
     * 根据HQL语句和参数执行HQL(用于更新、删除等)
     * @param hql			HQL
     * @param params		参数
     * @return
     */
	public int updateEntityByHql(String hql, Map params)
	{
		return this.sessionFactory.getCurrentSession().createQuery(hql).setProperties(params).executeUpdate();
	}
	
	
	/**
	 * 
	 * @param pageParams
	 * @param hql
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public List<T> getEntityPageListByQueryHql(PageParams pageParams, String hql, Map params) throws Exception
	{
		
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		if(null != params) query.setProperties(params);
		query.setFirstResult(pageParams.getPagenum() * pageParams.getPagesize());
		query.setMaxResults(pageParams.getPagesize());
		
		return query.list();
	}
	
	
	public Long getEntityCountByQueryHql(String hql, Map params) throws Exception
	{
		
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		if(null != params) query.setProperties(params);
		
		return (Long)query.uniqueResult();
	}
	
}
