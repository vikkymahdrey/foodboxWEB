package com.team.foodybox.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the viewer database table.
 * 
 */
@Entity
@NamedQuery(name="Viewer.findAll", query="SELECT v FROM Viewer v")
public class Viewer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String contactNo;

	private String email;

	private String message;

	private String name;
	
	@Column(name = "CREATED_DT")
	private Date createdDt;

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public Viewer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}