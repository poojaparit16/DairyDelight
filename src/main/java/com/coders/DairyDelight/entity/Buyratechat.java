package com.coders.DairyDelight.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Buyratechat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String animalType;
	private float fat;
	private float snf;
	private float rate;
	private Date date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnimalType() {
		return animalType;
	}
	public float getFat() {
		return fat;
	}
	public void setFat(float fat) {
		this.fat = fat;
	}
	public float getSnf() {
		return snf;
	}
	public void setSnf(float snf) {
		this.snf = snf;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		if (date != null) {
			this.date = date;
		}
	}
	public void setAnimalType(String animalType) {
		if (animalType != null) {
			this.animalType = animalType;
		}
	}
}
