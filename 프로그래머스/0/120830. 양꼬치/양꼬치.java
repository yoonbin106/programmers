class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(n<10) {answer = (12000*n) + (2000*k);}
        else {answer = ((12000*n) + (2000*k))-((n/10)*2000);} // 어차피 정수 나눗셈에서 몫이 0이면 뒤의 *2000도 0이므로 범위 필요없음
        return answer;
    }
}
