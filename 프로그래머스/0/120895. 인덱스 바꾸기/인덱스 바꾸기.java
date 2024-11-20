public class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        // num1과 num2에 해당하는 문자를 교환
        char temp = sb.charAt(num1);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, temp);
        
        // StringBuilder를 다시 String으로 변환하여 반환
        return sb.toString();
    }
}
