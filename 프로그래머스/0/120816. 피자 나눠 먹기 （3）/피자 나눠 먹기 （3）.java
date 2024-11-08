class Solution {
    public int solution(int slice, int n) {
        int a = n/slice;
        int b = n%slice;
        int answer = 0;
        if(b==0){
            answer = a;
        }
        else answer = a+1;
        return answer;
    }
    
}