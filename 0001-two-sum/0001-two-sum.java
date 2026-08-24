class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop scans each number
        for (int i = 0; i < nums.length; i++) {
            // Inner loop scans the remaining numbers
            // Note: 'nums.length' is used here instead of 'num.length'
            for (int j = i + 1; j < nums.length; j++) {
                // Note: 'nums' is used here instead of 'arr'
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; 
                }
            }
        }
        return new int[] {}; 
    }
}
