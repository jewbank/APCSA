package ewtopia;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.Color;

public class Runner

{
	public static void main(String[] args) {
		//		ActorWorld world = new ActorWorld();

		Community myCommunity = new Community("Ewtopia");

		myCommunity.show();
	}
}