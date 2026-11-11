class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        List<Integer> nums = new ArrayList<>();
        
        for (int value : numbers) {
            nums.add(value);
        }
        for(int i=0;i<nums.size();i++){
            if(nums.contains(target - nums.get(i))) {
                            result[0] = i+1;
            result[1] = nums.indexOf(target - nums.get(i))+1;
            break;
            }

        }
        return result;
    }
}
