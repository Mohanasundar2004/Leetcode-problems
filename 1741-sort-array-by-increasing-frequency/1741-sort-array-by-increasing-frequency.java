class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        Collections.sort(l,(a,b)->
            (m.get(a)==m.get(b))? b-a :m.get(a)-m.get(b)
        );
        int j=0;
        for(int i:l){
            nums[j++]=i;
        }
        return nums;
    }
}