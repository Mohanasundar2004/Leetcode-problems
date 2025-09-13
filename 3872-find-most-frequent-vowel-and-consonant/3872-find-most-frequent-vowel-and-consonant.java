class Solution {
    public int maxFreqSum(String s) {
        int c = 0;
        int v = 0;
       
        int[] a = new int[26];
        int res=0;

        for(int i=0;i<s.length();i++){
             int m = s.charAt(i)-'a';
             a[m]++;

         res = Math.max(a[0],Math.max(a[4],Math.max(a[8],Math.max(a[14],a[20]))));  
         if(m==0 || m==4 || m==8 || m==14 || m==20){
            continue;
         }
         else{
            // System.out.println(m+" "+v);
            v = Math.max(a[m],v);
         }        
        }
       
        return v+res;
    }
}