public class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int a = 1; a * a <= n; a++) {
            if (n % a == 0) {
                count++;
                if (a != n / a) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
