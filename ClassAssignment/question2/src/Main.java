/*2.Ask the user to enter a string and print its palindrome. For example:
        Enter a string: 10011
        Palindrome of the string: 11001
        Enter a string: output
        Palindrome of the string: tuptuo*/
import java.util.*;


public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inpt = x.nextLine();

        char[] outpt = new char[inpt.length()];
        int L = inpt.length();
        int K = inpt.length();
        for(int i=0;i<K;i++)
        {
         outpt[i]=inpt.charAt(L-1);
         L--;

        }
        System.out.print("the palindrome is ");
        for(int i=0;i<K;i++) {
            System.out.print( outpt[i]);
        }


    }
}