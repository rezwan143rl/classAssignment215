import java.util.Scanner;
public class Main {

    public static int multiply(int x){
        int total =1; //initialization of total multiple
        for(int i=1; i<=x; i++)
        {
            if(i%4==0)
            {
                total=total*i; //updates the total
            }
        }
       return total; // returns total
    }


    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Scanner x= new Scanner(System.in);

        System.out.println("Enter a single Integer value:");
        int n = x.nextInt(); //taking user input
        int multiplication;
        multiplication = multiply(n); // using the multiply method


        System.out.println("The multiplication of every multiple of 4 from 1 up to "+n + " is " + multiplication);//printing result

    }
}