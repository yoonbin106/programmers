class Solution {
    public int[] solution(int n, int[] numlist) {
        // n으로 나누어 떨어지는 수의 개수 계산
        int len1 = numlist.length;
        int len2 = 0;

        // numlist에서 n으로 나누어 떨어지는 수의 개수를 세기
        for (int i = 0; i < len1; i++) {
            if (numlist[i] % n == 0) {
                len2 += 1;
            }
        }

        // 결과 배열 생성
        int[] result = new int[len2];

        // numlist에서 n으로 나누어 떨어지는 수를 결과 배열에 추가
        for (int i = 0; i < len1; i++) {
            // 중첩 루프를 사용하여 결과 배열에 값을 추가
            if (numlist[i] % n == 0) {
                for (int j = 0; j < len2; j++) {
                    // 결과 배열에 첫 번째로 빈 인덱스에 할당
                    if (result[j] == 0) { // 초기화된 상태 체크 (0으로 초기화된 경우)
                        result[j] = numlist[i];
                        break; // 값을 할당한 후 루프 탈출
                    }
                }
            }
        }

        return result;
    }
}
