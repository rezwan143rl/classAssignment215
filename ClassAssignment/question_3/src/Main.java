/*Write a program where the user will provide an integer n and the program will print the sum of
        even numbers up to N.
        Example:
        Enter an integer: 6
        Result: 12
        N.B: The sum of 2+4+6 = 12, hence it should print 12 */


import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        Scanner x = new Scanner(System.in);

        System.out.println("Provide an integer:");
        int n= x.nextInt();

        int total=0;

        for (int i=1;i<=n;i++)
        {
            if(i%2==0)
                total=i+total;
        }
        System.out.println("The the sum of even numbers up to "+n +" is "+ total);

    }
}