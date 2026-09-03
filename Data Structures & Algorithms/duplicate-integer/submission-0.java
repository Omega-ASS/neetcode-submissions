class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dups = new HashSet<>();
        for (int i : nums){
            if (dups.add(i) == false){
                return true;
            }
        }
        return false;
    }
}