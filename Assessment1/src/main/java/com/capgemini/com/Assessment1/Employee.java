package com.capgemini.com.Assessment1;

import javax.persistence.*;

@Entity
public class Employee {

   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long id;
   
   private String name;
   private String email;
   
   @OneToOne(mappedBy="employee",cascade=CascadeType.ALL)
   
   private IdCard idcard;
   
   public Employee(){
	   
   }

   public Employee(Long id, String name, String email, IdCard idcard) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.idcard = idcard;
   }

   public Long getId() {
	return id;
   }

   public void setId(Long id) {
	this.id = id;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public String getEmail() {
	return email;
   }

   public void setEmail(String email) {
	this.email = email;
   }

   public IdCard getIdcard() {
	return idcard;
   }

   public void setIdcard(IdCard idcard) {
	this.idcard = idcard;
   }

   @Override
   public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
   }
   
   
}

