 public class Q10 {
    static void print(int arr[],int value){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if((arr[i]+arr[j])==value){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String args[]){
        int aa[]={
                1,2,3,4,5,6,7,8,9,10
        };
        print(aa,19);
    }
}
