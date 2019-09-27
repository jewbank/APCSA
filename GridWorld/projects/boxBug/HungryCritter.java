package boxBug;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class HungryCritter extends Critter{

	int hunger;
	
	public HungryCritter()
	{
		hunger = 0;
	}
	
	@Override
	public void act()
	{
		hunger++;
		BoxBugRunner.world.setMessage("I am " + hunger + " hungry.");
		if(hunger > 25) {
			BoxBugRunner.world.setMessage("I am ded.");
			this.removeSelfFromGrid();
			return;
		}
        if (getGrid() == null)
            return;
        ArrayList<Actor> actors = getActors();
        processActors(actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
	}
	
	@Override
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (a instanceof Bug) {
                a.removeSelfFromGrid();
                
                BoxBugRunner.world.add(new TastyBug());
                hunger = 0;
            }
        }
    }
}
