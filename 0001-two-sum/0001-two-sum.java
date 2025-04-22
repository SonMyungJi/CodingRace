import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i=1; i<nums.length; i++) {
            for (int l=0; l<nums.length-1; l++) {
                if (i == l) {
                    continue;
                } else {
                    if (nums[i] + nums[l] == target) {
                        answer[0] = l;
                        answer[1] = i;
                    }
                }
            }
        }
        return answer;      
    }
}