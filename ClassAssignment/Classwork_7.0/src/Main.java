import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner x= new Scanner(System.in);
        Furniture Cabinet1=new Furniture();
        Furniture DefaultCabinet2 = new Furniture();

        System.out.println("Menu:");
        System.out.println("Press 1 to print default\npress 2 to define a Furniture");
        int inpt=x.nextInt();
        if(inpt==1)
            System.out.println(DefaultCabinet2.toString());
        else if (inpt==2) {
            System.out.print("Enter the type.:");
            x.skip("[\r\n]+");
            String type1 = x.nextLine();
            System.out.println(" ");
            System.out.print("IsColourful( true/false ):");
            boolean isColorful = x.nextBoolean();
            System.out.println(" ");
            System.out.print("No. of Door(s):");
            int numOfDoor = x.nextInt();
            System.out.println(" ");
            System.out.print("No. of Drawer(s):");
            int numOfDrawers = x.nextInt();
            System.out.println(" ");
            System.out.print("Cost (Tk):");
            double cost = x.nextDouble();
            System.out.println(" ");
            Cabinet1.information(type1, numOfDoor, numOfDrawers, isColorful, cost);
        }



    }
}
