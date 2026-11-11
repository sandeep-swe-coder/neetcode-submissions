class Solution {
public String minWindow(String s, String t) {
        if (t.length() == 0 || t.length()>s.length()) {
            return "";
        }
        // int start = 0;
        int len = t.length()-1;
        // int end = t.length();
        HashMap<Character, Integer> visited = convertToMap(t);
        while (len < s.length()){
            int start = 0;
            int end = len;
            while(end < s.length()) {
                HashMap<Character, Integer> temp = convertToMap(s.substring(start, end+1));
                String tempStr = s.substring(start,end+1);
                if(containsMap(temp, visited)) {
                    return s.substring(start,end+1);
                };
                start ++;
                end ++;
            }
            len++;
        }
        // for(l=0;l<=s.length()-t.length();l++) {
        //     for(r=t.length();r<=s.length();r++) {
        //         if(containsMap(convertToMap(s.substring(l, r)), visited)) {
        //             return s.substring(l,r);
        //         };
        //     }
        // }
        return "";
    }

    private HashMap<Character, Integer> convertToMap(String t) {
        HashMap<Character, Integer> visited = new HashMap<>();
        for(Character c : t.toCharArray()) {
            visited.put(c, visited.getOrDefault(c,0) + 1);
        }
        return visited;
    }

    public boolean containsMap(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        Optional<Character> match = map2.entrySet().stream()
        .filter ( entry -> { 
                Character c = entry.getKey();
                Integer val1 = entry.getValue();
                Integer val2 = map1.get(c);
                return  !(val1!=null && val2!=null && (val1<=val2));
            })
            .map(Map.Entry::getKey)
            .findAny();
        // .filter(key -> !(entry.getValue() <= map1.get(key)))
        // .findAny();

        return !match.isPresent();
    }
}
