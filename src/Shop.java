import java.util.Scanner;


public class Shop {

    Scanner keyboard = new Scanner(System.in);

	private int     shirtAmount     = 0;
    private double  shirtPrice      = 150.0;
    private int     bagAmout        = 0 ;
    private double  bagPrice        = 990.0;
    private int     shoesAmount     = 0;
    private double  shoesPrice      = 1690.0;

    public Shop()
    {
        
    }

    // public int getShirtAmount()
    // {
    //     return shirtAmount;
    // }

    // public double getShirtPrice()
    // {
    //     return shirtPrice;
    // }

    // public int getBagAmout()
    // {
    //     return bagAmout;
    // }

    // public double getBagPrice()
    // {
    //     return bagPrice;
    // }

    // public int getShoesAmount()
    // {
    //     return shoesAmount;
    // }

    // public double getShoesPrice()
    // {
    //     return shoesPrice;
    // }



    public void addShirtAmount()
    {
        shirtAmount++;
    }

    public void addBagAmount()
    {
        bagAmout++;
    }

    public void addShoesAmount()
    {
        shoesAmount++;
    }

    public void viewCart()
    {
        
        System.out.println("\n-- Cart Summary --");
        System.out.println("Shirt: " + shirtAmount);
        System.out.println("Bag: " + bagAmout);
        System.out.println("Shoes: " + shoesAmount);
        
        double total_price = (shirtPrice*shirtAmount) + (bagPrice*bagAmout) + (shoesPrice*shoesAmount);

        System.out.println("Total price = " + total_price + " baht");
        System.out.println("---------------------\n");

        
    }
}
