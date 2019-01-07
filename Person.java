/**
 * 
 */
package com.jagannath.git;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3026107223766673701L;
	private  String id;
	private  String name;

	/**
	 * 
	 */
	public Person() {
		// No Argument Constructor
	}
	
	/**
	 * @param id
	 * @param name
	 */
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public  String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public  void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public  String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public  void setName(String name) {
		this.name = name;
	}
	
	

}
