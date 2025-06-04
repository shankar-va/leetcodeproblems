class Solution {
    public int findNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
           int num= nums[i];
           int count=0;
            while(num>0){
                int digit=num%10;
                count++;
                num/=10;
            }nums[i]=count;
            i++;
            
        }int even_count=0;
         i=0;
        while(i<nums.length){
            if(nums[i]%2==0){
                even_count++;
            }i++;
        }
    return even_count;
    }
}