class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>l=new ArrayList<>();
        int curr=1;
        for(int i:target){
            while(curr<i){
                l.add("Push");
                l.add("Pop");
                curr++;
            }
            l.add("Push");
            curr++;
        }
        return l;
    }
}