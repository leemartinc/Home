import java.util.*;
public class fibonacci {
    public static void main (String[] args){

        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print("The Fibonacci number less that " + number + " are: 1, 1");

        while (c+a < number){

            c=a+b;

            a=b;

            System.out.print(", " + c);

            b=c;
        }


    }
}
