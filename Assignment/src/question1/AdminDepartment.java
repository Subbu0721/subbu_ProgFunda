package question1;
	


public class AdminDepartment extends SuperDepartment{

	//method to print the welcome message from admin Department
	public String departmentName() {

		return " Welcome to Admin Department";
	
	}

	//method to print todays work
	public String getTodaysWork() {

		return "Complete your Document Submission";
	
	}

	//method to print the deadline for the given work
	public String getWorkDeadline() {

		return "Complete by EOD";
		
	}

}
