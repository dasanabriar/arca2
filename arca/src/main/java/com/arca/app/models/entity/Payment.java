package com.arca.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPayment;

	private Long idShoppingCart;

	// Completed, Incomplete, InProgress
	private String status;

	private int price;

	private Date paymentDate;
	
	private Long referencePayment;
	
	private Long idMethodPayment;

	public Long getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}

	public Long getIdShoppingCart() {
		return idShoppingCart;
	}

	public void setIdShoppingCart(Long idShoppingCart) {
		this.idShoppingCart = idShoppingCart;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Long getReferencePayment() {
		return referencePayment;
	}

	public void setReferencePayment(Long referencePayment) {
		this.referencePayment = referencePayment;
	}

	public Long getIdMethodPayment() {
		return idMethodPayment;
	}

	public void setIdMethodPayment(Long idMethodPayment) {
		this.idMethodPayment = idMethodPayment;
	}
	
}
