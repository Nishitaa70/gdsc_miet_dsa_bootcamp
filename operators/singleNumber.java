package operators;
import java.util.*;
import java.io.*;

public class singleNumber {
    public static int solution(int[] nums){
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                ans = nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        int result = solution(nums);
        System.out.println(result);
    }
}
