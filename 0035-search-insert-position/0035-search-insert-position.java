import java.util.*;

class Solution {
    public int searchInsert(int[] nums, int target) {
        Map<Integer, Integer> interval = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            interval.put(nums[i] - target, i);
        }
        int minKey = interval.keySet().stream().min(Comparator.comparingInt(Math::abs)).get();
        if (minKey < 0) {
            return interval.get(minKey) + 1;
        }
        return interval.get(minKey);
    }
}