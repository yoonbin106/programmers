import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int case1 = numbers[0] * numbers[1];
        int case2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        return Math.max(case1, case2);
    }
}