package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "id")
private int id;

@Column(name = "msg")
 private String msg;

@Column(name = "status")
 private String status;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
 
 
}
