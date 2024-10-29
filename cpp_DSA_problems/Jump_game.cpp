// THIS IS A FAMOUS array QUESTION

// leetcode 55. Jump Game

// Solution

class Solution {
public:
    bool canJump(vector<int>& nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (maxReach >= nums.size() - 1) return true; // Check if we can reach the last index
            if (i > maxReach) return false; // If current index is beyond maxReach, we can't proceed
            if (i + nums[i] > maxReach) {
                maxReach = i + nums[i]; // Update maxReach
            }
        }
        return true; // If loop completes, we can reach the last index
    }
};
