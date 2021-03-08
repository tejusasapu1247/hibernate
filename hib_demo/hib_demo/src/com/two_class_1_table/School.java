package com.two_class_1_table;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shoolId;
	private String schoolName;
	@Embedded
	private SchoolDetails schoolDetails;
	
	public School() {}
	
	public School(String schoolName, SchoolDetails schoolDetails) {
		this.schoolName = schoolName;
		this.schoolDetails = schoolDetails;
	}

	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public SchoolDetails getSchoolDetails() {
		return schoolDetails;
	}
	public void setSchoolDetails(SchoolDetails schoolDetails) {
		this.schoolDetails = schoolDetails;
	}
	@Override
	public String toString() {
		return "School [shoolId=" + shoolId + ", schoolName=" + schoolName + ", schoolDetails=" + schoolDetails + "]";
	}
	
	
}
