package com.arca.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "favorite")
public class Favorite  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFavorite;
	
	private Long idUsers;
	
	private Long idUserFavorite;
	
	private String status;

	public Long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Long idUsers) {
		this.idUsers = idUsers;
	}

	public long getIdUserFavorite() {
		return idUserFavorite;
	}

	public void setIdUserFavorite(Long idUserFavorite) {
		this.idUserFavorite = idUserFavorite;
	}

	public Long getIdFavorite() {
		return idFavorite;
	}

	public void setIdFavorite(Long idFavorite) {
		this.idFavorite = idFavorite;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
