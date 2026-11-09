class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    void find(int index, int[] arr, int target,
              List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (index == arr.length || target < 0)
            return;
        list.add(arr[index]);
        find(index, arr, target - arr[index], list, ans);
        list.remove(list.size() - 1);
        find(index + 1, arr, target, list, ans);
    }
}
