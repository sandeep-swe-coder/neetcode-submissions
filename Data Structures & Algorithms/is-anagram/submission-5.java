

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0;i<26;i++) {
            a[i] = 0;
        }
        for(int i=0;i<s.length();i++) {
            a[s.charAt(i)-97] = a[s.charAt(i)-97] +1;
        }
        for(int i=0;i<s.length();i++) {
            a[t.charAt(i)-97] = a[t.charAt(i)-97] - 1;
        }
        for(int i=0;i<26;i++) {
            if(a[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
