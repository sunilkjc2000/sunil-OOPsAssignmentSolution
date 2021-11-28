package com.department.parent;

public class Superdepartment {
	public String departmentName() {
		return("Super Department");
	}
	public String getTodaysWork() {
		return("No Work as of now");
	}
	public String getWorkDeadline() {
		return("Nil");
	}
	public String isTodayAHoliday() {
		return("Today is not a holiday");
	}

	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
}

