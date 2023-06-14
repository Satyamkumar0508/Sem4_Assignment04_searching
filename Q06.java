import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q06 {
    static int findodd(int arr[]){
        Arrays.sort(arr);
        HashSet<Integer> nodu=new HashSet<>();
        int c=0;
        for(int p:arr){nodu.add(p);}
        for(int i:nodu){
            for(int j:arr){
                if(i==j){
                    c++;
                }
            }
            if(c%2!=0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int aa[]={
                1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,2
        };
        System.out.println(findodd(aa));
    }
}
