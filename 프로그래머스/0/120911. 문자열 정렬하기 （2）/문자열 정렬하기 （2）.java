public class Solution {
    public String solution(String my_string) {
        // 문자열을 모두 소문자로 변환하고 알파벳 순으로 정렬한 후 결과 반환
        return my_string.toLowerCase().chars()
                         .sorted()
                         .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                         .toString();
    }
}
