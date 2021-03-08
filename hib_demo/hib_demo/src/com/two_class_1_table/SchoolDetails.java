package com.two_class_1_table;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails {
	private String schoolAddress;
	private boolean isPublicSchool;
	private int studentCount;
	
	
	public SchoolDetails() {}
	
	public SchoolDetails(String schoolAddress, boolean isPublicSchool, int studentCount) {
		this.schoolAddress = schoolAddress;
		this.isPublicSchool = isPublicSchool;
		this.studentCount = studentCount;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public boolean isPublicSchool() {
		return isPublicSchool;
	}
	public void setPublicSchool(boolean isPublicSchool) {
		this.isPublicSchool = isPublicSchool;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	@Override
	public String toString() {
		return "SchoolDetails [schoolAddress=" + schoolAddress + ", isPublicSchool=" + isPublicSchool
				+ ", studentCount=" + studentCount + "]";
	}
	
}
