class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        current=0
        maxnum=0
        for num in nums:
            if num==1:
                current+=1
            else:
                maxnum=max(maxnum,current)
                current=0
        return max(current,maxnum)