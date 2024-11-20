class Solution {
    public int solution(int n) {
        int count = 0;
        
        // 4부터 n까지 숫자 중 합성수를 찾기
        for (int i = 4; i <= n; i++) {
            if (isComposite(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    // 합성수인지 확인하는 함수
    public boolean isComposite(int num) {
        int divisorCount = 0;
        
        // num의 약수 개수 세기
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }
        
        // 약수가 3개 이상이면 합성수
        return divisorCount >= 3;
    }
}
