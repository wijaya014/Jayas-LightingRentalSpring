package com.jaya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaya.dao.LightingDao;
import com.jaya.model.Lighting;
import com.jaya.service.LightingService;

@Service
public class LightingServiceImpl implements LightingService {

	@Autowired
	private LightingDao lightingDao;
	
	@Transactional
	public void addLighting(Lighting lighting) {
		lightingDao.addLighting(lighting);
	}

	@Transactional
	public void editLighting(Lighting lighting) {
		lightingDao.editLighting(lighting);
	}

	@Transactional
	public void deleteLighting(int idLighting) {
		lightingDao.deleteLighting(idLighting);
	}
	
	@Transactional
	public Lighting getLighting(int idLighting) {
		return lightingDao.getLighting(idLighting);
	}

	@Transactional
	public List getAllLighting() {
		return lightingDao.getAllLighting();
	}

}
