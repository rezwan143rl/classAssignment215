/*
The user provides an integer N, and then prints the sum of the Fibonacci series up to that Nth
term. It should be done using recursion. The program will only end if 0 or 1 is given as input.
 */
import java.util.*;
public class Main {

    public static int fibonaccisum(int n)
    {
        int total=0;
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;
        else
            return fibonaccisum(n - 1) + fibonaccisum(n - 2)+1;
    }


    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Provide an integer value:");
        int N = x.nextInt();

        int totalfib= fibonaccisum(N);
        System.out.println("the sum of the Fibonacci series up to: "+N+ " is "+ totalfib);

    }
}