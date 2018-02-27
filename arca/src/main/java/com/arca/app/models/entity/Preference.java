package com.arca.app.models.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "preference")
public class Preference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPreference;
	
	private long idUsers;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idSexType")
	private SexType sexType;

	
	public Long getIdPreference() {
		return idPreference;
	}

	public void setIdPreference(Long idPreference) {
		this.idPreference = idPreference;
	}

	public long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(long idUsers) {
		this.idUsers = idUsers;
	}

	public SexType getSexType() {
		return sexType;
	}

	public void setSexType(SexType sexType) {
		this.sexType = sexType;
	}
	
	
	
}
