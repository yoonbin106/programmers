class Solution {
    public int solution(String my_string) {
        int sum=0;
        
        for (int i=0;i<my_string.length();i++){
            char c=my_string.charAt(i); //문자열 순회
            
            if(Character.isDigit(c)){ //Charcter.isDigit() -> 숫인지 판단
                sum += Character.getNumericValue(c); // 숫자일경우 숫자로 변환후 sum에 더함
            }
        }
        return sum;
    }
}
