import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number: ");
        int n = in.nextInt();
        System.out.println((n % 3 == 0 && n % 5 == 0 ? "fizzbuzz" : n % 3 == 0 ? "fizz" : n % 5 == 0 ? "buzz":""));
    }
}
