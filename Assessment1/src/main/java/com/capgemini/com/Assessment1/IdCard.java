package com.capgemini.com.Assessment1;

import javax.persistence.*;

@Entity
public class IdCard {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String cardNumber;
	private String date;
	
	@OneToOne()
	@JoinColumn(name="employee_id",referencedColumnName = "id")
	private Employee employee;

	public IdCard(Long id, String cardNumber, String date, Employee employee) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.date = date;
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "IdCard [id=" + id + ", cardNumber=" + cardNumber + ", date=" + date + ", employee=" + employee + "]";
	}
	
}
