class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for(int i : nums) {
            if(values.contains(i)) {
                return true;
            }
            values.add(i);
        }
        return false;
    }
}