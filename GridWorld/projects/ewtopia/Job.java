package ewtopia;
public class Job
{
  String title;
  int yearsExperience;
  int startingSalary;
  double yearlyRaise;

  public Job(String title, int salary)
  {
    this.title = title;
    this.startingSalary = salary;
    this.yearsExperience = 0;
    this.yearlyRaise = .02; 
  }
  
  public int getSalary()
  {
    return (int)(startingSalary * Math.pow(1 + yearlyRaise, yearsExperience)); 
  }

  public String toString()
  {
    return title + " ($" + startingSalary +")";
  }
}