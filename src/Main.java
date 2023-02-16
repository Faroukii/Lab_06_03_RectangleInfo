import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        String trash = "";
        System.out.println("Please enter the length: ");

        if (in.hasNextInt())
        {
            length = in.nextInt();
            System.out.println("Please enter the width: ");
            if (in.hasNextInt())
            {
                width = in.nextInt();
                System.out.println("The area of your rectangle is:" + (length * width));
                System.out.println("The diagonal of your rectangle is: " + ((length * length) + (width *width)));

            }
            else
            {
                System.out.println("Please enter correct value: " + trash);
            }
        }

        else
        {
            trash = in.nextLine();
            System.out.println("Please enter correct value: " + trash);
        }

    }
}