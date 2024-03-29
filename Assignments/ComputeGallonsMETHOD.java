import java.util.Scanner;
public class RandomStuff {
		 
		public static void main (String args[]) {
	        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length, width and height of room respectively:");

		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		sc.close();

		double area = computeArea(length, width, height);
		double money = computeGallons(area);
		System.out.println("Money needed is $" + money);

	}

		public static double computeArea(double len, double wid, double ht){
		double area = 2 * len * ht + 2 * wid * ht;
		return area;

	}

		public static double computeGallons(double area){
		double paintReq = area / 350;
		System.out.println(paintReq + " gallons of paint is needed");
		double moneyReq = Math.ceil(paintReq) * 32;
		return moneyReq;

	}

}
