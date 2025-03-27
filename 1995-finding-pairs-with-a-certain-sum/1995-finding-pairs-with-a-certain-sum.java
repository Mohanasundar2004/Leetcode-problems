class FindSumPairs {
    int[] arr;
    int[] brr;
    Map<Integer,Integer>m=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr=nums1;
        brr=nums2;
        for(int n:brr){
            m.put(n,m.getOrDefault(n,0)+1);
        }
    }
    
    public void add(int index, int val) {
        m.put(brr[index],m.get(brr[index])-1);
        brr[index]+=val;
        m.put(brr[index],m.getOrDefault(brr[index],0)+1);
    }
    
    public int count(int tot) {
        int c=0;
        for(int i:arr){
            if(m.containsKey(tot-i)){
                c+=m.get(tot-i);
            }
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */