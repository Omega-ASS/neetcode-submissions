class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (results.containsKey(difference)){
                return new int[]{results.get(difference), i};
            }
            results.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
