import java.util.HashSet;

public class Q03 {
    static HashSet<Integer> aa(int a[]){
        HashSet<Integer> dup=new HashSet<>();
        for(int i:a){
            dup.add(i);
        }
        return dup;
    }
    public static void main(String args[]){
        int aa[]={
                1,1,2,2,3,4,5,6,6,6,67,88,8,8,8,89,67,5,54,3,3,2,2,12
        };
        System.out.println(aa(aa));
    }
}
