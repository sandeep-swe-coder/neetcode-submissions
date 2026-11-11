class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }
        int l = 0;
        int r = 1;
        int maxLen = 1;
        Set<Character> set = new HashSet<>();
        while(r<s.length()) {
            set.add(s.charAt(l));
            if(set.contains(s.charAt(r))) {
                maxLen = Math.max(maxLen, set.size());
                l++;
                r=l;
                set = new HashSet<>();
            } else {
                set.add(s.charAt(r));
            }
            r++;
        }
        return Math.max(maxLen, set.size());
    }
}
