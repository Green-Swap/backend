package com.greenswap.greenswap.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.greenswap.greenswap.model.Type;

@Entity
@Table(name = "Plant")
public class Plant {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "name", nullable = false)
	private String name;

	@ManyToOne(targetEntity = User.class)
	private User user;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "plant_type", joinColumns = {
			@JoinColumn(name = "plantId", referencedColumnName = "id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "typeId", referencedColumnName = "id", nullable = false, updatable = false) })
	private Set<Type> types = new HashSet<>();

	public Plant() {
		super();
		// TODO Auto-generated constructor stub
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Type> getTypes() {
		return types;
	}

	public void setTypes(Set<Type> types) {
		this.types = types;
	}
}
