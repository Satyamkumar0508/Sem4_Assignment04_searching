public class Q07 {
public static void findOddOccurring(int[] arr) {
    int xor=0,x=0,y=0;
    for(int i:arr){
        xor^=i;
    }
    int set=xor & ~(xor-1);
    for(int j=0;j<arr.length;j++){
        if((arr[j] & set)!=0){
            x^=arr[j];
        }
        else{
            y^=arr[j];
        }
    }

    System.out.println( x + " and " + y);
}
    public static void main(String args[]){
        int aa[]={
                1,1,1,1,2,2,2,3,3,3,3,4,4,4,4,4
        };
        findOddOccurring(aa);
    }
}
