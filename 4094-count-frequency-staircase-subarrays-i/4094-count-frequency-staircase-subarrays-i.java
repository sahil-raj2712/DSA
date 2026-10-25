class Solution {
    public int countStaircase(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            Map<Integer, Integer> freq = new HashMap<>();
            List<Integer> order = new ArrayList<>();
            for(int j =i;j<n;j++){
                int x =nums[j];
                if(!freq.containsKey(x)){
                    freq.put(x,0);
                    order.add(x);
                }
                freq.put(x, freq.get(x)+1);
                boolean valid = true;
                for(int p = 0;p<order.size();p++){
                    if(freq.get(order.get(p)) != p+1){
                        valid = false;
                        break;
                    }
                }
                if(valid){
                    ans++;
                }
            }
        }
        return ans;
    }
}