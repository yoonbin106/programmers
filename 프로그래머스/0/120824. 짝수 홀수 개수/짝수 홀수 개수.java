class Solution {
    public int[] solution(int[] num_list) {
        int[] result = {0,0};
        int len =  num_list.length;
        for (int i=0; i<len ; i++){
            if(num_list[i]%2==0){
                result[0] +=1;
            }
            else {
                result[1] +=1;
            }
        }
        return result;
    }
}