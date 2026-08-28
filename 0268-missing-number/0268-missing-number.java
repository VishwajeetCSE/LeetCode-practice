class Solution {
    public int missingNumber(int[] nums) {
        long arsum =0;
        long n = nums.length;
       long nsum = n*(n+1)/2;
        for(int i=0; i< n; i++){
            arsum += nums[i];
        }
        return (int)(nsum - arsum);
    }
}