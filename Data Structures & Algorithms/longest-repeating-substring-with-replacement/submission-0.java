class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<Character,Integer>();
        
        
        int leftIndex = 0 ;
        int rightIndex = 0;
        
        int maxLen = 0;
        int res = 0;
        
        while (rightIndex<s.length()) {
            count.put(s.charAt(rightIndex), count.getOrDefault(s.charAt(rightIndex),0) + 1);
            maxLen = Math.max(count.get(s.charAt(rightIndex)), maxLen);
            
            while(rightIndex-leftIndex+1-maxLen > k) {
                count.put(s.charAt(leftIndex), count.get(s.charAt(leftIndex))-1);
                leftIndex++;
            }

            res = Math.max(res, rightIndex-leftIndex+1);
            
            rightIndex++;
        }
        return res;
    }
}
