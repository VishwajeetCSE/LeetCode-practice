class Solution {
    public int missingNumber(int[] nums) {
        int arsum =0;
        int n = nums.length;
       int nsum = n*(n+1)/2;
        for(int i=0; i< n; i++){
            arsum += nums[i];
        }
        return nsum-arsum;
    }
}