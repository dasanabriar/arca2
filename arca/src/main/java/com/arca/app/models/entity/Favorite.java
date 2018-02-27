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
	
	private long idUsers;
	
	private long idUserFavorite;

	public long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(long idUsers) {
		this.idUsers = idUsers;
	}

	public long getIdUserFavorite() {
		return idUserFavorite;
	}

	public void setIdUserFavorite(long idUserFavorite) {
		this.idUserFavorite = idUserFavorite;
	}
	
	
	
}
