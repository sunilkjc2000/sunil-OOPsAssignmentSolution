package com.department.hr;

import com.department.parent.Superdepartment;

public class Hrdepartment extends Superdepartment {
	public String departmentName() {
		return("\nWelcome to Hr Department");
	}

	public String getTodaysWork() {
		return("Fill today’s timesheet and mark your attendance");
	}

	public String getWorkDeadline() {
		return("Complete by EOD");
	}	

	public String doActivity() {
		return("team Lunch");
	}

	public void display() {
		System.out.println(departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}

}
