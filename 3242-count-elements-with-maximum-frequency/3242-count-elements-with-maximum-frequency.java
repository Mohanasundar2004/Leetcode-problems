class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length,c=0,max=Integer.MIN_VALUE,m=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int[] fre=new int[max+1];
        for(int i:nums){
            fre[i]++;
            m=Math.max(m,fre[i]);
        }
        for(int i:nums){
            if(m==fre[i]){
                c++;
            }
        }
        return c;
    }
}