package com.podam.sample;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 * Main method to populate random java object
 * @author Neeraj
 *
 */
public class MainClass {

	private static Logger logger = LogManager.getLogger(MainClass.class.getName());
	
	/**
	 * Main method to display the auto generated list of employee object.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numberOfObjects = getNumberOfObjectsFromInput(args);
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = null;
		PodamFactory factory = new PodamFactoryImpl();
		
		for(int i=0; i<numberOfObjects; i++) {
			employee = factory.manufacturePojo(Employee.class);
			employees.add(employee);
		}
		
		printEmployeeList(employees);
	}

	/**
	 * Method to print employee object
	 * @param employees
	 */
	private static void printEmployeeList(List<Employee> employees) {
		int count = 1;
		for(Employee emp: employees) {
			int addCount = 1;
			logger.info("*************Tom Employee("+count+")*************");
			logger.info("EmpId:\t"+emp.getEmployeeId());
			logger.info("EmpCode:\t"+emp.getEmployeeCode());
			logger.info("Description:\t"+emp.getDescription());
			for(Address address: emp.getAddress()) {
				logger.info("\t*************Address("+addCount+")*************");
				logger.info("\tEmp Address1\t"+address.getAddress1());
				logger.info("\tEmp Address2\t"+address.getAddress2());
				logger.info("\tEmp City\t"+address.getCity());
				logger.info("\tEmp ZipCode\t"+address.getZipCode());
				logger.info("\t*************Address("+addCount+")*************");
				addCount++;
			}
			logger.info("*************Employee("+count+")*************");
			count++;
		}		
	}

	/**
	 * Method to get number of objects input from argument
	 * @param args
	 * @return
	 */
	private static int getNumberOfObjectsFromInput(String[] args) {
		
		int numberOfObjects = 1;
		
		if(args != null && args.length > 0 && args[0] != null) {
			try {
				numberOfObjects = Integer.parseInt(args[0]);
				if(numberOfObjects < 0) {
					numberOfObjects = 0;
				}
			} catch(Exception e) {
				numberOfObjects = 1;
			}
		}
		
		return numberOfObjects;
	}
}
