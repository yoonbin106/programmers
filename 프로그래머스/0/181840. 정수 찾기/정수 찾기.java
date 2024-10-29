class Solution {
    public int solution(int[] num_list, int n) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                return 1; // 모든 배열 순회
            }
        }
        return 0; // 모두 순회해도 없으면 다 빠져나와서 0 리턴
    }
}