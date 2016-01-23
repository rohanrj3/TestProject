package example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import EmpDetails.EmpBusinessLogic;
import EmpDetails.EmployeeDetails;


public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	@Test
	public void testCalculateAppriasal(){
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		Reporter.log("test Calculater"+ System.currentTimeMillis());
		Assert.assertEquals(500, appraisal, 0.0, "500");
	}
	// test to check yearly salary
	@Test
	public void testCalculateYearlySalary() {
	employee.setName("Rajeev");
	employee.setAge(25);
	employee.setMonthlySalary(8000);
	double salary = empBusinessLogic.calculateYearlySalary(employee);
	Reporter.log("test Calculater annual yearly salary"+ System.currentTimeMillis());
	Assert.assertEquals(96000, salary, 0.0, "8000");
	}
}
