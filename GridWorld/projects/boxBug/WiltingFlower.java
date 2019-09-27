package boxBug;

import info.gridworld.actor.*;

public class WiltingFlower extends Flower {
	int numTicks;
	
	public WiltingFlower()
	{
		super();
		numTicks = 0;
	}
	
	public void act()
	{
		numTicks++;
		if(numTicks > 10)
		{
			removeSelfFromGrid();
			return;
		}
		super.act();
	}
}
