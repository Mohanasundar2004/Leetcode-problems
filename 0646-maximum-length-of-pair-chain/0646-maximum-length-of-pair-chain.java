class Solution {
    public int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1])) ;
       int min=Integer.MIN_VALUE,c=0;
       for(int[]arr:pairs){
        if(min<arr[0]){
            min=arr[1];
            c++;
        }
       }
       return c;
    }
}