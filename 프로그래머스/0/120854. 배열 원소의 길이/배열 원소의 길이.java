class Solution {
    public int[] solution(String[] strlist) {
        int[] lengths = new int[strlist.length]; //각 원소의 길이를 담을 새로운 배열 생성

        for (int i = 0; i < strlist.length; i++) {
            lengths[i] = strlist[i].length(); // 0번째 배열 길이 0번째 배열에 담기
        }

        return lengths;
    }
}