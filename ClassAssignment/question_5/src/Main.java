/*
The lengths of the adjacent/opposite sides of a right triangle should be taken from the user, and
suppose that the lengths of these two sides (adjacent & opposite) are equal. You must display a
right-facing triangle with the character * filled in according to the lengths of its adjacent and
opposite lines, as shown :

 */
import java.util.*;
public class  Main {
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the length of a right triangle's adjacent/opposite side:");

        int lngth = x.nextInt();
        int updatedlenght = lngth;
        for (int i=0 ;i<lngth;i++)
        {
            for (int j=0;j<updatedlenght-1;j++)
            {
                System.out.print(" ");
            }
            updatedlenght--;
            for (int k=0;k<lngth-updatedlenght;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}