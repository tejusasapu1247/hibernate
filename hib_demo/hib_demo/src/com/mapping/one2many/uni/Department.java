package com.mapping.one2many.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="d_table_one2many_uni")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String detpName;
	
	@JoinColumn(name="did_fk")
	@OneToMany(cascade= {CascadeType.ALL,CascadeType.DETACH} )
	private List<Employee>employees=new ArrayList<Employee>();
	
	public Department() {}
	public Department(String detpName) {
		this.detpName = detpName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDetpName() {
		return detpName;
	}
	public void setDetpName(String detpName) {
		this.detpName = detpName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", detpName=" + detpName + ", employees=" + employees + "]";
	}


}
