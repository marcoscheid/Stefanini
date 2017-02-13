package br.com.stefanini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stefaniniId;
	@Column
	private String stefaniniName;
	@Column
	private String stefaniniDescription;
	
	public User(){}
	
	public User(int stefaniniId, String stefaniniName, String stefaniniDescription) {
		super();
		this.stefaniniId = stefaniniId;
		this.stefaniniName = stefaniniName;
		this.stefaniniDescription = stefaniniDescription;
	}

	public int getStefaniniId() {
		return stefaniniId;
	}

	public void setStefaniniId(int stefaniniId) {
		this.stefaniniId = stefaniniId;
	}

	public String getStefaniniName() {
		return stefaniniName;
	}

	public void setStefaniniName(String stefaniniName) {
		this.stefaniniName = stefaniniName;
	}

	public String getStefaniniDescription() {
		return stefaniniDescription;
	}

	public void setStefaniniDescription(String stefaniniDescription) {
		this.stefaniniDescription = stefaniniDescription;
	}
	
	
	

}
