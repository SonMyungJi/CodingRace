class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                result.add(nums[i]);
            }
        }
        int i=0;
        for (Integer item : result) {
            nums[i++] = item;
        }
        return result.size();
    }
}