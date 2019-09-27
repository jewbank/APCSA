package ewtopia;

import info.gridworld.actor.ActorWorld;

public class Community extends ActorWorld {
	// Attributes
	String name;

	public Community(String name) {
		super();
		System.setProperty("info.gridworld.gui.frametitle", name);
		this.name = name;
	}

	public void addStartingPeople() {
		add(new Person("Bobert"));
	}

	public String toString() {
		return name;
	}
}