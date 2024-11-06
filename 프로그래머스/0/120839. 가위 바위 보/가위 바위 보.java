public class Solution {
    public String solution(String rsp) {
        // 결과를 저장할 StringBuilder 생성
        StringBuilder result = new StringBuilder();

        // rsp 문자열의 각 문자에 대해 변환
        for (int i = 0; i < rsp.length(); i++) {
            char move = rsp.charAt(i); // 현재 문자
            if (move == '2') {
                result.append('0'); // 가위(2)를 이기는 것은 바위(0)
            } else if (move == '0') {
                result.append('5'); // 바위(0)를 이기는 것은 보(5)
            } else if (move == '5') {
                result.append('2'); // 보(5)를 이기는 것은 가위(2)
            }
        }
        
        // 변환된 결과를 문자열로 반환
        return result.toString();
    }
}