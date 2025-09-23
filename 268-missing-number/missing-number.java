class Solution {
    public int missingNumber(int[] nums) {
        int totalSum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
            sum+=i+1;
        }
        return sum-totalSum;

        // List<Integer> list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     list.add(nums[i]);
        // }
        // for(int i=0;i<=nums.length;i++){
        //     if(!list.contains(i)){
        //         return i;
        //     }
        // }
        // return -1;
    }
}