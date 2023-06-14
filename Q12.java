import java.util.Arrays;

public class Q12 {
    static void min(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        int p = 0;
        int q = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]-arr[i]<diff){
                    diff = arr[j] - arr[i];
                        p = arr[j];
                        q = arr[i];
                    }
                    }
                }
        System.out.println(diff);
        System.out.println("(" + p + "," + q + ")");
            }

    public static void main(String args[]) {
        int aa[] = {
                5, 3, 8, 4, 10
        };
        min(aa);

    }
}
