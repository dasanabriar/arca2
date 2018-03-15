package com.arca.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContract;
	
	private Long idShoppingCart;
	
	private Long idUserHired;
	
	private int hoursHired;
	
	private String placeMeeting;
	
	private String refPlaceMeeting;
	
	private Date dateMeeting;
	
	private int price;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idServiceType")
	private ServiceType serviceType;
	
	/**
	 * Confirmed, Completed, Peticion, Rechazado
	 */
	private String status;

	public Long getIdContract() {
		return idContract;
	}

	public void setIdContract(Long idContract) {
		this.idContract = idContract;
	}

	public Long getIdShoppingCart() {
		return idShoppingCart;
	}

	public void setIdShoppingCart(Long idShoppingCart) {
		this.idShoppingCart = idShoppingCart;
	}

	public Long getIdUserHired() {
		return idUserHired;
	}

	public void setIdUserHired(Long idUserHired) {
		this.idUserHired = idUserHired;
	}

	public int getHoursHired() {
		return hoursHired;
	}

	public void setHoursHired(int hoursHired) {
		this.hoursHired = hoursHired;
	}

	public String getPlaceMeeting() {
		return placeMeeting;
	}

	public void setPlaceMeeting(String placeMeeting) {
		this.placeMeeting = placeMeeting;
	}

	public String getRefPlaceMeeting() {
		return refPlaceMeeting;
	}

	public void setRefPlaceMeeting(String refPlaceMeeting) {
		this.refPlaceMeeting = refPlaceMeeting;
	}

	public Date getDateMeeting() {
		return dateMeeting;
	}

	public void setDateMeeting(Date dateMeeting) {
		this.dateMeeting = dateMeeting;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
