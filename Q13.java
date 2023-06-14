import java.util.Arrays;

public class Q13 {
    static void min(int[] arr1,int[] arr2) {
        int diff = Integer.MAX_VALUE;
        int p = 0;
        int q = 0;
        for (int i:arr1 ) {
            for (int j:arr2) {
                if(Math.max(i,j)-Math.min(i,j)<diff){
                    diff=Math.max(i,j)-Math.min(i,j);
                    p=Math.max(i,j);
                    q=Math.min(i,j);
                }
            }
        }
        System.out.println(diff);
        System.out.println("(" + p + "," + q + ")");
    }
    public static void main(String args[]){
        int aa[]={
               5,4,3,2
        };
        int bb[]={
                6,7,8,9
        };
        min(aa,bb);
    }
}
