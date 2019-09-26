package ewtopia;
public class Person
{
  String name;
  int age;
  int money;
  int costOfLiving;
  
  Person significantOther;
  
  Job primaryJob;
  Job secondaryJob;

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

  public String toString()
  {
    return name;
  }
}