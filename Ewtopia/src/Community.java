import java.util.ArrayList;
import javax.swing.*;

public class Community
{
  // Attributes
  String name;
  ArrayList<Person> members;

  public Community(String name)
  {
    this.name = name;
    this.members = new ArrayList<Person>();
  }

  public void addStartingPeople()
  {
    members.add(new Person("Bob", 30, 15000, 30000));
  }

  public String toString()
  {
    return name;
  }
}