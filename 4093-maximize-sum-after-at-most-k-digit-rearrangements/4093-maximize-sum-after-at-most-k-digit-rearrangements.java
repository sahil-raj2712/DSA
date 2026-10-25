class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum =0;
         for(int num : nums){
             sum += num;
             
         }
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
            
        }
        Arrays.sort(arr, (a,b)-> Long.compare(rearrange(b)-b,rearrange(a)-a));
        for(int i=0;i<k;i++){
            sum -= arr[i];
            sum += rearrange(arr[i]);
        }
        return sum;
    }
    private long rearrange(int num){
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        long result = 0; 
        for(int i = digits.length -1;i>=0;i--){
            result = result * 10+(digits[i]-'0');
        }
        return result;
    }
}