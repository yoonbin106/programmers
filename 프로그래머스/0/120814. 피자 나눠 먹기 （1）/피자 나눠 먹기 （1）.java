class Solution {
    public int solution(int n) {
        int pizza = 0;
        for (int i=1; i<16; i++){
            if((i-1)*7 < n && i*7 >= n){
               pizza = i;
            }
        }
        return pizza;
    }
}