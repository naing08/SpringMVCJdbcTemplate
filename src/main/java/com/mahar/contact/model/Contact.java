package com.mahar.contact.model;

public class Contact {
	private int id;
	private String name;
	private String dateofbirth;
	private String email;
	private String address;
	private String telephone;

	public Contact() {
	}

	public Contact(String name, String dateofbirth, String email, String address, String telephone) {
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
	}
	
	// getters and setters
	public int getId(){
		return id;
	}
	public void setId(int a){
		id = a;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String a){
		name = a;
	}
	
	public String getDateofbirth(){
		return this.dateofbirth;
	}
	public void setDateofbirth(String dateofbirth){
		this.dateofbirth = dateofbirth;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String a){
		email = a;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String a){
		address = a;
	}
	
	public String getTelephone(){
		return telephone;
	}
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
}
