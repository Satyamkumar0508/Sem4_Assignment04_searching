import java.util.ArrayList;
import java.util.Arrays;

public class Q02 {
         static ArrayList<Integer> aa(int arr[]){
             ArrayList<Integer> aa=new ArrayList<>();
             Arrays.sort(arr);
             for(int i=0;i<arr.length-1;i++){
                 if(arr[i]==arr[i+1]){
                     if(!aa.contains(arr[i])){
                         aa.add(arr[i]);
                     }
                 }
             }
             return aa;
         }
         public static void main(String args[]){
             int arr[]={
                     2,2,1,1,3,4,5,6,7,89
             };
             System.out.println(aa(arr));
         }
}
