class Solution {
   public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
            
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int j =0; int k=0;
        for (int i=0;i<str.length();i++){
            
            if(str.charAt(i) == '#') {
                j = Integer.parseInt(""+str.substring(k,i))+(i+1);
                // j = Integer.parseInt(""+str.charAt(i-1))+(i+1);
                res.add(str.substring(i+1, j));
                i=j-1;  
                k=j;
            }
        }
        // System.out.println(res);  
        return res;
    }
    
    // public String encode(List<String> strs) {
    //     StringBuilder encodedString = new StringBuilder();
    //     for (String s: strs) {
    //         if(s.isEmpty()){
    //             encodedString.append("#");
    //         }
    //         for(int i=0;i<s.length();i++) {
    //             int ascii = (int)s.charAt(i) + 1;
    //             encodedString.append((char)ascii);
                
    //         }
    //         encodedString.append("-");
    //     }
    //     return encodedString.toString();
    // }

    // public List<String> decode(String str) {
    //     StringBuilder decodedString = new StringBuilder();
    //     Set<String> result = new LinkedHashSet<>();
    //     String[] strings = str.split("-",-1);
    //     for (String s: strings) {
    //         if(s.isEmpty()) {
    //             continue;
    //         }
    //         if(s.equals("#")) {
    //             result.add("");
    //             continue;
    //         }
    //         for(int i=0;i<s.length();i++) {
    //             int ascii = (int)s.charAt(i) - 1;
    //             decodedString.append((char)ascii);
                
    //         }
    //         result.add(decodedString.toString());
    //         decodedString = new StringBuilder();
    //     }
    //     return List.copyOf(result);
    // }
}
