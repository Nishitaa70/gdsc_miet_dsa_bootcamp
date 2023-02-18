package operators;
import java.util.*;
import java.io.*;

public class findDuplicate {
    public static int solution(int[] nums){
        //first sort array
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n+1];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(solution(nums));
    }
}
