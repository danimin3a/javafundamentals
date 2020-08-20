package Arrays;

public class AvgValueArray {
    public static void main(String[] args) {
        int[] n=new int[]{1,7,3,10,9};
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        System.out.println(sum/n.length);
    }
}
