class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n>0){
            answer += n % 10; // 10으로 나눈 나머지구하면 일의 자릿수 나옴
            n /= 10; // 전체를 10으로 나눠서 다음 자릿수로 넘어가기
        }
        return answer;
    }
}