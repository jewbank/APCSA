package ewtopia;

import java.util.ArrayList;
import info.gridworld.actor.ActorWorld;

public class Community extends ActorWorld {
	// Attributes
	String name;
	ArrayList<Person> members;

	public Community(String name) {
		super();
//		System.getProperty("info.gridworld.gui.frametitle")
		System.setProperty("info.gridworld.gui.frametitle", name);
		this.name = name;
		this.members = new ArrayList<Person>();
	}

	public void addStartingPeople() {
		members.add(new Person("Bob", 30, 15000, 30000));
	}

	public String toString() {
		return name;
	}
}