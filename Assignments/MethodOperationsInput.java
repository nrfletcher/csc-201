import java.util.Scanner;

public class RandomStuff {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	    
	       int num1 = sc.nextInt();
	       int num2 = sc.nextInt();
		       
		      displayTwiceTheNumber(num1);
		      displayNumberPlusFive(num1);
		      displayNumberSquared(num1);
		      displayTwiceTheNumber(num2);
		      displayNumberPlusFive(num2);
		      displayNumberSquared(num2);
		      sc.close();
		   }
		   public static void displayTwiceTheNumber(int n)
		   {
		      final int FACTOR = 2;
		      System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
		   }
		   public static void displayNumberPlusFive(int n)
		   {
		      final int FACTOR = 5;
		      System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
		   }
		   public static void displayNumberSquared(int n)
		   {
		      System.out.println(n + " squared is " + (n * n)); 
		   }	
	    }
