class Solution {
    public boolean checkIfPangram(String sentence) {
       int[] arr=new int[26];
       for(char i:sentence.toCharArray()){
        arr[i-'a']++;
       }
       for(int i:arr){
        if(i==0){
            return false;
        }
       }
       return true;
    }
}