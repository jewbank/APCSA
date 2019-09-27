package ewtopia;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class Person extends Actor
{
  String name;
  int age;
  int money;
  int costOfLiving;
  
  Person significantOther;
  
  Job primaryJob;
  Job secondaryJob;

  private int direction = 0;
  
  public Person(String name)
  {
    this.name = name;
  }

  public Person(String n, int a, int m, int col)
  {
    this.name = n;
    this.age = a;
    this.money = m;
    this.costOfLiving = col;
  }

  @Override
  public void act()
  {
	  moveTo(getLocation().getAdjacentLocation(direction));
	  direction += 90;
  }
  
  public String toString()
  {
    return name;
  }
}