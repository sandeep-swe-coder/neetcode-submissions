class Solution {
    public boolean hasDuplicate(int[] nums) {
        final Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            if(numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }
}