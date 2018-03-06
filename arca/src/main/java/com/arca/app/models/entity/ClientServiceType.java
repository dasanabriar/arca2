package com.arca.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	private Long idServiceType;

	private Long idUsers;

	public Long getIdClientServiceType() {
		return idClientServiceType;
	}

	public void setIdClientServiceType(Long idClientServiceType) {
		this.idClientServiceType = idClientServiceType;
	}

	public Long getIdServiceType() {
		return idServiceType;
	}

	public void setIdServiceType(Long idServiceType) {
		this.idServiceType = idServiceType;
	}

	public Long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Long idUsers) {
		this.idUsers = idUsers;
	}

	
}
