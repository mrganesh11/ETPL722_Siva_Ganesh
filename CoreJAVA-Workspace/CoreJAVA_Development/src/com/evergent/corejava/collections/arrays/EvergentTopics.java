/*New! Keyboard shortcuts … Drive keyboard shortcuts have been updated to give you first-letters navigation
EvergentTopics.java*/
package com.evergent.corejava.collections.arrays;

import java.io.Serializable;

public class EvergentTopics  {

	private String name;
	private String description;
	private String id;
	public EvergentTopics(String name, String description, String id) {

		this.name = name;
		this.description = description;
		this.id = id;
	}
	

	@Override
	public String toString() {

		return name + description + id;
	} 

}