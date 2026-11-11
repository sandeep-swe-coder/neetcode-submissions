class Solution {
    public boolean isAnagram(String s, String t) {
        final Map<String, Integer> countMap = new HashMap<>();
        if (s.length() != t.length() ) {
            return false;
        }
        for(int i=0;i<s.length();i++) {
            int count = countMap.getOrDefault(String.valueOf(s.charAt(i)), 0);
            countMap.put(String.valueOf(s.charAt(i)), ++count);
        }
        System.out.println(countMap);
        for(int i=0;i<t.length();i++) {
            if (countMap.get(String.valueOf(t.charAt(i))) == null 
                    || countMap.get(String.valueOf(t.charAt(i))) == 0) {
                        System.out.println(t.charAt(i));
                        System.out.println(countMap);
                return false;
            }
            int count = countMap.get(String.valueOf(t.charAt(i)));
            countMap.put(String.valueOf(t.charAt(i)), --count);
        }
        System.out.println(countMap);
        for(int count:countMap.values()) {
            if (count > 0) {
                return false;
            }
        }
        return true;
    }
}
