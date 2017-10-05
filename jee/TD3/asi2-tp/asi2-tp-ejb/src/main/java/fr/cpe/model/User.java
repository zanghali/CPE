package fr.cpe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;	

	@Column(name="login", nullable=false, unique=true)
	private int login;

	@Column(name="password", nullable=false)
	private int password;

	@Column(name="first_name")
	private int first_name;

	@Column(name="last_name")
	private int last_name;

	@Column(name="birthdate")
	private int birthdate;

	// Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getFirst_name() {
		return first_name;
	}

	public void setFirst_name(int first_name) {
		this.first_name = first_name;
	}

	public int getLast_name() {
		return last_name;
	}

	public void setLast_name(int last_name) {
		this.last_name = last_name;
	}

	public int getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
	}	
}