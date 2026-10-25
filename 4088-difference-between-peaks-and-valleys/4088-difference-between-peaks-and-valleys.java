class Solution {
    public int peakValleyDifference(int[] nums) {
        int[] peak = new int[nums.length];
        int[] valley = new int[nums.length];
        int k=0;
        int l=0;
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                peak[k]= nums[i];
                k++;
            }
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                valley[l]= nums[i];
                l++;
            }
            
        }
        int sum1 =0;
        for(int j=0;j<k;j++){
            sum1 += peak[j]; 
        }
        int sum2 = 0;
        for(int j=0;j<l;j++){
            sum2 += valley[j]; 
        }
        return sum1 - sum2;
    }
}