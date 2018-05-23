class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] s = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                s[1] = i;
                s[0] = map.get(target - nums[i]);
                return s;
            }
            map.put(nums[i],i);
        }
     return s;   
    }
}