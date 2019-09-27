package boxBug;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.awt.Color;
/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxBugRunner
{
	public static ActorWorld world = new ActorWorld();
    public static void main(String[] args)
    {
        

    	HungryCritter ian = new HungryCritter();
        

        world.add(new Location(5, 5), ian);
        world.add(new Location(5, 0), new TastyBug());
        world.add(new Location(0, 5), new TastyBug());
        world.add(new Location(0, 0), new TastyBug());
        world.show();
    }
}