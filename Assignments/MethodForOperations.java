public class NumbersDemo {
    public static void main (String args[]) {
        int n1 = 5;
        int n2 = -3;
        displayTwiceTheNumber(n1);
        displayTwiceTheNumber(n2);
        displayNumberPlusFive(n1); 
        displayNumberPlusFive(n2); 
        displayNumberSquared(n1);
        displayNumberSquared(n2);
    }
    public static void displayTwiceTheNumber(int n) {
        System.out.println(n * 2);
    }
    public static void displayNumberPlusFive(int n) {
        System.out.println(n +5);
    }
    public static void displayNumberSquared(int n) {
        System.out.println(n *n);

    }
}
