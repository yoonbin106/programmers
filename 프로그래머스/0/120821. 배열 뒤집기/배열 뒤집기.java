class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] new_list = new int [len];
        for(int i=0;i<len;i++){
            new_list[i] = num_list[len-1-i];
        }
        return new_list;
    }
}