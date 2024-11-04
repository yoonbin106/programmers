class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;  // 홀수 개수 계산
        
        int[] result = new int[size];  // 홀수를 담을 배열 생성

        // 홀수를 찾고 배열에 저장
        int index = 0;  // 결과 배열의 인덱스
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                result[index] = i; 
                index++;  // 인덱스 증가
            }
        }
        
        return result;  // 결과 배열 반환
    }
}