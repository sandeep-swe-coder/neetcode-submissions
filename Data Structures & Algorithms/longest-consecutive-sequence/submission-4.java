class Solution {
public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.stream(nums).distinct().sorted();
        Set<Integer> a = new TreeSet<>();
        for (int i = 0;i<nums.length;i++) {
            a.add(nums[i]);
        }
        List<Integer> l = new ArrayList<>();
        l.addAll(a);
        int maxCount = 1;
        for (int i = 0;i<l.size();i++) {
            int count = 1;
            for (int j = i+1;j<l.size();j++) {
                if (l.get(j) == l.get(j-1) + 1) {
                    count ++;
                } else {
                    i = j-1;
                    break;
                    
                }
                maxCount = Math.max(maxCount, count);
            }
            
            
        }
        return maxCount;
    }
}
