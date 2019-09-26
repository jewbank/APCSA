import java.util.ArrayList;
import java.util.Arrays;

public class Runner 
{
	public static void main(String[] args)
	{
		APList myList = new APList();
		for(int i = 0; i < 11; i++)
		{
			myList.add((int)(Math.random()*100));	
		}
		System.out.println("Hi");
	}
}
