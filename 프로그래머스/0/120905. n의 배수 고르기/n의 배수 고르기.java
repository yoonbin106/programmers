class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int len1 = numlist.length;
        int len2 = 0;
        
        for (int i = 0; i < len1; i++) {
            if (numlist[i] % n == 0) {
                len2 += 1;
            }
        }
        int[] result = new int[len2];
        for (int i = 0; i < len1; i++) {
           
            if (numlist[i] % n == 0) {
                for (int j = 0; j < len2; j++) {
                    
                    if (result[j] == 0) {
                        result[j] = numlist[i];
                        break;
                    }
                }
            }
        }
        return result;
    }
}
