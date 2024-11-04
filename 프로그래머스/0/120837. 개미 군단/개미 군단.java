class Solution {
    public int solution(int hp) {
        int result=0;
        int a = hp/5;
        int b = hp%5; 
        if(b==0){
            result = a;
        }
        else if(b<3){
            result = a + b;
        }
        else if(b<5){
            result = a + 1 + b%3;
        }
        return result;
    }
}