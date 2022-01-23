import java.util.Scanner;

public class MainShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean end = false;
		int select;
		Scanner keyboard = new Scanner(System.in);

		Shop buying = new Shop();

		do
		{
			

			System.out.println("=== Shopping ===");
			System.out.println("1.Shirt 150 baht");
			System.out.println("2. Bag 990 baht");
			System.out.println("3.Shoes 1690 baht");
			System.out.println("4.View Cart");
			System.out.println("5.Exit");
			System.out.println("================");

			System.out.print("Choose 1-5: ");	
			select = keyboard.nextInt();

			switch(select)
			{
				

				case 1: buying.addShirtAmount();
				break;

				case 2: buying.addBagAmount();
				break;

				case 3: buying.addShoesAmount();
				break;

				case 4: buying.viewCart();
				break;

				case 5: end = true;
				break;

				default: System.out.println("Only 1-5");
				break;
			}


		}while(end == false);


	}

}
