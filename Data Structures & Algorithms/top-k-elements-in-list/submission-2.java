class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // int[] test = {1,1,1,2,2,3};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        System.out.println(map);//.keySet().stream().limit(k).toList());
        List<Integer> output =  map.entrySet().stream()
                                    .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed())
                                
                                    .map(entry -> entry.getKey())
                                    .limit(k).toList();
        return output.stream().mapToInt(i -> i ).toArray();
    }
}
