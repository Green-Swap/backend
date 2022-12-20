package com.greenswap.greenswap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Favorite")
public class Favorite {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(targetEntity=User.class) 
	private User user;
	
	@ManyToOne(targetEntity=Plant.class) 
	private Plant plant;

	public Favorite() {
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

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}
}
