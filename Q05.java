import java.util.*;

public class Q05 {
    static void findd(int arr[]){
          Arrays.sort(arr);
          ArrayList<Integer> ap=new ArrayList<>();
          for(int i:arr){ap.add(i);}
          System.out.println("Min:"+arr[0]);
          System.out.println("Max:"+arr[arr.length-1]);
        for(int a=arr[0];a<arr[arr.length-1];a++){
            if(!ap.contains(a)){
                System.out.print(a+" ");
            }

        }
    }
    public static void main(String args[]){
        int aa[]={
                1,2,3,4,5,6,7,9
        };
       findd(aa);
    }
}
