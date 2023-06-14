//Given an unsorted list of n elements, find the first element, which is repeated.
public class Q01 {
    static int find(int arr[]){
        int c=0;
        for(int i:arr){
            for(int j:arr){
                if(i==j){
                    c++;
                }
            }
            if(c>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={3,1,9,5,4,2,3,4,5};
        System.out.println(find(arr));
    }
}
