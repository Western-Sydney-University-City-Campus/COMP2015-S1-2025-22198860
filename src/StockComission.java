import java.util.Scanner;


public class StockComission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
	double sharePrice;
	int numberOfShares;
	double stockCost;
	double commission;
	double total;
	
		
	System.out.println("Enter the share price");
	sharePrice = keyboard.nextDouble();
	
	if (sharePrice  < 1 || sharePrice > 500) {
		System.out.println("Invalid share price please enter a number between 1 & 500");
		keyboard.close();
	}
	
	
	System.out.println("Enter number of shares");
	numberOfShares = keyboard.nextInt();
	
	if (numberOfShares <100 || numberOfShares > 100000) {
		System.out.println("Invalind number please enter number betwee 100 & 100,000 ");
		keyboard.close();
	}
	
	stockCost =  sharePrice * numberOfShares;
	commission = stockCost * 0.045;
	total = stockCost + commission;
	
	System.out.println("Stock cost = $" + stockCost);
	System.out.println("Commission = $" + commission);
	System.out.println("Total = $" + total);
	
			
	
	
		
  		

	}

}
