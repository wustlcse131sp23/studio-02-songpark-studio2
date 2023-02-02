import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Starting amount of money ");
		int startAmount = in.nextInt();
		int temp1 = startAmount;
		
			System.out.println("Winning chance: ");
		double winChance = in.nextDouble();
		
			System.out.println("Winning limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("Total simulations: ");
		
		int totalSimulations = in.nextInt();	
		while (totalSimulations > 0)
		{ 
			startAmount = temp1;
			int numberOfLoops = 0;
			while (startAmount > 0 && startAmount < winLimit)
				
			{
				double number = Math.random();
				if (number >= winChance)
				{
					startAmount+=1;
				}
				else 
				{
					startAmount-=1;
				}
				numberOfLoops++;
			}
			System.out.print(numberOfLoops);
			totalSimulations--;
			
			if (startAmount == winLimit)
			{
			System.out.println(": Success!");
			}
			else
			{
				System.out.println(": Ruin.");
			}
			
			
		}
		}
}
