import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Scanner Class Object Declaration
        Scanner scan = new Scanner(System.in);


        // Variable Declarations & Initializations
        int userNum;
        String answer;


        // USER GREETING
        System.out.println("Learn your squares and cubes!");
        System.out.println();

        // INPUT, PROCESSING AND OUTPUT

        do {
            System.out.println();
            System.out.print("Enter an integer: ");
            userNum = scan.nextInt();
            scan.nextLine();

            if((userNum < 1) || (userNum > 100))
            {
                System.out.println("Please enter a number between 1 - 100.");
            }
            else
            {
                System.out.println("Number\t" + "Squared\t" + "Cubed");


                for (int i = 1; userNum >= i; i++)
                {
                    System.out.println(i + "\t" + "\t" + square(i) + "\t" + "\t" + cube(i));
                }
            }
            System.out.println();
            System.out.print("Continue? (y/n): ");
            answer = scan.nextLine();

        }while(answer.equals("y"));

        //Square and Cube Methods

    }

    public static int square(int a)
    {
        int userNum = a;

        int square = userNum * userNum;

        return square;
    }

    public static int cube(int b)
    {
        int userNum = b;

        int cube = userNum * userNum * userNum;

        return cube;
    }
} // END OF MAIN
