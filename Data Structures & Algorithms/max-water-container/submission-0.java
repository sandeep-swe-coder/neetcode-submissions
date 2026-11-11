class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for(int i=0;i<heights.length-1;i++){
            for(int j=0;j<heights.length;j++) {
                int length = Math.min(heights[i],heights[j]);
                int breadth = j-i;
                maxArea = Math.max(maxArea, length*breadth);
            }
        }
        return maxArea;
    }
}
