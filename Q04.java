public class Q04 {
    static int find(int arr[]){
        int n=arr.length+1;
        int actual=0;
        int factual=(n*(n+1)/2);
        for(int i:arr){
            actual+=i;
        }
        return factual-actual;
    }
    public static void main(String args[]){
        int aa[]={
                1,2,3,4,5,6,7,9
        };
        System.out.println(find(aa));
    }
}
