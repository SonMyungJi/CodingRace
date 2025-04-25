import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest = strs[0];
        int length = strs[0].length();
        for (String str : strs) {
            if (str.length() < length) {
                shortest = str;
                length = str.length();
            }
        }
        String[] rows = new String[length];
        for (int i=0; i<length; i++) {
            rows[i] = shortest.substring(0, i+1);
        }
        String answer = "";
        for (String row : rows) {
            Boolean isAllStartWith = true;
            for (String str : strs) {
                if (!str.startsWith(row)) {
                    isAllStartWith = false;
                    break;
                }
            }
            if (isAllStartWith) {
                answer = row;
            }
        }
        return answer;
    }
}