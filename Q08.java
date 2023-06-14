import java.sql.SQLOutput;
import java.util.HashSet;

public class Q08 {
  static int sum(int arr[]){
      HashSet<Integer> a=new HashSet<>();
      for (int i:arr){
          a.add(i);
      }
      int sum=0;
      for(int i:a){
          sum+=i;
      }
      return sum;
  }
    public static void main(String args[]){
        int aa[]={
                1,1,1,1,2,2,2,3,3,3,3,4,4,4,4,4
        };
        System.out.println(sum(aa));
    }
}
