class Solution {
    public int[] twoSum(int[] nums, int target) {

        List<Integer> numList = new ArrayList<>();
        for(int i:nums) {
            numList.add(i);
        }
         int i=0;
         int j=0;
        for(int k : numList) {
            if (numList.contains(k) && numList.contains(target - k)) {
                i = numList.indexOf(k);
                j = numList.lastIndexOf(target - k);
                if (i == j) {
                    continue;
                }else {
                    System.out.println(i);
                    break;
                }
                
                
            }
        }
        return new int[]{i,j};
    }
}


