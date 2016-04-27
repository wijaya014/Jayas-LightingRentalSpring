package com.jaya.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jaya.dao.LightingDao;
import com.jaya.model.Lighting;

@Repository
public class LightingDaoImpl implements LightingDao{
	
	@Autowired
	public SessionFactory session;
	
	@Override
	public void addLighting(Lighting lighting) {
		session.getCurrentSession().save(lighting);
	}

	@Override
	public void editLighting(Lighting lighting) {
		session.getCurrentSession().update(lighting);
	}

	@Override
	public void deleteLighting(int idLighting) {
		session.getCurrentSession().delete(getLighting(idLighting));
	}

	@Override
	public Lighting getLighting(int idLighting) {
		return (Lighting) session.getCurrentSession().get(Lighting.class, idLighting);
	}

	@Override
	public List getAllLighting() {
		return session.getCurrentSession().createQuery("from Lighting").list();
	}

}
