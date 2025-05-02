class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        for (int i=0; i<haystack.length(); i++) {
            String change = haystack.substring(i);
            if (change.startsWith(needle)) {
                result = i;
                break;
            }
        }
        return result;
    }
}