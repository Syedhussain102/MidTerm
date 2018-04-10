package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo emp1 = new EmployeeInfo(1);
		EmployeeInfo emp2 = new EmployeeInfo("ABD",2);
		EmployeeInfo emp3 = new EmployeeInfo("faf",3,32);


		EmployeeInfo.calculateEmployeeBonus(70000,9);
		EmployeeInfo.calculateEmployeePension(10000);

		EmployeeInfo.innerClass refv = emp3.new innerClass();
		refv.innerMethod();





	}

}
