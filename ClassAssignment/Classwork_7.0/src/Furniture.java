public class Furniture {
    private int numOfDrawer;
    private String type;
    private boolean isColorful;
    private int numOfDoor;
    private double cost;

    public Furniture()
    {
        numOfDrawer=3;
        type="Large cabinet";
        isColorful=true;
        numOfDoor =2;
        cost= 19000;
    }

    public Furniture(int numOfDrawer ,String type, boolean isColorful ,int numOfDoor,double cost)
    {
        this.numOfDrawer=numOfDrawer;
        this.type=type;
        this.isColorful=isColorful;
        this.numOfDoor=numOfDoor;
        this.cost=cost;
    }

    public int getNumOfDrawer() {
        return numOfDrawer;
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public boolean getisColorful() {
        return isColorful;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColorful(boolean colorful) {
        this.isColorful = colorful;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
    }
    public void setNumOfDrawer(int numOfDrawer) {
        this.numOfDrawer = numOfDrawer;
    }

    @Override
    public String toString() {


        return "DEFAULT\nThe furniture type is a "+getType()+"\n"+ getisColorful()+ "\n"+getNumOfDoor()+
                " Doors(s)\n"+getNumOfDrawer()+" Drawer(s)\nThe cost of the furniture is "+getCost();
    }



    public void information(String type,int numOfDoor,int numOfDrawer, boolean colorful,double cost)
    {
        String bol;
        setType(type);
        setColorful(colorful);
        setNumOfDoor(numOfDoor);
        setNumOfDrawer(numOfDrawer);
        setCost(cost);
        if(!colorful)
            bol="no color";
        else
            bol="colorful";



        System.out.println("The furniture type is a "+getType()+"\n"+bol + "\n"+getNumOfDoor()+" Doors(s)\n"+getNumOfDrawer()+" Drawer(s)\nThe cost of the furniture is "+getCost());


    }



}
