class Solution {
    public int[] solution(int[] array) {
        
        int[] result = new int[2];
        int len = array.length;
        int max = array[0];
        int maxIndex = 0;
        for (int i=1; i<len; i++){
            if (array[i]>max){
                max = array[i];
                maxIndex = i;
                
            }
    }
        result[0] = max;
        result[1] = maxIndex;
        
        return result;
    }
}