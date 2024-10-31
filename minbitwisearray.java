class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            ans[i] = findSmallestValue(num);
        }
        
        return ans;
    }
    
    private int findSmallestValue(int num) {
        for (int i = 0; i <= num; i++) {
            if ((i | (i + 1)) == num) {
                return i;
            }
        }
        return -1;
    }
}
