import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        Map<Character, Integer> romanNum = new HashMap<Character, Integer>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
        for (int i=0; i<s.length(); i++) {
            if (i < s.length()-1) {
                if (romanNum.get(s.charAt(i)) < romanNum.get(s.charAt(i+1))) {
                    answer -= romanNum.get(s.charAt(i));
                } else {
                    answer += romanNum.get(s.charAt(i));
                }
            } else {
                answer += romanNum.get(s.charAt(i));
            }
        }
        return answer;
    }
}