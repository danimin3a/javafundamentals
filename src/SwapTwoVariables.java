public class SwapTwoVariables {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int c;
        System.out.println("Before swap: a="+a+" b="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swap: a="+a+" b="+b);
    }
}
