import java.util.Scanner;

public class NumberOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a number for A:");
        int A = in.nextInt();
        System.out.println((A % 2 == 0 ? "A is even" : "A is odd"));
    }
}
