package com.greenswap.greenswap.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.greenswap.greenswap.model.Plant;

@Entity
@Table(name = "Type")
public class Type {
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "name", nullable = false)
	private String name;

	@ManyToMany(mappedBy = "types", fetch = FetchType.LAZY)
	private Set<Plant> plants  = new HashSet<>();

	public Type() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Plant> getPlants() {
		return plants;
	}

	public void setPlants(Set<Plant> plants) {
		this.plants = plants;
	}

}
