import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args) {
        boolean done = false;
        String cont = "";
        Scanner in = new Scanner(System.in);
        do {
            int die1 = 0;
            int die2 = 1;
            int die3 = 2;
            int rollNumber = 0;
            int sum = 3;
            Random rand = new Random();
            System.out.println("roll   die1  die2  die3   sum");
            System.out.println("------------------------------------");
            while (die1 != die2 || die2 != die3 || die1 != die3) {
                rollNumber += 1;
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                System.out.printf("%5d %5d %5d %5d %5d", rollNumber, die1, die2, die3, sum);
                System.out.println();
            }
            System.out.print("Answer in [Y/N], would you like to continue rolling?: ");
            cont = in.nextLine();
            if (cont.equalsIgnoreCase("N"))
            {
                done = true;
            }
        } while(!done);
    }
}
