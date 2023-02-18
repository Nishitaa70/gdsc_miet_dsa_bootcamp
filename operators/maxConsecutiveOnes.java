package operators;
import java.util.*;
import java.io.*;

public class maxConsecutiveOnes {
    public static int solution(int N){
        int count = 0;
        while(N!=0){
            N = N & (N << 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int n = input.nextInt();
            System.out.println(solution(n));
        }
    }
}

