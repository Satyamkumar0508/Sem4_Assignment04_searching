 public class Q15 {
    static void trip(int arr[],int value){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==value){
                        System.out.println("(" + arr[i] + " , " + arr[j] + " , " +arr[k]+ ")");
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int aa[]={
                1,2,3,4,5,6,7,8,9,10
        };
        trip(aa,19);
    }
}
