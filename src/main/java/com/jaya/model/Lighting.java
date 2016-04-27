package com.jaya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lighting")
public class Lighting {
	@Id
	@Column(name="id_lighting")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int idLighting;
	@Column(name="name")
	String name;
	@Column(name="watt")
	int watt;
	@Column(name="harga_satuan")
	int hargaSatuan;
	@Column(name="jumlah")
	int jumlah;
	
	public Lighting(){}

	public Lighting(int idLighting , String name, int watt, int hargaSatuan, int jumlah) {
		this.idLighting = idLighting;
		this.name = name;
		this.watt = watt;
		this.hargaSatuan = hargaSatuan;
		this.jumlah = jumlah;
	}

	public int getIdLighting() {
		return idLighting;
	}

	public void setIdLighting(int idLighting) {
		this.idLighting = idLighting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}

	public int getHargaSatuan() {
		return hargaSatuan;
	}

	public void setHargaSatuan(int hargaSatuan) {
		this.hargaSatuan = hargaSatuan;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	} 
	
	
	
	
		
	
	
}
