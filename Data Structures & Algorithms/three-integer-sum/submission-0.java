class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> soln = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    if ( nums[i]+nums[j]+nums[k] == 0){
                        soln.add(List.of(nums[i],nums[j],nums[k]).stream().sorted().toList());
                    }
                }
            }
        }
        return soln.stream().distinct().toList();
    }
}
