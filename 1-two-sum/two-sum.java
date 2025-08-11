
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // List<Integer> set=new ArrayList<>();
        // for(int i=0;i<nums.length,i++){
        //     list.add(nums[i]);
        // }
        // for(int i=0;i<nums.length;i++){
        //     int sum=target-nums[i];
        //     for(int element:nums){
        //         if(sum==element){
        //             return new int[]{i};
        //         }
        //     }
        // }





        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}