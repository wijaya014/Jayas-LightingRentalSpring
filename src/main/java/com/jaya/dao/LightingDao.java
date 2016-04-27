package com.jaya.dao;

import java.util.List;

import com.jaya.model.Lighting;

public interface LightingDao {
	public void addLighting(Lighting lighting);
	public void editLighting(Lighting lighting);
	public void deleteLighting(int idLighting);
	public Lighting getLighting(int idLighting);
	public List getAllLighting();
}
