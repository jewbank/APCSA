
public class APList 
{
	private int[] data;
	private int size;
	
	public APList()
	{
		data = new int[10];
		size = 0;
	}
	
	public boolean add(int num)
	{
		if(size == data.length)
		{
			int[] temp = new int[size * 2];
			for(int i = 0; i < data.length; i++)
				temp[i] = data[i];
			data = temp;
		}
		data[size] = num;
		size++;
		return true;
	}
	
	public int get(int index)
	{
		return data[index];
	}
	
	public int remove(int index)
	{
		int value = data[index]; 
		for(int i = index; i < size; i++)
		{
			data[i] = data[i+1];
		}
		size--;
		return value;
	}

	public int size()
	{
		return size;
	}
}
