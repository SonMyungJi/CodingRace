import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numByTh = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (numByTh.containsKey(complement)) {
                return new int[]{i, numByTh.get(complement)};
            }
            numByTh.put(nums[i], i);
        }
        return new int[]{};
    }
}