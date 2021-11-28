package com.department.driver;
import com.department.admin.*;
import com.department.hr.*;
import com.department.tech.*;

// Main driver routine
public class Departmentdriver {

	public static void main(String args[]) {
		Admindepartment admin = new Admindepartment();
		Hrdepartment    hr = new Hrdepartment();
		Techdepartment  tech = new Techdepartment();
		
		// Display department info
		admin.display();
		hr.display();
		tech.display();
	}

}
