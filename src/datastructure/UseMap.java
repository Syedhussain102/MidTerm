package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		List<String> employeesManagement = new ArrayList();
		employeesManagement.add("1st employee");
		employeesManagement.add("2nd employee");
		employeesManagement.add("3rd employee");

		List<String> employeesAccountant = new ArrayList();
		employeesAccountant.add("4th employee");
		employeesAccountant.add("5th employee");
		employeesAccountant.add("6th employee");

		List<String> employeesSales = new ArrayList();
		employeesSales.add("7th employee");
		employeesSales.add("8th employee");
		employeesSales.add("9th employee");


		Map<String, List<String>> map = new HashMap<String,List<String>>();
		map.put("Management", employeesManagement);
		map.put("Accountant", employeesAccountant);
		map.put("Sales", employeesSales);

		//for each loop
		for(Map.Entry key: map.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}

		System.out.println("****************************************");
		//Iterator with for loop

		Iterator it =map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		ConnectDB connect = new ConnectDB();
		//connect.insertDataFromMapToMySql((Map<String, List<String>>) map,"department","employees");
		connect.insertNewDataFromMapToMySql((List<String>) employeesManagement,"table1","employee");
		connect.insertNewDataFromMapToMySql((List<String>) employeesAccountant,"table1","employee");
		connect.insertNewDataFromMapToMySql((List<String>) employeesSales,"table1","employee");
	}

}