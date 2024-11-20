import java.util.*;

public class Solution {
    public List<Integer> solution(String my_string) {
        // 숫자만 골라서 리스트에 담고, 오름차순으로 정렬하여 반환
        List<Integer> numbers = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(c - '0'); // 숫자 문자 '0'~'9'를 정수로 변환
            }
        }
        
        Collections.sort(numbers); // 오름차순 정렬
        return numbers;
    }
}
