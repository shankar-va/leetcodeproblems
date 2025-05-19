class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        if(nums[0]==nums[1] && nums[0]==nums[2]){
            return "equilateral";
        }else if((nums[0]==nums[1] && nums[0]!=nums[2] || nums[0]==nums[2] && nums[0]!=nums[1] || nums[1]==nums[2]) && (nums[0]+nums[1])>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            return "isosceles";
        }else if((nums[0]+nums[1])>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            return "scalene";
    }else return "none";
}
}