class Solution {
    public String reverseOnlyLetters(String str) {
        char[] arr=str.toCharArray();
        int s=0;
        int e=str.length()-1;
    
        while(s<e){
            while(s<e && !Character.isLetter(str.charAt(s))){
            	s++;
            }
            while(s<e && !Character.isLetter(str.charAt(e))){
            	e--;
            }
            
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
            
        }
        return new String(arr);
    }
}