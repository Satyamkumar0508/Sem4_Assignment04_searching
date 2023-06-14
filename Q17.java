import java.util.Arrays;

public class Q17 {
    static int second(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String args[]){
        int aa[]={
                1,2,3,4,5,6,7,8,9,10
        };
        System.out.println(second(aa));
    }
}
