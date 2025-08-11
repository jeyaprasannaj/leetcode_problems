class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[] = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i!=nums1.length && j!=nums2.length){
            if(nums1[i]<=nums2[j]){
                temp[k]=nums1[i];
                i++;
            }
            else{
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i!=nums1.length){
            temp[k]=nums1[i];
            i++;
            k++;
        }

        while(j!=nums2.length){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        int mid=temp.length/2;
        if(temp.length%2==0){
            double d1= temp[mid];
            double d2= temp[mid-1];
           return (d1+d2)/2;
        }
        else{
            return temp[mid];
        }
    }
}