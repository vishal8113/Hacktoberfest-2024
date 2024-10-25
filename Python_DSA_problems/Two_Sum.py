"""
Problem: Two Sum
Description: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Assume each input has exactly one solution, and you may not use the same element twice.
Example:
    Input: nums = [2, 7, 11, 15], target = 9
    Output: [0, 1]  # Because nums[0] + nums[1] = 2 + 7 = 9
"""

def two_sum(nums, target):
    # Dictionary to store number and its index
    num_to_index = {}
    for index, num in enumerate(nums):
        complement = target - num
        # Check if complement exists in dictionary
        if complement in num_to_index:
            return [num_to_index[complement], index]
        num_to_index[num] = index

# Example usage
if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    print("Indices:", two_sum(nums, target))  # Output: [0, 1]
