package question1;

public class Main {

	public static void main(String[] args) {
		//creating the object of AdminDepartment class
		AdminDepartment obj1 = new AdminDepartment();

		//creating the object of HrDepartment class
		HrDepartment obj2 = new HrDepartment();

		//creating the object of TechDepartment class
		TechDepartment obj3 = new TechDepartment();

		//printing outputs from the methods of AdminDepartment class
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());

		System.out.println();

		//printing outputs from the methods of HrDepartment class
		System.out.println(obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());

		System.out.println();

		//printing outputs from the methods of TechDepartment class
		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj1.isTodayAHoliday());

	}

}
