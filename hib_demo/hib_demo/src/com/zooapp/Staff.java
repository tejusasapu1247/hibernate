package com.zooapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF")
public class Staff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STAFF_ID")
private int staffId;
private String name;
private String salary;
private int age;
private String gender;

public Staff() {}

public int getStaffId() {
	return staffId;
}

public void setStaffId(int staffId) {
	this.staffId = staffId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSalary() {
	return salary;
}

public void setSalary(String salary) {
	this.salary = salary;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGendeer() {
	return gender;
}

public void setGendeer(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Staff [staffId=" + staffId + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender
			+ "]";
}


}
