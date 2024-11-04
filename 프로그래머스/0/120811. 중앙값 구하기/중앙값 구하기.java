class Solution {
   public static int solution(int[] array) {
       // 인덱스 : 0 1 2 3 4
       // 값 : {3,1,13,5,8}
       
        int n = array.length;  // 배열 길이 5
        int middleIndex = n / 2; // middleIndex = 2

        // 최솟값 찾기 
        for (int i = 0; i <= middleIndex; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // i번째 위치에 최소값을 위치시킴
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        // 중앙값 반환
        return array[middleIndex];
    }
}