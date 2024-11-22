class Solution:
    def maxSubArray(self, arr: List[int]) -> int:
        if not arr:  # Handle empty array case
            return 0
    
        max_current = max_global = arr[0]  # Initialize with the first element

    # Iterate over the array starting from the second element
        for num in arr[1:]:
            max_current = max(num, max_current + num)  # Either start new subarray or extend the current subarray
            max_global = max(max_global, max_current)  # Update global maximum

        return max_global