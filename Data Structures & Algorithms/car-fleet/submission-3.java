class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
        // Map<Integer, Integer> groups = new TreeMap<>(new Comparator<Integer>(){
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o1.compareTo(o2);
        //     }}.reversed());
        Map<Integer, Integer> groups = new HashMap<>();
        for(int i=0;i<position.length;i++) {
            groups.put(position[i], speed[i]);
            // float nofHours = (target - position[i])/speed[i];
            // groups.put(nofHours, groups.getOrDefault(nofHours, 0)+1);
        };
        Map<Integer,Integer> sortedGroups = groups.entrySet().stream()
            .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getKey).reversed())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
                (oldValue, newValue) -> oldValue, 
                LinkedHashMap::new 
            ));
        
        int count = 0;
        double maxTime = Double.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : sortedGroups.entrySet()) {
            double time = (double)(target - entry.getKey())/entry.getValue();

            if(time > maxTime) {
                maxTime = time;
                count++;
            }
        }
        
        
        return count;
    }
}