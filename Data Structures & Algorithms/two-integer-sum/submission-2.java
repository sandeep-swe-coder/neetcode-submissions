class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++) {

            if(map.containsKey(target - nums[i])) {
             
                return map.get(target - nums[i]) > i 
                ? new int[]{i, map.get(target - nums[i])}
                : new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
