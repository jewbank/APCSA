package boxBug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class TastyBug extends Bug
{
	@Override
	public void act()
	{
		if(Math.random() > .8) {
			turn();
			turn();
		}
		super.act();
	}
	@Override
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        WiltingFlower flower = new WiltingFlower();
        flower.putSelfInGrid(gr, loc);
    }
}
