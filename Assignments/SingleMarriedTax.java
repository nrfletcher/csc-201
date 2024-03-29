import java.util.Scanner;
public class AnimalGreeting
{
   public static void main(String args[])
   {
	   final double RATE1 = 0.10;
	   final double RATE2 = 0.25;
	   final double RATE1_SINGLE_LIMIT = 32000;
	   final double RATE1_MARRIED_LIMIT = 64000;
	   
	   double tax1 = 0;
	   double tax2 = 0;
	   
	   Scanner in = new Scanner(System.in);
	   System.out.print("Please enter your income: ");
	   double income = in.nextDouble();
	   
	   System.out.print("Please enter s for single, m for married: ");
	   String maritalStatus = in.next();
	   
	   if (maritalStatus.equals("s"))
	   {
		   if (income <= RATE1_SINGLE_LIMIT)
		   {
		   tax1 = RATE1 * RATE1_SINGLE_LIMIT;
		   tax2 = RATE1 * (income - RATE1_SINGLE_LIMIT);
		   }
	   }
	   else
	   {
		   if (income <= RATE1_MARRIED_LIMIT)
		   {
			   tax1 = RATE1 * income;
		   }
		   else 
		   {
			   tax1 = RATE1 * RATE1_MARRIED_LIMIT;
			   tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
		   }
	   }
	   
	   double totalTax = tax1 + tax2;
	   
	   System.out.println("The tax is $"+ totalTax);
	   in.close();
   }

}
