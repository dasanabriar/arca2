package com.arca.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicetype")
public class ServiceType  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idServiceType;

	private String nameService;
	
	private int codeService;
	
	private int priceService;

	public Long getIdServiceType() {
		return idServiceType;
	}

	public void setIdServiceType(Long idServiceType) {
		this.idServiceType = idServiceType;
	}

	public String getNameService() {
		return nameService;
	}

	public void setNameService(String nameService) {
		this.nameService = nameService;
	}

	public int getCodeService() {
		return codeService;
	}

	public void setCodeService(int codeService) {
		this.codeService = codeService;
	}

	public int getPriceService() {
		return priceService;
	}

	public void setPriceService(int priceService) {
		this.priceService = priceService;
	}
	
}
