/**
 * 
 */
package com.jagannath.git;

/**
 * @author arunangsu.sahu
 *
 */
public class Narayan {

	/**
	 * 
	 */
	public Narayan() {
		// No Argument Constructor
	}

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.setId("1");
		person.setName("Jagannath");
		displayPersonAppName(person);

	}
	
	public static void displayPersonAppName(Person person) {
		System.out.println("Person Name:"+person.getName());
	}

}
