package com.greenswap.greenswap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Historic")
public class Historic {
	@Id
	private long id;
	
	@ManyToOne(targetEntity=User.class) 
	private User user;
	
	@ManyToOne(targetEntity=User.class) 
	private User userBis;
	
	@ManyToOne(targetEntity=Swap.class) 
	private Swap swap;
	
	public Historic() {
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

	public User getUserBis() {
		return userBis;
	}

	public void setUserBis(User userBis) {
		this.userBis = userBis;
	}

	public Swap getSwap() {
		return swap;
	}

	public void setSwap(Swap swap) {
		this.swap = swap;
	}
}
