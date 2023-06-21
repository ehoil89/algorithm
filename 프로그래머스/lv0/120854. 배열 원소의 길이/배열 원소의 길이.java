import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        // answer[0] = strlist[0].length
        
        for (int i = 0; i <= strlist.length - 1; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}