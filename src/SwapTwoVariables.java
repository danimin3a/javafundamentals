public class SwapTwoVariables {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println("Before swap: a="+a+" b="+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("After swap: a="+a+" b="+b);
    }
}
