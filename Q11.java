public class Q11 {
    static void print(int arr1[],int arr2[],int value){
        for(int i:arr1){
            for(int j:arr2){
                if(i+j==value){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String args[]){
        int aa[]={
                1,2,3,4,5,6,7,8,9,10
        };
        int bb[]={
                1,2,3,4,5,6,7,8,9,10
        };
        print(aa,bb,19);
    }
}
