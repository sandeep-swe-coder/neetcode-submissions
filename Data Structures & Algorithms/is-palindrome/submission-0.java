class Solution {
public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int i = 0;
        int j = str.length()-1;

        while(i<j) {
            if(!isAlphanumeric(str.charAt(i))) {
                i++;
                continue;
            }
            if(!isAlphanumeric(str.charAt(j))) {
                j--;
                continue;
            }
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
                continue;
            } else { return false;}
        }
        return true;
    }

    public boolean isAlphanumeric(char a){
        if((a >= 48 && a <= 57) || 
            (a>=65 && a<=90) ||
            (a>=97 && a<=122)) {
                return true;
            }
            return false;
    }
}
