package com.zooapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAGE")
public class Cage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CAGE_ID")
private int cageId;
private int cageNumber;
private String location;
public Cage(int cageNumber, String location) {
	this.cageNumber = cageNumber;
	this.location = location;
}
public int getCageId() {
	return cageId;
}
public void setCageId(int cageId) {
	this.cageId = cageId;
}
public int getCageNumber() {
	return cageNumber;
}
public void setCageNumber(int cageNumber) {
	this.cageNumber = cageNumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Cage() {
	super();
}
@Override
public String toString() {
	return "Cage [cageId=" + cageId + ", cageNumber=" + cageNumber + ", location=" + location + "]";
}



}
