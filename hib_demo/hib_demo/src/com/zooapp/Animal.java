package com.zooapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANIMAL")
public class Animal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ANIMAL_ID")
private int animalId;
private String type;;
private int totalNumber;


public int getAnimalId() {
	return animalId;
}
public void setAnimalId(int animalId) {
	this.animalId = animalId;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getTotalNumber() {
	return totalNumber;
}
public void setTotalnumber(int totalNumber) {
	this.totalNumber = totalNumber;
}
public Animal(String type, int totalNumber) {
	super();
	this.type = type;
	this.totalNumber = totalNumber;
}
public Animal() {
}
@Override
public String toString() {
	return "Animal [animalId=" + animalId + ", type=" + type + ", totalNumber=" + totalNumber + "]";
}

}
