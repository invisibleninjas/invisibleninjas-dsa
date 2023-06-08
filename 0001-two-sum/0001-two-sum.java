import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>hm = new HashMap<>();
        for (int i= 0;i<nums.length;i++){
            int opp = target - nums[i];
            if(hm.containsKey(opp)) {
                return new int[] {hm.get(opp),i};
            }else{
                hm.put(nums[i],i);
            }
        }
        return null;
        
    }
}