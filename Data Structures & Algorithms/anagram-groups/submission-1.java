class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> stoi = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedstr = new String(chars);
            System.out.println(sortedstr);
            if(stoi.containsKey(sortedstr)) {
                stoi.get(sortedstr).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                stoi.put(sortedstr, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        stoi.values().forEach( l -> {res.add(l.stream().map(i ->strs[i]).toList());});
        System.out.println(res);
        return res;

    }
}
