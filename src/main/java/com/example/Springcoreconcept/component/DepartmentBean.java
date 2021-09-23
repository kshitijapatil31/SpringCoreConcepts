package com.example.Springcoreconcept.component;

import org.springframework.stereotype.Component;


@Component
public class DepartmentBean {
	public String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
