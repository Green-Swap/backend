package com.greenswap.greenswap.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Connexion")
public class Connexion {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(targetEntity=User.class) 
	private User user;
	
	@Column(name = "date", nullable = false)
	private Date date;
	
	@Column(name = "succesfull", nullable = false)
	private boolean succesfull;

	public Connexion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isSuccesfull() {
		return succesfull;
	}

	public void setSuccesfull(boolean succesfull) {
		this.succesfull = succesfull;
	}
	
}
