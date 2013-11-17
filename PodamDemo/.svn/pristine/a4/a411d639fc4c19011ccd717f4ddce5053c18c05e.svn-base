package com.podam.sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import uk.co.jemos.podam.annotations.PodamCollection;

/**
 * Employee pojo
 * @author Neeraj
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4148205662482187821L;

	/**
	 * @param args
	 */
	private final int employeeId;

	private final String employeeCode;

	private final String description;

	// Let's have few addresses
	@PodamCollection(nbrElements = 2)
	private List<Address> address = new ArrayList<Address>();

	/**
	 * Full constructor.
	 * 
	 * @param employeeId
	 *            The employee id
	 * @param employeeCode
	 *            The employee code
	 * @param description
	 *            The description
	 * 
	 */

	/**
	 * @param employeeId
	 * @param employeeCode
	 * @param description
	 * @param address
	 */
	public Employee(int employeeId, String employeeCode, String description,
			List<Address> address) {
		super();
		this.employeeId = employeeId;
		this.employeeCode = employeeCode;
		this.description = description;
		this.address = address;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @return the employeeCode
	 */
	public String getEmployeeCode() {
		return employeeCode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the addresses
	 */
	public List<Address> getAddress() {
		return address;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.address = addresses;
	}

	/**
	 * Constructs a <code>String</code> with all attributes in name = value
	 * format.
	 * 
	 * @return a <code>String</code> representation of this object.
	 */
	@Override
	public String toString() {
		final String employeeString = "    ";

		StringBuilder employeeStringBuffer = new StringBuilder();

		employeeStringBuffer.append("Employee ( \n").append("employeeId = ")
				.append(employeeId).append(employeeString).append("\nemployeeCode = ")
				.append(employeeCode).append(employeeString).append("\ndescription = ")
				.append(description).append(employeeString).append("\naddress = ")
				.append(address).append(employeeString).append(" )\n\n");

		return employeeStringBuffer.toString();
	}

}
