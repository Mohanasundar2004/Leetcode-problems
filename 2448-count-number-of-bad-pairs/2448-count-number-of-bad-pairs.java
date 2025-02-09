class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long c=0,t=(long)n*(n-1)/2;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int k=nums[i]-i;
            if(m.containsKey(k)){
                c+=m.get(k);
            }
            m.put(k,m.getOrDefault(k,0)+1);
        }
        return t-c;
    }
}