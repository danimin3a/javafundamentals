import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert year");
        int year = in.nextInt();
        System.out.println((year % 4 == 0)  && (year % 100 != 0) || (year % 400 == 0) ? year + " is leap year" : "is not leap year");
    }
}
