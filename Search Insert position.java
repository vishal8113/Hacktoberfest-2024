class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length,s=0,e=l;
        while(s<e)
        {
            //c1=s;c2=e;
            //if(c1!=0&&c2!=(l-1))
               //return s;
            int mid= (s+e)/2;
            if(target==nums[mid])
                return mid;
            if(nums[mid]<target)  
                s=mid+1;
            else
                e=mid;      
            }
            return s;
        }
    public static void main(String args[]){
        Solution obj = new Solution();
        int nums[]={2,34,67,89,90};
        System.out.println(obj.searchInsert(nums,13));
    }
}