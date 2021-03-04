package com.luv2code.springsecurity.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="user2")
public class User2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_detail_id")
	private User_details userDetailsId;

	public User2() {}

	public User2(int id, String firstName, String lastName, String email, User_details userDetailsId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userDetailsId = userDetailsId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public User_details getUserDetailsId() {
		return userDetailsId;
	}


	public void setUserDetailsId(User_details userDetailsId) {
		this.userDetailsId = userDetailsId;
	}


	@Override
	public String toString() {
		return "User2 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", userDetailsId=" + userDetailsId + "]";
	}



	
	

}
