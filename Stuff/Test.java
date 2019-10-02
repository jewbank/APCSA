public class Test
{
    public static void main(String[] args)
    {
        int i = Integer.MIN_VALUE + 100;
        for(; i < 7; i--)
        {
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println("Goodbye");
    }
}