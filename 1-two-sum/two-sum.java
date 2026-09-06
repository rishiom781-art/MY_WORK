class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
            
        }
        return new int[0];

        
    }
}