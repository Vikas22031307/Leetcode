class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        int left=0,right=nums.length-1;
        int[] ans=new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            if(nums[left]>nums[right]){
                ans[i]=nums[left];
                left++;
            }else{
                ans[i]=nums[right];
                right--;
            }
        }
        return ans;
    }
}