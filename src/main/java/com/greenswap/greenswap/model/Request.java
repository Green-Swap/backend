package com.greenswap.greenswap.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Request")
public class Request {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(targetEntity=User.class) 
	private User user;
	
	@ManyToOne(targetEntity=User.class) 
	private User admin;
	
	@Column(name = "requestDate", nullable = false)
	private Date requestDate;
	
	@Column(name = "doneDate", nullable = false)
	private Date doneDate;
	
	@Column(name = "isDone", nullable = false)
	private boolean isDone;

	public Request() {
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

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
}
