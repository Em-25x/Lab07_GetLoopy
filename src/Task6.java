public class Task6
{
    public static void main(String[] args)
    {
        for(int column = 1; column <= 5; column++)
        {
            for(int row = column; row >= 1; row--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
