package operators;
import java.util.*;

public class missingNumber {

    public static int misNum(int A[], int N){
        //summation of n elements
        int sum = (N*(N+1))/2;
        // loop to subtract array elements from summation
        for(int i = 0; i < N; i++){
            sum -= A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] A = new int[N];
        for(int i = 0; i < A.length-1; i++){
            A[i] = in.nextInt();
        }
        int ans = misNum(A, N);
        System.out.println(ans);
    }
}
