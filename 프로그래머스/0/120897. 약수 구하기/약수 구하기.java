import java.util.*;

public class Solution {
    public int[] solution(int n) {
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i); // n의 약수인 i를 리스트에 추가
            }
        }
        
        // List를 int[] 배열로 변환하여 반환
        return divisors.stream().mapToInt(i -> i).toArray();
    }
}
