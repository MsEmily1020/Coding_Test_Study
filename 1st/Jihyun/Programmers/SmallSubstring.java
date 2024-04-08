class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i < t.length() - p.length() + 1; i++)
        	if(Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p))
        		answer++;
        
        return answer;
    }
}

public class SmallSubstring {
    public static void main(String args[]) {
        String a = "3141592";
        String b = "271";
        Solution s = new Solution();
        int result = s.solution(a, b);
        System.out.println(result);
    }
}