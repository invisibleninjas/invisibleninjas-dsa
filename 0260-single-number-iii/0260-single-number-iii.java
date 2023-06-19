class Solution {
    public int[] singleNumber(int[] nums) {
        int XOR = 0;
        int x =0,y=0 ;
        //y =0;
        for(int i = 0; i<nums.length;i++){
            XOR = XOR ^ nums[i];
        }
        int setBit = XOR & ~ (XOR - 1);
        for (int i = 0; i<nums.length ; i++){
            if((nums[i]&setBit) != 0){
                x = x^nums[i];
            }
            else{
                y = y^nums[i];
            }
        
        }
        return new int[] {x,y};
    }
}