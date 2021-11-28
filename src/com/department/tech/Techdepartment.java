package com.department.tech;

import com.department.parent.Superdepartment;

public class Techdepartment extends Superdepartment{

	public String departmentName() {
		return("\nWelcome to Tech Department");
	}

	public String getTodaysWork() {
		return("Complete coding of module 1");
	}

	public String getWorkDeadline() {
		return("Complete by EOD");
	}	

	public String getTechStackInformation() {
		return("core Java");
	}

	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
	}
}
