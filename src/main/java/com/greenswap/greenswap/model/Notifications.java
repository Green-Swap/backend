package com.greenswap.greenswap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Notifications")
public class Notifications {
	@Id
	private long id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "content", nullable = false)
	private String content;
	
	@Column(name = "redirection", nullable = false)
	private String redirection;
	
	@Column(name = "seen", nullable = false)
	private boolean seen;
	
	@ManyToOne(targetEntity=Users.class)
	private Users user;

	public Notifications() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRedirection() {
		return redirection;
	}

	public void setRedirection(String redirection) {
		this.redirection = redirection;
	}

	public boolean isSeen() {
		return seen;
	}

	public void setSeen(boolean seen) {
		this.seen = seen;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}
