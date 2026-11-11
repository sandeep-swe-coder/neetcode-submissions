class Solution {
public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(char c : s.toCharArray()) {
            if(st.isEmpty() && isClosingBrace(c)) {
                return false;
            }
            if(isClosingBrace(c) && st.peek() != getMatchingBrace(c)){
                return false;
            }
            if(isClosingBrace(c)) {
                st.pop();
                continue;
            }
            st.push(c);
        
        }
        return st.isEmpty();
    }

    public boolean isClosingBrace(char c) {
        return (c==')' || c==']' || c=='}');
    }

    public char getMatchingBrace(char c){ 
        switch(c) {
            case ')': return '(';
            case ']': return '[';
            case '}': return '{';
            default:  return ' ';
        }
    }
}
