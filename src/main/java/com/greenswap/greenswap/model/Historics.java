package com.greenswap.greenswap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Historics")
public class Historics {
	@Id
	private long id;
	
	@ManyToOne 
	private Users user;
	
	@ManyToOne(targetEntity=Users.class) 
	private Users userBis;
	
	@ManyToOne(targetEntity=Swaps.class) 
	private Swaps swap;
	
	public Historics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Users getUserBis() {
		return userBis;
	}

	public void setUserBis(Users userBis) {
		this.userBis = userBis;
	}



}
