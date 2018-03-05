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
	//@GeneratedValue(generator = "seqPre")
	//@SequenceGenerator(name = "seqPre", sequenceName = "SC_PRESENTACION_SEQ", allocationSize = 1)
	
	
	private long idUsers;
	
	private long idUserFavorite;
	
	private String status;

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
