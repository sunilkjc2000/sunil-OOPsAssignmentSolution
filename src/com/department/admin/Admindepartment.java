package com.department.admin;

import com.department.parent.Superdepartment;

public class Admindepartment extends Superdepartment {

	public String departmentName() {
		return("\nWelcome to Admin Department");
	}

	public String getTodaysWork() {
		return("Complete your documents Submission");
	}

	public String getWorkDeadline() {
		return("Complete by EOD");
	}	

	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}

}
