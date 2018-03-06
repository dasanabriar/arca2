package com.arca.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsers;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userName;
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	@Temporal(TemporalType.DATE)
	private Date dateBirth;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsers")
    private List<Photo> photos;
	
	/**
	 * can be a user client(0) or an user normal(1).
	 */
	private int userType;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idCity")
	private City city;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsers")
    private List<Favorite> favorites;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idSexType")
	private SexType sexType;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsers")
	private List<Preference> preferences;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsers")
	private List<ClientServiceType> clientServicesType;

	public Long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Long idUsers) {
		this.idUsers = idUsers;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public SexType getSexType() {
		return sexType;
	}

	public void setSexType(SexType sexType) {
		this.sexType = sexType;
	}

	public List<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public List<ClientServiceType> getClientServicesType() {
		return clientServicesType;
	}

	public void setClientServicesType(List<ClientServiceType> clientServicesType) {
		this.clientServicesType = clientServicesType;
	}


	/**
	 * Auto generated
	 */
	private static final long serialVersionUID = 1L;

}
