package com.smartcafe.web.dao;

import com.smartcafe.web.model.AbstractModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractDao<T extends AbstractModel> {

    @Autowired
    private SessionFactory sessionFactory;

    private final Class<T> clazz;

    @SuppressWarnings("unchecked")
    public AbstractDao() {
        this.clazz = (Class<T>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll(){
        Criteria criteria = getSession().createCriteria(this.clazz);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    @SuppressWarnings("unchecked")
    public T getById(Long id){
        Criteria criteria = getSession().createCriteria(this.clazz);
       criteria.add(Restrictions.eq("id", id));
        return (T)criteria.uniqueResult();
    }

    public void add(T model){
        getSession().save(model);
    }

    public void update(T model){
        getSession().merge(model);
    }

    public void remove(T model){
        getSession().delete(model);
    }

}
