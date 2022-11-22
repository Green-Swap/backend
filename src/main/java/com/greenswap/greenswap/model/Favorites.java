package com.greenswap.greenswap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Favorites")
public class Favorites {
	@Id
	private long id;
	
	@ManyToOne(targetEntity=Users.class) 
	private Users user;
	
	@ManyToOne(targetEntity=Plants.class) 
	private Plants plant;

	public Favorites() {
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

	public Plants getPlant() {
		return plant;
	}

	public void setPlant(Plants plant) {
		this.plant = plant;
	}
}
