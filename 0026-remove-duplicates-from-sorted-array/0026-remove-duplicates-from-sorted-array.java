import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> countsByNumber = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (countsByNumber.containsKey(num)) {
                countsByNumber.put(num, countsByNumber.get(num) + 1);
            } else {
                countsByNumber.put(num, 1);
            }
        }

        Set<Integer> keys = countsByNumber.keySet();
        int i = 0;
        for (int key : keys) {
            nums[i++] = key; 
        }
        
        return countsByNumber.size();
    }
}