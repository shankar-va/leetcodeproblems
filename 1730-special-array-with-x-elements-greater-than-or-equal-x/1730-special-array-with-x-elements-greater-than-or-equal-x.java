class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int count=0;
            for(int num:nums){
                
                if(i<=num){
                    count++;
                }

            }if(i==count)return i;
        }return -1;
    }
}
