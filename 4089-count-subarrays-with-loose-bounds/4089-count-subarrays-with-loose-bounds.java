class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count =0;
        long total =0;
        int left = 0;
        for(int r =0;r<nums.length;r++){
            if(nums[r]<minK || nums[r]> maxK){
                left = r+1;
            }
            total += r-left+1;
            count += r-left+1;
        }
        return count;
    }
}