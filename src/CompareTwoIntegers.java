public class CompareTwoIntegers {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        if(a>b){
            System.out.println(a+" is bigger than "+b);
        }
        else{
            System.out.println(a+" is not greater than "+b);
        }

        System.out.println((a < b) ? "if block" : "else block");
        /*
          If can be replaced with a simple line having syntax:
          (condition) ? [//block of code to be executed] : [else code block]
         */
    }
}
