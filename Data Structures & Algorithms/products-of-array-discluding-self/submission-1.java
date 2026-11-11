class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int mul = 1;
        int numzeros = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] == 0){
                numzeros ++;
                continue;
            }
            mul = mul * nums[i];
        }   
        for(int i=0;i<nums.length;i++){
            if(numzeros > 1) {
                res[i] = 0;
            } else if(numzeros == 1 ) {
                if (nums[i]==0){
                    res[i] = mul;
                } else {
                    res[i]=0;
                }
            } else {
                res[i] = mul / nums[i];
            }
        }   
        return res;
    }
}  
