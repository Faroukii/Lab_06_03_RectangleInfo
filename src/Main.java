import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        String trash = "";
        System.out.println("Please enter the length: ");
        //We give Length, Width, and trash values
        //System asks user for length
        if (in.hasNextInt())
        {
            length = in.nextInt();
            System.out.println("Please enter the width: ");
            //System asks for width
            if (in.hasNextInt())
            {
                width = in.nextInt();
                System.out.println("The area of your rectangle is:" + (length * width));
                System.out.println("The diagonal of your rectangle is: " + ((length * length) + (width *width)));
        //formula for the area and the diagonal
            }
            else
            {
                System.out.println("Please enter correct value: " + trash);
                //Trash for when incorrect length input
            }
        }

        else
        {
            trash = in.nextLine();
            System.out.println("Please enter correct value: " + trash);
            //Trash for when incorrect width input
        }

    }
}