class Solution {
    public static String solution(String my_string) {
       
        String result = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}