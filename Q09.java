public class Q09 {
    static void min(int arr[]){
        int sum=Integer.MAX_VALUE;
        int int1=0;
        int int2=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int p=arr[i]+arr[j];
                if(Math.abs(p)<sum){
                    sum=p;
                    int1=arr[i];
                    int2=arr[j];
                }
            }
        }
        System.out.println("MIn:"+sum+"  int 1: "+int1+" int 2: "+int2);
    }
    public static void main(String args[]){
        int aa[]={
                -1,3,-7,6,-5,-9
        };
       min(aa);
    }
}
