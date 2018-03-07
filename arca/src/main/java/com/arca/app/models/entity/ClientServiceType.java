package com.arca.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientservicetype")
public class ClientServiceType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClientServiceType;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idServiceType")
	private ServiceType serviceType;

	private Long idUsers;
	
	private int priceService;

	public Long getIdClientServiceType() {
		return idClientServiceType;
	}

	public void setIdClientServiceType(Long idClientServiceType) {
		this.idClientServiceType = idClientServiceType;
	}

	public Long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Long idUsers) {
		this.idUsers = idUsers;
	}

	public int getPriceService() {
		return priceService;
	}

	public void setPriceService(int priceService) {
		this.priceService = priceService;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

}
