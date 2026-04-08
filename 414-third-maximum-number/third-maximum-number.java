class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for(int n:nums){
            if(n>max){
                tmax=smax;
                smax=max;
                max=n;
            }
            else if(n>smax && n!=max){
                tmax=smax;
                smax=n;
            }
            else if(n>tmax && n!=max && n!=smax){
                tmax=n;
            }
        }
        
        return tmax!=Long.MIN_VALUE?(int)tmax:(int)max;
    }
}