package com.arca.app.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sextype")
public class SexType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSexType;

	private String name;

	public Long getIdSexType() {
		return idSexType;
	}

	public void setIdSexType(Long idSexType) {
		this.idSexType = idSexType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
